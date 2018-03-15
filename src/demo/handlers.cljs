(ns demo.handlers
  (:require
    [re-frame.core :refer [reg-event-db]]
    [clojure.spec.alpha :as s]
    [demo.state :as state :refer [app-state]]))

(reg-event-db
  :initialize-db
  (fn [_ _]
    app-state))

(reg-event-db
  :set-greeting
  (fn [db [_ value]]
    (assoc db :greeting value)))
