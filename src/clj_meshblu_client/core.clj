(ns clj-meshblu-client.core
  (:gen-class)
  (:require [clj-http.client :as http]
            [clojure.data.json :as json]))

(defn -main
  [& args]
  (println "Meshblu..."))

(defn get-status
  "Returns the Meshblu platform status"
  []
  (json/read-str (:body (http/get "https://meshblu.octoblu.com/status"))))
