Algoritmo Ciclo_repetir
	
	//Solicitar al usuario un número, y este será la tabla de multiplicar
	//que desa ver, y se deberá mostrar la tabla del número en cuestion
	// desde 1 a 10
	
	// Entrada: el número de tabla
	// Salida: Tabla de multiplicar del 1 al 10 del número en cuestion
	
	Definir contador Como Entero
	Definir tabla Como Entero // 0
	
	Escribir Sin Saltar "Ingrese la tabla a mostrar: "
	Leer tabla
	
	contador = 1
	
	Repetir
		Escribir contador, " X ", tabla, " = ", (contador * tabla)
		
		contador = contador + 1
	Hasta Que contador == 11
	
FinAlgoritmo
