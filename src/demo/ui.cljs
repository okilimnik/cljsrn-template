(ns demo.ui
  (:require [reagent.core :as r]))

(def ReactNative (js/require "react-native"))
(def Expo (js/require "expo"))

(def AppRegistry (aget ReactNative "AppRegistry"))
(def Dimensions (aget ReactNative "Dimensions"))
(def SQLite (aget Expo "SQLite"))

(def Image (aget ReactNative "Image"))
(def Picker (aget ReactNative "Picker"))

(def view (r/adapt-react-class (aget ReactNative "View")))
(def text (r/adapt-react-class (aget ReactNative "Text")))
(def text-input (r/adapt-react-class (aget ReactNative "TextInput")))
(def image (r/adapt-react-class Image))
(def picker (r/adapt-react-class Picker))
(def picker-item (r/adapt-react-class (aget Picker "Item")))
(def touchable-highlight (r/adapt-react-class (aget ReactNative "TouchableHighlight")))
(def scroll-view (r/adapt-react-class (aget ReactNative "ScrollView")))
(def touchable-opacity (r/adapt-react-class (aget ReactNative "TouchableOpacity")))
