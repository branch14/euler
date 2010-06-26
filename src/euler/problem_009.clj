(ns euler.problem-009
  (:use [euler.util :only [product]]))

(defn sqr [x] (Math/pow x 2))

(defn pyth? [a b c] (= (sqr c) (+ (sqr b) (sqr a))))

(defn find-pyth [s]
  (loop [a s
         b (dec a)]
    (let [c (- s a b)]
      (if (pyth? a b c)
        [a b c]
        (if (= 1 b)
          (recur (dec a) (- a 2))
          (recur a (dec b)))))))

;; Elapsed time: 405.314792 msecs
(time (product (find-pyth 1000)))