(ns demo.app
  (:require [reagent.core :as r :refer [atom]]
            [re-frame.core :refer [subscribe dispatch dispatch-sync]]
            [demo.handlers]
            [demo.subs]
            [demo.ui :as ui]))

;;shadow-cljs watch app
;;yarn run ios/android

;(aset js/console "disableYellowBox" true)
;(enable-console-print!)
(dispatch-sync [:initialize-db])

(defn AppNavigator []
  (r/as-element [ui/view {:style {:flex 1
                                  :align-items "center"
                                  :justify-content "center"}}
                 [ui/text "Hello from CLJS"]]))