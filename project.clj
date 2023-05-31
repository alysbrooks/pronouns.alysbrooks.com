(defproject witch-house/pronouns "1.12.0-SNAPSHOT"
  :description "Pronoun.is is a website for personal pronoun usage examples"
  :url "https://pronoun.is"
  :license "GNU Affero General Public License 3.0"
  :dependencies [[compojure "1.7.0"]
                 [environ "1.1.0"]
                 [com.lambdaisland/hiccup "0.0.15"]
                 [lambdaisland/ring.middleware.logger "0.5.1"]
                 [org.clojure/clojure "1.9.0"]
                 [ring/ring-devel "1.7.1"]
                 [ring/ring-jetty-adapter "1.7.1"]]
  :min-lein-version "2.0.0"
  :main pronouns.web 
  :plugins [[environ/environ.lein "0.3.1"]
            [lein-ring "0.12.6"]
            [com.github.liquidz/antq "RELEASE"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "pronouns-standalone.jar"
  ;; FIXME morgan.astra <2018-11-14 Wed>
  ;; Is this production profile used for anything?
  :profiles {:production {:env {:production true}}
             :uberjar {:aot :all}}
  :ring {:handler pronouns.web/app})
