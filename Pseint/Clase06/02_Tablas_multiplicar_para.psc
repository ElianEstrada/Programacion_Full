Algoritmo Ciclo_para
	
	//Solicitar al usuario un número, y este será la tabla de multiplicar
	//que desa ver, y se deberá mostrar la tabla del número en cuestion
	// desde 1 a 10
	
	// Entrada: el número de tabla
	// Salida: Tabla de multiplicar del 1 al 10 del número en cuestion
	
	Definir tabla Como Entero
	
	Escribir Sin Saltar "Ingrese la tabla que desea visualizar: "
	Leer tabla
	
	Para i = 1 Hasta 10 Con Paso 1 Hacer
		Escribir i, " X ", tabla, " = ", (i * tabla)
	Fin Para
	
FinAlgoritmo
