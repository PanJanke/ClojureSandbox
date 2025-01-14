(ns maxdifflength.core)

(defn mxdiflg [a1 a2]
  (if (or (empty? a1) (empty? a2))
    -1
    (let [sorted-a1 (sort-by count a1)
          sorted-a2 (sort-by count a2)
          a         (Math/abs (- (count (last sorted-a1)) (count (first sorted-a2))))
          b         (Math/abs (- (count (last sorted-a2)) (count (first sorted-a1))))]
      (if (> a b)
        a
        b))))