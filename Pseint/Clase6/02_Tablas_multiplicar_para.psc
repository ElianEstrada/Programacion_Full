Algoritmo Ciclo_para
	
	//Solicitar al usuario un n�mero, y este ser� la tabla de multiplicar
	//que desa ver, y se deber� mostrar la tabla del n�mero en cuestion
	// desde 1 a 10
	
	// Entrada: el n�mero de tabla
	// Salida: Tabla de multiplicar del 1 al 10 del n�mero en cuestion
	
	Definir tabla Como Entero
	
	Escribir Sin Saltar "Ingrese la tabla que desea visualizar: "
	Leer tabla
	
	Para i = 1 Hasta 10 Con Paso 1 Hacer
		Escribir i, " X ", tabla, " = ", (i * tabla)
	Fin Para
	
FinAlgoritmo
