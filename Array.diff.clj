(ns array-diff)
(defn array-diff [a b]
  (let [b-set (set b)]
    (remove b-set a)))