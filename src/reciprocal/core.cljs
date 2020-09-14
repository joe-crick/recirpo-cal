(ns reciprocal.core
  (:require
    [reciprocal.header :refer [header]]
    [stylefy.core :as stylefy
     :refer           [use-style]]
    [reagent.core :as reagent
     :refer           [atom]]
    [reagent.dom :as rd]))

;; -------------------------
;; Views

(enable-console-print!)

(stylefy/init)

(defonce app-state (atom {:text "Hello world!"}))

(def phone-width "414px")

(def responsive-layout
  {:display        :flex
   :flex-direction :row
   ::stylefy/media {{:max-width phone-width} {:flex-direction :column}}})

(defn app []
  [:div (use-style responsive-layout)
   [header]])

(rd/render [app]
           (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  )

