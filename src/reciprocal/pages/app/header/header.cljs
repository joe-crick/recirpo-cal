(ns reciprocal.pages.app.header.header
  (:require
    [reagent.core :as reagent]
    [stylefy.core :as stylefy
     :refer           [use-style use-sub-style]]
    [reciprocal.pages.app.header.header-styles :as styles]
    [reciprocal.pages.app.header.folder-action-bar.folder-action-bar
     :refer
     [folder-action-bar]]
    [reciprocal.global-styles :refer [filled-button colors]]
    [reciprocal.pages.app.header.burger.burger :refer [burger]]))

(defn header []
  [:header
   (merge (use-style styles/recriprocal-header))
   [folder-action-bar]
   [:div
    (use-style styles/hero-layout-root)
    [:div
     (use-style styles/banner-text)
     "Discover thousands of recipes, exclusively at finleap"]
    [:div (use-style styles/button-layout)
     [:button (use-style styles/main-signup-button) "Sign Up"]]]])
