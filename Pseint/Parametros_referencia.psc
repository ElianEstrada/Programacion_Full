// Pasando parametros por valor (es el paso por defecto)

Funcion original <- intercambiarPorValor (original, cambio)
	original <- cambio
FinFuncion

// Pasando parametros por referencia
Funcion intercambiar (original Por Referencia, cambio)
	original <- cambio
	Escribir original
FinFuncion

Algoritmo Parametros_referencia
	
	Definir num1, num2 Como Entero
	num1 = 10
	num2 = 20
	
	//Escribir num1
	//intercambiar(num1, num2)
	Escribir num1
	num1 = intercambiarPorValor(num1, num2)
	Escribir num1
	
	
	// direc    nombre  valor
	// 0x001 -> num1 -> 10
	// 0x002 -> num2 -> 20
	// 
	// Funcion con parametros (original, cambio) pasados por valor
	// Funcion(num1, num2) -> tomo el valor de num1 y lo asigno a original
	// tomo el valor de num2 y lo asigno a cambio
	// 0x003 -> original -> 10
	// 0x004 -> cambio 	 -> 20
	//
	// Funcion con parametros (original PR, cambio) pasado por referencia
	// Funcion (num1, num2) -> tomo la direccion de num1 y la asigno a
	// original, y tomo el valor de num2 y lo asgino a cambio.
	//
	// 0x003 -> original -> 0x001
	// 0x004 -> cambio   -> 20
	// original <- cambio
	// 20 -> 0x004 -> 0x001 -> 10 borro el 10 y asigno el 20.
	
FinAlgoritmo
