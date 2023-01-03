Algoritmo Menu_segun
	
	//Realizar un menú con 4 opciones, 
	// Sumar, restar, multiplicar y dividir
	
	Definir v_opcion Como Entero
	Definir num1, num2 Como Entero
	Definir resultado Como Real
	
	Repetir 
		Escribir "1. Sumar"
		Escribir "2. Restar"
		Escribir "3. Multiplicar"
		Escribir "4. Dividir"
		Escribir "5. Salir"
		Escribir Sin Saltar "Escoja una opción [1-5]: "
		Leer v_opcion
		
		Segun v_opcion Hacer
			1:
				//suma
				Escribir Sin Saltar "Ingrese el primer número: "
				Leer num1
				Escribir Sin Saltar "Ingrese el segundo número: "
				Leer num2
				
				Escribir "La suma de ", num1, " + ", num2, " = ", (num1 + num2)
			2:
				//resta
				Escribir Sin Saltar "Ingrese el primer número: "
				Leer num1
				Escribir Sin Saltar "Ingrese el segundo número: "
				Leer num2
				
				Escribir "La resta de ", num1, " - ", num2, " = ", (num1 - num2)
			3:
				//multiplicacion
				Escribir Sin Saltar "Ingrese el primer número: "
				Leer num1
				Escribir Sin Saltar "Ingrese el segundo número: "
				Leer num2
				
				Escribir "La multiplicacion de ", num1, " * ", num2, " = ", (num1 * num2)
			4: 
				//division
				Escribir Sin Saltar "Ingrese el primer número: "
				Leer num1
				Escribir Sin Saltar "Ingrese el segundo número: "
				Leer num2
				
				Si num2 == 0 Entonces
					//Acciones si num2 es 0 
					Escribir "La division entre 0 es indeterminada" //ir al Hasta Que
				SiNo
					resultado = num1 / num2
					Escribir "La division de ", num1, " / ", num2, " = ", resultado //(num1 / num2) //ir paso tal
				FinSi
			5:
				//Salida
				Escribir "Hasta la proxima"
			De Otro Modo:
				//error
				Escribir "La opcion que se ingreso es invalida"
		Fin Segun
	Hasta Que v_opcion == 5
	
FinAlgoritmo
