Algoritmo Funciones_Nativas_texto
	
	//Funciones para texto (cadenas de caracteres)
	
	Definir nombre, nombre2, numero1 Como Caracter
	Definir numero_entero Como Entero
	
	nombre = "Elian Estrada"
	nombre2 = " Saul Urbina"
	numero1 = "1"
	numero_entero = ConvertirANumero(numero1)
	
	//longitud(cadena) -> devuevle el total de caracteres que hay en la cadena
	Escribir "La longitud del nombre es: ", longitud(nombre) // 13
	
	//mayusculas(cadena) y minusculas(cadena)
	// estas devuelven la cadena con todos sus caracteres
	// en minuscula o mayuscula dependiendo del caso
	
	Escribir "La cadena en mayuscula es: ", Mayusculas(nombre) // ELIAN ESTRADA
	Escribir "La cadena en minuscula es: ", Minusculas(nombre) // elian estrada
	
	//subcadena(cadena, pos_inicial, pos_final)
	// Devuelve una nueva cadena que es parte de la cadena inicial pero
	// que va desde la pos_inicial hasta la pos_final
	
	Escribir "La subcadena es: ", Subcadena(nombre, 0, 2)
	Escribir "La subcadena total es: ", Subcadena(nombre, 0, Longitud(nombre))
	
	//concatenar(cadena1, cadena2)
	// Devuelve una nueva cadena que es el resultado de unir
	// cadena1 con cadena2
	
	Escribir "La union de nombre1 y nombre2 es: ", Concatenar(nombre, nombre2)
	
	//convertirANumero(cadena)
	// Recibe una cadena de caracteres y la intenta convertir
	// a un numero y lo devuelve.
	
	Escribir "la conversion a numero es: ", convertirANumero(numero1)
	Escribir "El número es: ", numero_entero
	
	//convertirATexto(numero)
	// esta recibe un número y me lo devuelve como string
	
	numero1 = ConvertirATexto(numero_entero)
	Escribir "El numero convertido a texto es: ", numero1
	
	
FinAlgoritmo
	