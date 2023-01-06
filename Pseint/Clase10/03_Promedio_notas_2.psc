Algoritmo Promedio_notas_2
	
	// Queremos almacenar las notas de una persona
	// a lo largo de un curso, se debe permitir que el 
	// usuario ingrese la cantida de examenes que se 
	// realizaron a lo largo del año y el promedio
	// define si se aprueba o reprueba (promedio >= 61 aprobado)
	
	Definir notas, acum_notas, promedio Como Real
	Definir cantidad_notas como Entero
	
	Escribir Sin Saltar "Ingrese la cantidad de examenes: "
	Leer cantidad_notas
	
	Dimension notas[cantidad_notas]
	
	Para i = 1 Hasta cantidad_notas Con Paso 1 Hacer
		Escribir "Ingrese la nota ", i
		Leer notas[i]
	FinPara
	
	acum_notas = 0
	
	Para i = 1 Hasta cantidad_notas Con Paso 1 Hacer
		acum_notas = acum_notas + notas[i]
	FinPara
	
	promedio = acum_notas / cantidad_notas
	
	Si promedio >= 61 Entonces
		Escribir "El alumno aprobo el curso, con promedio de: ", promedio
	SiNo
		Escribir "El alumno reprobo el curso, con promedio de: ", promedio
	FinSi
	
	
FinAlgoritmo
