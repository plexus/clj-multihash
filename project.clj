(defproject mvxcvi/multihash "1.2.0-SNAPSHOT"
  :description "Native Clojure implementation of the multihash standard."
  :url "https://github.com/greglook/clj-multihash"
  :license {:name "Public Domain"
            :url "http://unlicense.org/"}

  :deploy-branches ["master"]

  :aliases {"node-repl" ["with-profile" "+cljs" "run" "-m" "clojure.main" "node_repl.clj"]}

  :plugins
  [[lein-cloverage "1.0.6"]]

  :dependencies
  [[mvxcvi/alphabase "0.1.0"]
   [org.clojure/clojure "1.8.0"]]

  :codox {:metadata {:doc/format :markdown}
          :source-uri "https://github.com/greglook/clj-multihash/blob/master/{filepath}#L{line}"
          :doc-paths ["doc/extra"]
          :output-path "doc/api"}

  :whidbey {:tag-types {'multihash.core.Multihash {'data/hash 'multihash.core/base58}}}

  :profiles {:cljs {:dependencies
                    [[org.clojure/clojurescript "1.7.170"]]}})
