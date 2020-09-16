(ns reciprocal.header.burger.burger-styles
  (:require
    [reagent.core :as reagent]
    [reciprocal.global-styles :refer [phone-width tablet-width]]
    [stylefy.core :as stylefy
     :refer           [use-style use-sub-style]]))

(def show-layout
  {:position   "absolute"
   :left       "10px"
   :transition "all 1s ease-in-out"})

(def hide-layout
  (merge show-layout {:left "-700px"}))

(def menu-style
  {:width            "70%"
   :background-color "#efefe3"
   :padding "25px"})

(def icon-style
  {:width "40px"})

(def button-style
  {:background "none"
   :border     "0"
   :cursor     "pointer"
   :outline    "0"})
