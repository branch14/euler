(ns euler.problem-030
  (:use [euler.util :only [whole-numbers sum digits]]))

;; cbwasonp? - can be written as sum of nth power
(defn cbwasonp? [n i]
  (= i (sum (map #(Math/pow % n) (digits i)))))

;; drop 0 & 1, number of 6 determined emperically
(time (sum (take 6 (drop 2 (filter (partial cbwasonp? 5) whole-numbers)))))

;; "Elapsed time: 3131.045805 msecs"
;; 443839


