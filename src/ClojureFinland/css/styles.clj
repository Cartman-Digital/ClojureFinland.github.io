(ns ClojureFinland.css.styles
  (:require [garden.core :as garden]))

(defn gen-styles [_]
  (garden/css
   [:body
    {:color            "#55AD1B"
     :font-family      "Courier"
     :background-color "#0F0D01"
     :font-size        "14px"}]

   [:a
    {:color "#1D96AD"}]

   [:a:hover
    {:color "#21a5bf"}]

   [:h1 :h2
    {:color "#99A3A4"}]

   [:.separator
    {:height "0.5em"}]

   [:.container
    {:display               "inline-grid"
     :grid-template-columns "1em min-content 1em"}]

   [:.item-first
    {:padding-top "0.25em"}]

   [:.item-last
    {:padding-bottom "0.25em"
     :align-self     "end"}]))
