(ns euler.problem-020
  (:use [euler.util :only [digits sum]]))

(defn factorial [] (map first (iterate (fn [[a b]] [(* a b) (inc b)]) [1 1])))

;; Elapsed time: 4.547014 msecs
(time (sum (digits (first (drop 99 (factorial))))))

