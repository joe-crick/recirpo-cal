(ns reciprocal.pages.app.app
  (:require
    [reciprocal.pages.app.header.header :refer [header]]
    [stylefy.core :as stylefy
     :refer           [use-style]]
    [reciprocal.global-styles :refer [phone-width]]
    [reagent.core :as reagent
     :refer           [atom]]))

(def responsive-layout
  {:display        :flex
   :flex-direction :row
   ::stylefy/media {{:max-width phone-width} {:flex-direction :column}}})

(defn app []
  [:div (use-style responsive-layout)
   [header]])
