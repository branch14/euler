(ns euler.util
  (:import (java.util.regex Pattern)))

(defn integer [s] (Integer/parseInt s))

(def whole-numbers (iterate inc 0))

(defn sum [coll] (reduce + coll))

(defn product [coll] (reduce * coll))

(defn digits [num] (map integer (map str (str num))))

(defn consecutive [n coll] (take-while #(= n (count %))(map #(take n (drop % coll)) whole-numbers)))

;; stolen from unreleased clojure.contrib.string

(defn replace-re
  "Replaces all matches of re with replacement in s."
  [re replacement #^String s]
  (.replaceAll (re-matcher re s) replacement))

(defn split
  "Splits string on a regular expression. Optional argument limit is
  the maximum number of splits."
  ([#^Pattern re #^String s] (seq (.split re s)))
  ([#^Pattern re limit #^String s] (seq (.split re s limit))))

