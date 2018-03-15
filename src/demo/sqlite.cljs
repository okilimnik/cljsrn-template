(ns demo.sqlite
  (:require [demo.ui :as ui]))

(def db (.openDatabase ui/SQLite "demo.db"))

(defn execute [{:keys [sql args on-success on-error]}]
  (.transaction db (fn [tx] (.executeSql tx sql args on-success on-error))))
