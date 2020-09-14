(ns reciprocal.burger
  (:require
    [reagent.core :as reagent
     :refer           [atom]]
    [stylefy.core :as stylefy
     :refer           [use-style]]))

(def show-layout
  {:position   "absolute"
   :left       "10px"
   :transition "all 1s ease-in-out"})

(def hide-layout
  (merge show-layout {:left "-700px"}))

(def menu-style
  {:width            "33%"
   :background-color "#efefe3"})

(def icon-style
  {:width "40px"})

(def button-style
  {:background "none"
   :border     "0"
   :cursor     "pointer"
   :outline    "0"})

(defn burger [children]
  (let [is-open (atom false)]
    (fn [children]
      [:div
       [:button
        (merge (use-style button-style)
               {:on-click (fn []
                            (reset! is-open (not @is-open)))})
        [:img
         (merge (use-style icon-style)
                {:src (if @is-open "images/burger-close.svg" "images/burger-menu.svg")})]]
       [:div
        (use-style (merge (if @is-open show-layout hide-layout) menu-style))
        [children]]])))
