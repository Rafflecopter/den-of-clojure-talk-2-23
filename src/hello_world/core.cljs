(ns hello-world.core
  #_(:require goog.string.format)
  #_(:import goog.net.Jsonp
           goog.Uri
           goog.date.Date))

(enable-console-print!)

(println "Hello world!")

#_(let [p (doto (js/document.createElement "p")
          (aset "innerText" "Sprocket the smiley copter"))]
  (js/document.body.appendChild p))
