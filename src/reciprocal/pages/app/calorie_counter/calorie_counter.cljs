(ns reciprocal.pages.app.calorie-counter.calorie-counter
  (:require
    [stylefy.core :as stylefy
     :refer           [use-style]]
    ["react-select" :default Select]))

(def options
  #js [#js{:value "chocolate" :label "Chocolate"},
       #js{:value "strawberry" :label "Strawberry"},
       #js{:value "vanilla" :label "Vanilla"},])

(defn change-handler [event])

(defn calorie-counter []
  [:div
   [:h2 "Try Our Recipe Calorie Cacluator"]
   [:div
    [:> Select
     {:value (first options) :on-change change-handler :options options}]]])
