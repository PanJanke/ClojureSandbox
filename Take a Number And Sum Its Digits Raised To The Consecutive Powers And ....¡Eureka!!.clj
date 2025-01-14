(ns sumdigpow.core)

(defn satisfies-property? [n]
  (let [digits (map #(Character/digit % 10) (str n))] ; Split digits
    (= n (int (reduce + (map #(Math/pow %1 %2) digits (range 1 (inc (count digits))))))))) ; Convert result to int

(defn sum-dig-pow [a b]
  (let [result (reduce (fn [v x] (if (satisfies-property? x) (conj v x) v))
                 []   ; Start with an empty vector
                 (range a (inc b)))]
    result))