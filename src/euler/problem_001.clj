(ns euler.problem-001
  (:use [euler.util :only [sum]]))

;; Elapsed time: 4.610807 msecs
(time (sum (filter (fn [x] (zero? (* (mod x 3) (mod x 5)))) (range 1000))))
