(ns euler.problem-006
  (:use [euler.util :only [sum]]))

;; Elapsed time: 3.825097 msecs
(time (int (- (Math/pow (sum (range 1 101)) 2) (sum (map #(Math/pow % 2) (range 1 101))))))

