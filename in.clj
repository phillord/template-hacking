(cc/use 'tawny.repl)

(defontology in
  :iri "http://www.example.com/in"
  :noname true)

(defclass Class_1 :label "Class_1")
(defclass Class_2 :label "Class_2")

(defclass Role_Class_1 :label "Role_Class_1")
(defclass Role_Class_2 :label "Role_Class_2")

(save-ontology "in.owl")
