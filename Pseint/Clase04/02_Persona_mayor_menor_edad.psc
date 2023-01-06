Algoritmo Persona_mayor_menor_edad
	
	//Estructura para Declarar variables
	//'Definir' <nombre> 'Como' <tipo>
	
	//Tipos
	// Entero -> 1, 2, 3, 10, 23, 100 ...
	// Real -> 1.5, 23.48, 3.14 ... 
	// Caracter -> "Hola", "a", ","
	// Logico -> Verdadero, Falso
	
	//Nombres
	// Tiene que empezar por una letra o '_'
	// Pueden seguir por letras, numeros o '_'
	// Ejemplo: num1, _num2, num_3, 0_num -> invalido
	
	//Ejemplo declaracion variable
	Definir edad Como Entero
	
	//paso 1
	Escribir Sin Saltar "Ingrese su edad: "
	Leer edad //10
	
	//Paso 2
	Si edad > 17 Entonces
		//Paso 3
		Escribir "El usuario es mayor de edad"
	SiNo
		//Paso 4
		Escribir "El usuario es menor de edad"
	Fin Si
	
	//Paso 5
FinAlgoritmo
