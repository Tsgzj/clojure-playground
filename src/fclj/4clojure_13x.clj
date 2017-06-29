(ns fclj.4clojure-13x)

(defn n131
  [& x]
  (if (== 1 (count x))
    true
    (letfn [(ps [s]
              (remove empty?
                      (reduce (fn [sets el]
                                (into sets
                                      (map #(conj % el) sets)))
                              #{#{}} s)))]
      (not
       (empty?
        (apply clojure.set/intersection
               (map
                (fn [a]
                  (set (map #(reduce + %) (ps a))))
                x)))))))

(defn n135
  [val & args]
  (reduce
   (fn
     [a [f b]]
     (f a b))
   val
   (partition 2 args)))

(defn n137
  "Digits and bases"
  [n b]
  (if (< n b)
    [(rem n b)]
    (conj (n137 (quot n b) b) (rem n b))))

(defn n137-recur
  [n b]
  (loop [a (quot n b)
         b b
         r [(rem n b)]]
    (if (zero? a)
      r
      (recur (quot a b) b (cons (rem a b) r)))))
