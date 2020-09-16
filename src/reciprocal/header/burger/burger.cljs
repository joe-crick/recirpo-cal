(ns reciprocal.header.burger.burger
  (:require
    [reagent.core :as reagent
     :refer           [atom]]
    [stylefy.core :as stylefy
     :refer           [use-style]]
    [reciprocal.header.burger.burger-styles :as styles]))



(defn burger [children]
  (let [is-open (atom false)]
    (fn [children]
      [:div
       [:button
        (merge (use-style styles/button-style)
               {:on-click (fn []
                            (reset! is-open (not @is-open)))})
        [:img
         (merge (use-style styles/icon-style)
                {:src (if @is-open "images/burger-close.svg" "images/burger-menu.svg")})]]
       [:div
        (use-style (merge (if @is-open styles/show-layout styles/hide-layout) styles/menu-style))
        [children]]])))
