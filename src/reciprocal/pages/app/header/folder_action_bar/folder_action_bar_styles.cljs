(ns reciprocal.pages.app.header.folder-action-bar.folder-action-bar-styles
  (:require [reciprocal.global-styles :refer [tablet-width]]
            [reciprocal.global-styles
             :refer
             [outline-button, colors]]
            [stylefy.core :as stylefy]))

(def action-bar-layout
  {:display         :flex
   :align-items     :center
   :justify-content :space-between
   :width           "95%"
   :position        :relative
   :padding         "10px"
   ::stylefy/media  {{:min-width tablet-width} {:width "95%"
                                                :left  "45px"}}})

(def sign-up-button
  (merge (outline-button (:white colors))
         {:display        :none
          ::stylefy/media {{:min-width tablet-width} {:display :block}}}))
