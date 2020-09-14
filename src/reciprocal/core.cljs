(ns reciprocal.core
  (:require
    [reciprocal.header :refer [header]]
    [reciprocal.burger :refer [burger]]
    [stylefy.core :as stylefy]
    [reagent.core :as reagent
     :refer           [atom]]
    [reagent.dom :as rd]))

;; -------------------------
;; Views

(enable-console-print!)

(stylefy/init)

(defonce app-state (atom {:text "Hello world!"}))

(defn app []
  [:div
   [header]
   [burger (fn [] [:div [:a {:href "http://www.cnn.com"} "CNN"]])]])

(rd/render [app]
           (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  )

