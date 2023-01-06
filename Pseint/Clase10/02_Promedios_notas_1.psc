Algoritmo Arreglos2
	
	
	// Forma tradicional
	Definir edades Como Entero
	Dimension edades[5]
	
	// Queremos almacenar las notas de una persona
	// a lo largo de un curso, este se dividio en 
	// 4 examenes a lo largo del año y el promedio
	// define si se aprueba o reprueba (promedio >= 61 aprobado)
	
	Definir notas Como Real
	Definir acum_notas, promedio Como Real
	
	// inicializar el acumulador
	acum_notas = 0
	
	Dimension notas[4]
	
	Para i = 1 Hasta 4 Con Paso 1 Hacer	// 1ra iteracion i = 1
		
		Escribir "Ingrese la nota ", i	// Ingrese la nota 1
		Leer notas[i]					// se va guardar en 
										// notas[1]
		
	Fin Para
	
	Para i = 1 Hasta 4 Con Paso 1 Hacer
		acum_notas = acum_notas + notas[i]
	FinPara
	
	promedio = acum_notas / 4
	
	Si promedio >= 61 Entonces
		Escribir "El alumno aprobo el curso, con promedio de: ", promedio
	SiNo
		Escribir "El alumno reprobo el cruso, con promedio de: ", promedio
	FinSi
	
	
FinAlgoritmo
