import React from 'react';
import { AppNavigator } from "shadow-cljs/demo.app";

// CRNA expects a App.js with an App export
// without a framework that would be too much manual code to write
// since CLJS doesn't have class extends, so we just do it this way

// reagent and others would make this file optional

export default class App extends React.Component {
  render() {
    return AppNavigator();
  }
}
