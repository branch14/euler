(ns euler.problem-002
  (:use [euler.util :only [sum]]))

(defn fibo [] (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

;; Elapsed time: 0.578501 msecs
(time (sum (filter even? (take-while (partial > 4000000) (fibo)))))

