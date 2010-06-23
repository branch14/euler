(ns euler.problem-007
  (:use [clojure.contrib.lazy-seqs :only [primes]]))

;; Elapsed time: 444.586791 msecs
(time (first (drop 10000 primes)))

