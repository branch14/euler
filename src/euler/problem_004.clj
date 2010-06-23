(ns euler.problem-004)

(defn palindrom? [x] (let [s (str x)] (= s (apply str (reverse s)))))

;; Elapsed time: 4304.332834 msecs
(time (apply max (filter palindrom? (let [r (range 100 999)]
                                      (mapcat (fn [a] (map (fn [b] (* a b)) r)) r)))))

