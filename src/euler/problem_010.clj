(ns euler.problem-010
  (:use [clojure.contrib.lazy-seqs :only [primes]]
        [euler.util :only [sum]]))

;; Elapsed time: 20662.248839 msecs
(time (sum (take-while (partial >= 2000000) primes)))

