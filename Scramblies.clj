;; not human coce :< should use frequencies ! 
(ns scramblies.core)

(defn char-count [s]
  (reduce (fn [counts char]
            (update counts char (fnil inc 0)))
          {}
          s))

(defn scramble [s1 s2]
  (let [map1 (char-count s1)
        map2 (char-count s2)]
    (reduce
     (fn [result [k v]]
       (if (>= (map1 k 0) v)
         result
         (reduced false)))
     true
     map2)))