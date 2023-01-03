Algoritmo Tablas_multiplicar
	//Solicitar al usuario un número, y este será la tabla de multiplicar
	//que desa ver, y se deberá mostrar la tabla del número en cuestion
	// desde 1 a 10
	
	// Entrada: el número de tabla
	// Salida: Tabla de multiplicar del 1 al 10 del número en cuestion
	
	Definir num_tabla Como Entero
	Definir contador como Entero
	
	//Asignar el valor 1 al contador
	contador = 1
	
	Escribir Sin Saltar "Ingrese el número de la tabla que desa observar: "
	Leer num_tabla
	
	//1 x num_tabla = 1 * num_tabla -> resultado
	//2 x num_tabla = 2 * num_tabla -> resultado
	//3 x num_tabla = 3 * num_tabla -> resultado
	
	Mientras contador <= 12 Hacer
		
		Escribir contador, " x ", num_tabla, " = ", (contador * num_tabla)
		
		contador = contador + 1
	FinMientras
	
FinAlgoritmo
