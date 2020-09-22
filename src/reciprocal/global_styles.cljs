(ns reciprocal.global-styles
  (:require [stylefy.core :as stylefy]))

(def phone-width "414px")
(def tablet-width "768px")

(def colors
  {:white "#fff"
   :red   "#d84e1f"})

(def font-sizes
  {:small  "18px"
   :medium "24px"
   :large  "36px"})

(def font-weights
  {:400 :400
   :600 :600
   :800 :800})

(def button
  {:padding       "10px 25px"
   :border-radius "20px"})

(defn link-button [color]
  (merge button
         {:border           :none
          :background-color :transparent
          :color            color}))

(defn outline-button [color]
  (merge button
         {:border           "1px solid #fff"
          :background-color :transparent
          :color            color}))

(defn filled-button [color]
  (merge button
         {:background-color color
          :border           :none
          :color            (:white colors)
          ::stylefy/mode    {:hover  {:background-color (str color "95")
                                      :cursor           :pointer}
                             :active {:background-color color}}}))

(def undecorated-list
  {:list-style :none})

(def horizontal-list
  {:display :inline-block})
