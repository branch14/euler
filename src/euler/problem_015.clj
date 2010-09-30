(ns euler.problem-015
  (:use [euler.util :only [sum digits]]))

;; Starting in the top left corner of a 2×2 grid, there are 6 routes
;; (without backtracking) to the bottom right corner.
;;
;; How many routes are there through a 20×20 grid?
;;
;;   1
;;   1   2 
;;   1   3   6
;;   1   4  10  20
;;   1   5  15  35  70
;;   1   6  21  56 126 252
;;   1   7  28 ...
;; ...
;; ... 35345263800

;; Elapsed time: 1.46098 msecs
(time
 (last
  (first
   (drop 20 (iterate
             (fn [l] (let [c (reduce (fn [a b] (conj a (+ b (last a)))) [1] (rest l))]
                       (conj c (* 2 (last c)))))
             [1])))))