(ns getmiddle.core)

(defn get-middle [s]
  (let [n (count s)
        index (int (/ n 2))]
    (if (zero? (mod n 2))
      (subs s (dec index) (inc index))
      (subs s index (inc index)))))