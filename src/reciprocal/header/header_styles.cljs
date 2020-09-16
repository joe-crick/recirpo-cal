(ns reciprocal.header.header-styles
  (:require
    [reagent.core :as reagent]
    [reciprocal.global-styles :refer [phone-width tablet-width]]
    [stylefy.core :as stylefy
     :refer           [use-style use-sub-style]]))

(def reciprocal-header-layout
  {:display         :flex
   :align-items     :center
   :justify-content :space-between})

(def reciprocal-logo-layout
  {:flex "1 1"})

(def recriprocal-header-layout
  {:flex         "0 1"
   :margin-right "90px"})

(def reciprocal-header-menu-display-control
  {:display             :none
   ::stylefy/media      {{:min-width tablet-width} {:display :block}}
   ::stylefy/sub-styles {:list {:padding         "5px"
                                :text-decoration :none
                                ::stylefy/mode   {:hover {:background-color :white}}}}})

(def reciprocal-menu
  {:list-style :none})

(def reciprocal-burger-display-control
  {::stylefy/media {{:min-width tablet-width} {:display :none}}})

(def reciprocal-menu-layout
  {:display        :none
   ::stylefy/media {{:min-width tablet-width} reciprocal-header-layout}})

(def reciprocal-menu-link
  {:text-decoration :none
   :color           :black
   :font-weight     "16px"})

(defn header-link-attrs []
  (merge (use-style reciprocal-menu-link) (use-sub-style reciprocal-header-menu-display-control :list) {:href "http://www.startpage.com"}))

(def reciprocal-menu-item
  {:padding "5px"})
