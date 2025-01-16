(ns findeven.core)

(defn find-even-index [arr]
  (loop [index 0
         left-sum 0
         right-sum (reduce + arr)]
    (if (>= index (count arr))
      -1
      (let [current-value (nth arr index)]
        (if (= left-sum (- right-sum current-value))
          index
          (recur (inc index)
                 (+ left-sum current-value)
                 (- right-sum current-value)))))))
