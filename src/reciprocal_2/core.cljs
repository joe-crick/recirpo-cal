(ns reciprocal-2.core
  (:require
    [reciprocal-2.header :refer [header]]
    [reagent.core :as reagent
     :refer           [atom]]
    [reagent.dom :as rd]))

;; -------------------------
;; Views


(defonce app-state (atom {:text "Hello world!"}))

(defn app []
  [:div
   [header]])

(rd/render [app]
           (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  )

