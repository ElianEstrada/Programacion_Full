Funcion Suma () //Definicion de la funcion
	Escribir "La suma de 2 + 2 = ", 2 + 2
Fin Funcion

Funcion Suma2(num1, num2) //Funcion con argumentos
	Escribir "La suma de ", num1, " y ", num2, " es: ", num1 + num2
FinFuncion

Funcion resultado <- Suma3(num1, num2)
	Definir resultado Como Entero
	
	resultado = num1 + num2
FinFuncion

Funcion resultado <- Suma4(num1, num2)
	Definir resultado Como Entero
	
	resultado = num1 + num2
FinFuncion

Algoritmo Funciones
	
	Suma() //llamada a funcion
	
	// Diferencia entre Funcion y SubProceso 
	// SubProceso es un bloque de codigo apartado del bloque 
	// principal que no devuelve ningun valor.
	
	// Funcion es un un SubProceso que devuelve un valor.
	
	Suma2(2, 3)
	Suma2(5, 7)
	Suma2(12, 12)
	Suma2(15, 7)
	
	Escribir "La suma de 3 + 5 es: ", Suma3(3, 5)
	Definir num1 Como Entero
	
	num1 = Suma3(7, 11)
	Escribir num1
	
	Escribir Suma3(Suma3(Suma4(2, 3), 4), Suma3(7, 6)) //22
	
FinAlgoritmo
