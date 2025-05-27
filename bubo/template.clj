(cc/use 'tawny.repl)

(def in (load-ontology (iri (clojure.java.io/file "../in.owl"))))

(cc/defn template [id label type]
  (individual in id :type (class in type) :label label))

(template
 "ex:ind-1" "Individual 1" "Class_1")

(.saveOntology
 (owl-ontology-manager)
 in
 (org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat.)
 (java.io.FileOutputStream. (java.io.File. "out.owl")))
