(ns reciprocal.pages.app.header.folder-action-bar.folder-action-bar
  (:require
    [reagent.core :as reagent]
    [stylefy.core :as stylefy
     :refer           [use-style]]
    [reciprocal.global-styles
     :refer
     [link-button, outline-button, undecorated-list, horizontal-list, colors]]
    [reciprocal.pages.app.header.folder-action-bar.folder-action-bar-styles
     :as
     styles]))

(defn folder-action-bar [sign-up login menu]
  [:div
   (use-style styles/action-bar-layout)

   [:div
    [:button
     (use-style (link-button (:white colors)) {:on-click menu})
     [:img {:src "images/logo.svg"}]]]

   [:ul
    (use-style undecorated-list)
    [:li
     (use-style horizontal-list)
     [:button
      (use-style styles/sign-up-button {:on-click sign-up})
      "Sign up"]]
    [:li
     (use-style horizontal-list)
     [:button (use-style (link-button (:white colors)) {:on-click login}) "Login"]]]])
