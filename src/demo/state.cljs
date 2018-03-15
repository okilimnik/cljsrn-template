(ns demo.state
  (:require [clojure.spec.alpha :as s]))

;; spec of app-db
(s/def ::greeting string?)
(s/def ::app-state
  (s/keys :req-un [::greeting]))

;; initial state of app-db
(def app-state {:greeting "Hello Clojurescript in Expo!"})
