(ns lesiones_rodilla.core
 (:import [jline.console ConsoleReader]))

(defn soundQuestion []
	(print "¿Qué sonido ocurrió al momento de la lesión? [1-crujiente; 2-ruido seco; 3-ninguno]: ")
    (flush)
		(let [cr (ConsoleReader.) sonido (.readCharacter cr)]
			(println (format " %c" (char sonido) ))
			(flush)
			(cond
				(= (int sonido) (int \1)) (println "\nRuptura del Ligamento Cruzado Anterior y Posterior, por favor visite a su médico\n")
				(= (int sonido) (int \2)) (println "\nRuptura de Menisco, por favor visite a su médico\n")
				(= (int sonido) (int \3)) (println "\nArtritis de Rodilla, por favor visite a su médico\n")
				:else (println "\nIngrese una opción válida (1, 2, 3 o 4)\n")
			)
		)
) 

(defn -main []
  (flush)
  (print "\nPor favor responda los siguientes puntos para conocer la lesión que presenta:\n\n")
  (flush)
  (print "¿Cuál es la zona de dolor? [1-anterior; 2-posterior; 3-ambos; 4-frontal]: ")  	 
  (flush)
  (let [cr (ConsoleReader.) zona (.readCharacter cr)]
	(println (format " %c" (char zona) ))
		(flush)
		(cond
			(= (int zona) (int \1)) (println "\nRuptura del Ligamento Cruzado Anterior, por favor visite a su médico\n")
			(= (int zona) (int \2)) (println "\nRuptura del Ligamento Cruzado Posterior, por favor visite a su médico\n")
			(= (int zona) (int \3)) (soundQuestion)
			(= (int zona) (int \4)) (println "\nTendinitis Rotuliana, por favor visite a su médico\n")
			:else (println "\nIngrese una opción válida (1, 2, 3 o 4)\n")
		)
	)
)