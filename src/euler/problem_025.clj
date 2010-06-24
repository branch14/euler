(ns euler.problem-025
  (:use [clojure.contrib.lazy-seqs :only [fibs]]
        [euler.util :only [digits]]))

;; Elapsed time: 2772.41655 msecs
(time (count (take-while #(< (count (digits %)) 1000) (fibs))))
