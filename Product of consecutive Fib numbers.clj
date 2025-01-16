(ns product-of-fib.core)

(defn product-fib [prod]
  (loop [a (bigint 0) b (bigint 1)]
    (if (>= prod (* a b))
      (if (= prod (* a b))
        [a b true]
        (recur b (+ a b)))
      [a b false]))) 