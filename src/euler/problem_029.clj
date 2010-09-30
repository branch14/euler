(ns euler.problem-029
  (:use [euler.util :only [whole-numbers sum digits]]))

(def ab (range 2 101))

(time (count (distinct (mapcat (fn [b] (map (fn [e] (Math/pow b e)) ab)) ab))))

;; "Elapsed time: 51.724258 msecs"
;; 9183
