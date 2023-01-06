Algoritmo opciones
	
	//Realizar un menú con 4 opciones, 
	// Sumar, restar, multiplicar y dividir
	
	Definir v_opcion Como Entero
	Definir num1, num2 Como Entero
	
	Escribir "1. Sumar"
	Escribir "2. Restar"
	Escribir "3. Multiplicar"
	Escribir "4. Dividir"
	Escribir Sin Saltar "Escoja una opción [1-4]: "
	Leer v_opcion
	
	Si v_opcion == 1 Entonces
		//La suma
		Escribir Sin Saltar "Ingrese el primer número: "
		Leer num1
		Escribir Sin Saltar "Ingrese el segundo número: "
		Leer num2
		
		Escribir "La suma de ", num1, " + ", num2, " = ", (num1 + num2)
		
	SiNo
		Si v_opcion == 2 Entonces
			//La resta
			Escribir Sin Saltar "Ingrese el primer número: "
			Leer num1
			Escribir Sin Saltar "Ingrese el segundo número: "
			Leer num2
			
			Escribir "La suma de ", num1, " - ", num2, " = ", (num1 - num2)
		SiNo
			Si v_opcion == 3 Entonces
				//La multiplicacion
				Escribir Sin Saltar "Ingrese el primer número: "
				Leer num1
				Escribir Sin Saltar "Ingrese el segundo número: "
				Leer num2
				
				Escribir "La suma de ", num1, " * ", num2, " = ", (num1 * num2)
			SiNo
				Si v_opcion == 4 Entonces
					//Division
					Escribir Sin Saltar "Ingrese el primer número: "
					Leer num1
					Escribir Sin Saltar "Ingrese el segundo número: "
					Leer num2
					
					Escribir "La suma de ", num1, " / ", num2, " = ", (num1 / num2)
					
				SiNo
					Escribir "La opcion que ingreso es invalida"
				FinSi
			FinSi
		FinSi
	FinSi
	
	
FinAlgoritmo
