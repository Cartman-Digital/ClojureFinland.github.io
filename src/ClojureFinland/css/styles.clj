(ns ClojureFinland.css.styles
  (:require [garden.core :as garden]))

(defn gen-styles [_]
  (garden/css
   [:body
    {:color            "#5DBE1E"
     :font-family      ["Courier" "monospace"]
     :background-color "#000000"
     :font-size        "14px"}]

   [:a
    {:color "#20A5BE"
     :text-underline-position "under"}]

   [:a:hover
    {:color "#24B6D2"}]

   [:h1 :h2
    {:color "#A8B3B4"}]

   [:table
    {:text-align "left"}]

   [:table :th :td
    {:vertical-align "top"}]

   ["tbody::after"
    {:content "''"
     :display "block"
     :height "0.5em"}]

   [:.code
    {:color "#8D9798"
     :font-weight "bold"}]

   [:.container
    {:display               "inline-grid"
     :grid-template-columns "0.75em min-content 0.5em"}]

   [:.item-first
    {:padding-top "0.2em"}]

   [:.item-last
    {:padding-bottom "0.25em"
     :align-self     "end"}]))
