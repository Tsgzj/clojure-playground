(ns clojure-playground.4clojure_03x)

;; for problem 030~039

(defn n38
  "https://www.4clojure.com/problem/38 Maximum Value"
  [& arg] (reduce (fn [x y] (if (> x y) x y)) arg))
