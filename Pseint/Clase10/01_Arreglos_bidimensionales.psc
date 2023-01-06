Algoritmo Arreglos_bidimensionales
	
	Definir arreglo Como Entero
	Dimension arreglo[3, 3] // cantidad de datos -> 3 * 3 = 9
	
	// i = 1, j = 1 Hasta 3 con paso 1
	// i = 1, j = 1 -> 1ra iteracion arreglo[1, 1] -> 
	// i = 2, j = 2 -> 2da iteracion arreglo[2, 2] -> 
	
	
	// 1 2 3
	// 4 5 6
	// 7 8 9
	
	Definir contador Como Entero
	contador = 1
	
	Para i = 1 Hasta 3 con Paso 1 Hacer
		Para j = 1 Hasta 3 Con Paso 1 Hacer
			arreglo[i, j] = contador
			contador = contador + 1
		FinPara
	FinPara
	
	
	Para i = 1 Hasta 3 con Paso 1 Hacer
		Para j = 1 Hasta 3 Con Paso 1 Hacer
			Escribir arreglo[i, j]
		FinPara
	FinPara
	
	
FinAlgoritmo
