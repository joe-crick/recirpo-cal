(ns reciprocal.pages.app.header.header-styles
  (:require
    [reagent.core :as reagent]
    [reciprocal.global-styles
     :refer
     [phone-width tablet-width font-sizes font-weights colors filled-button]]
    [stylefy.core :as stylefy
     :refer           [use-style use-sub-style]]))

(def reciprocal-header-layout
  {:min-height "570px"
   :position   :relative
   :left       "-10px"
   :top        "-15px"})

(def reciprocal-header-style
  {:background-image    "url(\"images/hero.png\")"
   :background-position "-496px 7px"
   :background-size     "1352px"
   :background-repeat   "no-repeat"
   :width               "105%"
   ::stylefy/media      {{:min-width tablet-width} {:background-size     "100%"
                                                    :background-position :center
                                                    :top                 "0"
                                                    :left                "0"}}})

(def
  hero-layout-root
  {:margin-left    "15px"
   ::stylefy/media {{:min-width tablet-width}
                    {:margin-left "65px"}}})


(def recriprocal-header
  (merge reciprocal-header-layout reciprocal-header-style))

(def banner-text
  {:font-size      (:large font-sizes)
   :font-weight    (:800 font-weights)
   :color          (:white colors)
   :margin-top     "50px"
   :margin-bottom  "45px"
   :max-width      "355px"
   ::stylefy/media {{:min-width tablet-width}
                    {:max-width "665px"}}})

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
  (merge (use-style reciprocal-menu-link)
         (use-sub-style reciprocal-header-menu-display-control :list)
         {:href "http://www.startpage.com"}))

(def reciprocal-menu-item
  {:padding "5px"})

(def button-layout
  {:text-align     :center
   :margin-left    "-15px"
   ::stylefy/media {{:min-width tablet-width} {:text-align  :left
                                               :margin-left "0"}}})

(def main-signup-button
  (merge (filled-button (:red colors))
         {:width          "90%"
          :padding        "12px 0"
          ::stylefy/media {{:min-width tablet-width} {:width "150px"}}}))
