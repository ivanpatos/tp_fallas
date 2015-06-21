(ns tp-fallas.core)


(defn lesion [dolor rigidez estabilidad zona sonido inflamacion]
  
(if (and (= dolor "alto") 
	         (= rigidez "media") 
	         (= estabilidad "baja") 
	         (= zona "anterior") 
	         (= sonido "crujiente") 
	         (= inflamacion "alta")) (println "Ruptura del Ligamento Cruzado Anterior")

(if (and (= dolor "alto") 
           (= rigidez "media") 
           (= estabilidad "baja") 
           (= zona "posterior") 
           (= sonido "crujiente") 
           (= inflamacion "alta")) (println "Ruptura del Ligamento Cruzado Posterior")
          
(if (and (= dolor "muy alto") 
           (= rigidez "baja") 
           (= estabilidad "muy baja") 
           (= zona "anterior y posterior") 
           (= sonido "crujiente") 
           (or (= inflamacion "alta") (= inflamacion "muy alta"))) (println "Ruptura del Ligamento Cruzado Anterior y Posterior")
      
(if (and (= dolor "medio") 
           (or (= rigidez "media") (= rigidez "alta")) 
           (or (= estabilidad "normal") (= estabilidad "baja")) 
           (= zona "anterior y posterior") 
           (= sonido "ninguno") 
           (= inflamacion "media")) (println "Artritis de Rodilla")
  
(if (and (= dolor "alto") 
	         (= rigidez "alta") 
	         (= estabilidad "normal") 
	         (= zona "anterior y posterior") 
	         (= sonido "ruido seco") 
	         (= inflamacion "media")) (println "Ruptura de Menisco")
  
(if (and (or (= dolor "medio") (= dolor "alto")) 
           (= rigidez "alta")
           (= estabilidad "baja") 
           (= zona "frontal") 
           (= sonido "ninguno") 
           (or (= inflamacion "media") (= inflamacion "alta"))) (println "Tendinitis Rotuliana") (println "No se encontró un diagnóstico para la lesión dada")))))))
)


(str "Ingrese los síntomas de la lesión que presenta: dolor rigidez estabilidad zona sonido inflamacion")
