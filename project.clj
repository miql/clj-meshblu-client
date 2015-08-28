(defproject clj-meshblu-client "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-http "2.0.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.clojure/data.json "0.2.6"]]
  :main ^:skip-aot clj-meshblu-client.core
  :target-path "target/%s"
  :plugins [[lein-plz "0.4.0-SNAPSHOT"]]
  :profiles {:uberjar {:aot :all}})
