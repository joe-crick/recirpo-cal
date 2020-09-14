(ns reciprocal-2.burger
  (:require
    [reagent.core :as reagent
     :refer           [atom]]
    [stylefy.core :as stylefy
     :refer           [use-style]]))

(def show-style
  {:position   "absolute"
   :left       "10px"
   :transition "all 1s ease-out"})

(def hide-style {:position "absolute" :left "-500px"})

(defn burger [children]
  (let [is-open (atom false)]
    (fn [children]
      [:div
       [:button
        {:on-click (fn []
                     (reset! is-open (not @is-open)))}
        (if @is-open "Close" "Open")]
       [:div
        (use-style (if @is-open show-style hide-style))
        [children]]])))
