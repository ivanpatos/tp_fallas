(ns helloworld.core
 (:import [jline.console ConsoleReader]))

 
(defn -main []
  (flush)
  (print "\nPor favor responda los siguientes puntos para conocer la lesión que presenta:\n\n")
  (flush) 
  (print "¿Qué grado de dolor presenta? [1-medio; 2-alto; 3-muy alto]: ")
  (flush)
  (let [cr (ConsoleReader.) 
        dolor (.readCharacter cr)]
        (println (format " %c" (char dolor)))
        (flush)
        (print "¿Qué grado de rigidez presenta la rodilla? [1-bajo; 2-medio; 3-alto]: ") 
        (flush)
        (let [cr (ConsoleReader.) 
             rigidez (.readCharacter cr)]
             (println (format " %c" (char rigidez)))
             (flush)
             (print "¿Con qué nivel de estabilidad cuenta? [1-muy bajo; 2-bajo; 3-normal]: ")
             (flush)
             (let [cr (ConsoleReader.) 
                  estabilidad (.readCharacter cr)]
                  (println (format " %c" (char estabilidad)))
                  (flush)
                  (print "¿Cuál es la zona de dolor? [1-anterior; 2-posterior; 3-ambos; 4-frontal]: ")  	 
                  (flush)
                  (let [cr (ConsoleReader.) 
				   zona (.readCharacter cr)]
        			   (println (format " %c" (char zona) ))
        			   (flush)
        			   (print "¿Qué sonido ocurrió al momento de la lesión? [1-crujiente; 2-ruido seco; 3-ninguno]: ")
        			   (flush)
        			   (let [cr (ConsoleReader.) 
        			   			sonido (.readCharacter cr)]
							(println (format " %c" (char sonido) ))
							(flush)
							(print "¿Qué nivel de inflamacion presenta? [1-medio; 2-alto; 3-muy alto]: ")
							(flush)
							(let [cr (ConsoleReader.) 
								inflamacion (.readCharacter cr)]
        							(println (format " %c" (char inflamacion) ))
        							(flush)

								(if (and (= (int dolor) (int \2)) 
										(= (int rigidez) (int \2))
										 (= (int estabilidad) (int \2))
										 (= (int zona) (int \1))
										 (= (int sonido) (int \1))
										 (= (int inflamacion) (int \2))) 
										(println "\nRuptura del Ligamento Cruzado Anterior, por favor visite a su médico\n")
								
								(if (and (= (int dolor) (int \2)) 
										(= (int rigidez) (int \2)) 
										(= (int estabilidad) (int \2)) 
										(= (int zona) (int \2)) 
										(= (int sonido) (int \1)) 
										(= (int inflamacion) (int \2))) 
										(println "\nRuptura del Ligamento Cruzado Posterior, por favor visite a su médico\n")
	
								(if (and (= (int dolor) (int \3)) 
										(= (int rigidez) (int \1)) 
										(= (int estabilidad) (int \1)) 
										(= (int zona) (int \3))	
										(= (int sonido) (int \1)) 
										(or (= (int inflamacion) (int \2)) (= (int inflamacion) (int \3)))) 
										(println "\nRuptura del Ligamento Cruzado Anterior y Posterior, por favor visite a su médico\n")

								(if (and (= (int dolor) (int \1)) 
										(or (= (int rigidez) (int \2)) (= (int rigidez) (int \3))) 
										(or (= (int estabilidad) (int \3)) (= (int estabilidad) (int \2))) 
										(= (int zona) (int \3)) 
										(= (int sonido) (int \3)) 
										(= (int inflamacion) (int \1))) 
										(println "\nArtritis de Rodilla, por favor visite a su médico\n")

								(if (and (= (int dolor) (int \2))
										(= (int rigidez) (int \3)) 
										(= (int estabilidad) (int \3))
										(= (int zona) (int \3))
										(= (int sonido) (int \2))
										(= (int inflamacion) (int \1)))
										(println "\nRuptura de Menisco, por favor visite a su médico\n")

								(if (and (or (= (int dolor) (int \1)) (= (int dolor) (int \2))) 
										(= (int rigidez) (int \3)) 
										(= (int estabilidad) (int \3)) 
										(= (int zona) (int \4)) 
										(= (int sonido) (int \3)) 
										(or (= (int inflamacion) (int \1)) (= (int inflamacion) (int \2)))) 
										(println "\nTendinitis Rotuliana, por favor visite a su médico\n")

								(println "\nNO se encontró un diagnóstico para la lesión dada")))))))

							)
					)
			)
		)
	)
	)
)
