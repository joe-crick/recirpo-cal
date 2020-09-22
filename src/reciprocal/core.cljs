(ns reciprocal.core
  (:require
    [reciprocal.pages.app.app :refer [app]]
    [stylefy.core :as stylefy]
    [reagent.core :as reagent
     :refer           [atom]]
    [reagent.dom :as rd]))

;; -------------------------
;; Views

(enable-console-print!)

(stylefy/init)

(rd/render [app]
           (. js/document (getElementById "app")))


