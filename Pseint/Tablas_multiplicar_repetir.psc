Algoritmo Ciclo_repetir
	
	//Solicitar al usuario un n�mero, y este ser� la tabla de multiplicar
	//que desa ver, y se deber� mostrar la tabla del n�mero en cuestion
	// desde 1 a 10
	
	// Entrada: el n�mero de tabla
	// Salida: Tabla de multiplicar del 1 al 10 del n�mero en cuestion
	
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
