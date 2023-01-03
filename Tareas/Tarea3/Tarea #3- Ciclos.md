> # Tarea #3 - Ciclos
> 
> ### Tutor - Elian Estrada

# Instrucciones

> A continuación se les presentaran una serie de enunciados los cuales deberán resolver utilizando Pseint.

# Enunciado

1. Desarrollar un algoritmo que pregunte una y otra vez si desea continuar con el programa, siempre que la respuesta sea sí (en minúscula y con tílde)
   
   ###### Ejemplo - Salida
   
   ```bash
   Diga sí para continuar
   ¿Desea continuar el programa?: sí
   ¿Desea continuar el programa?: sí
   ¿Desea continuar el programa?: #cualquier otra cosa
   ¡Adiós!
   ```

2. Desarrollar un algoritmo que pregunte una y otra vez si desea terminar el programa, salvo que conteste exactamente SI (en mayúscula y sin tilde).
   
   ###### Ejemplo - Salida
   
   ```bash
   Diga SI para terminar
   ¿Desea terminar el programa?: s
   ¿Desea terminar el programa?: Si
   ¿Desea terminar el programa?: SI
   ¡Adiós!
   ```

3. Desarrollar un algoritmo que pregunte una y otra vez si desea terminar el programa, siempre que conteste exactamente N (en mayúsculas).
   
   ###### Ejemplo - Salida
   
   ```bash
   Diga N para continuar
   ¿Desea terminar el programa?: N
   ¿Desea terminar el programa?: N
   ¿Desea terminar el programa?: #cualquier otra cosa
   ¡Adiós!
   ```

4. Escriba un programa que pregunte una y otra vez si desea continuar con el programa, siempre que conteste S o s ( en mayúscula o en minúscula).
   
   ###### Ejemplo - Salida
   
   ```bash
   Diga S O s para continuar
   ¿Desea continuar el programa?: S
   ¿Desea continuar el programa?: s
   ¿Desea continuar el programa?: S
   ¿Desea continuar el programa?: #cualquier otra cosa
   ¡Hasta la vista!
   ```

5. Desarrolle un algoritmo que solicite una contraseña (el texto es irrelevante) y vuelva a solicitar hasta que las 2 coincidan.
   
   ###### Ejemplo - Salida
   
   ```bash
   Confirme su contraseña
   Escriba su contraseña: password1
   Escriba de nuevo su contraseña: password2
   Las contraseñas no coinciden, intentelo de nuevo.
   Escriba su contraseña: password1
   Escriba de nuevo su contraseña: password1
   Contraseña Confirmada. Adiós!
   ```

6. Escriba un programa que simule un fondo de ahorro. Deberá solicitar primero la cantidad que se desea ahorrar, luego deberá de solicitarse una y otra vez las cantidades que se iran ahorrando hasta que el total ahorrado iguale o supere el objetivo. 
   
   ###### Ejemplo - Salida
   
   ```
   Ahorro
   ¿Cuánto desea ahorrar?: 30
   ¿Cuanto va ingresar?: 10
   ¿Cuanto va ingresar?: 5
   ¿Cuanto va ingresar?: 5.5
   ¿Cuanto va ingresar?: 15
   ¡Objetivo alcanzado, ha ahorrado 35.5 dólares.
   ```

7. Desarrolle una solución para el problema anterior que restringa que las cantidades no sean negativas.
   
   ###### Ejemplo - Salida
   
   ```
   Ahorro
   ¿Cuánto desea ahorrar?: 30
   ¿Cuanto va ingresar?: 10
   ¿Cuanto va ingresar?: -5
   Por favor, escriba una cantidad positiva.
   ¿Cuanto va ingresar?: 5.5
   ¿Cuanto va ingresar?: 5
   ¿Cuanto va ingresar?: 15
   ¡Objetivo alcanzado, ha ahorrado 35.5 dólares.
   ```

8. Desarrolle un algoritmo que resuelva el problema 5, pero que lo limite a 3 intentos.
   
   ###### Ejemplo - Salida
   
   ```bash
   Confirme su contraseña.
   Escriba su contraseña: pezespada
   Tiene 3 intentos para confirmar su contraseña.
   Escriba de nuevo su contraseña: Pezespada
   Las contraseñas no coinciden. Inténtelo de nuevo.
   Escriba de nuevo su contraseña: pezEspada
   Las contraseñas no coinciden. Inténtelo de nuevo.
   Escriba de nuevo su contraseña: PezEspada
   Lo siento, no ha confirmado la contraseña. ¡Hasta la vista!
   ```

9. Realizar un programa que muestre los numeros pares empezando por el 1 y terminando en 100.
   
   ###### Ejemplo - Salida
   
   ```bash
   2
   4
   6
   8
   10
   .
   .
   .
   100
   ```

10. Realizar un programa que muestre los números impares empezando por 1 y terminando en 100.
    
    ###### Ejemplo - Salida
    
    ```bash
    1
    3
    5
    7
    11
    .
    .
    .
    99
    ```

11. Realizar un programa que cuente cuantos números pares e impares hay entre 1 y 100 y devuelva la suma de pares e impares. 
    
    ###### Ejemplo - Salida
    
    ```bash
    La cantidad de números pares es: 51 y su suma es: 2550
    La cantidad de números impares es: 51 y su suma es: 2551
    ```

12. Realizar un programa que muestre un menú en pantalla con las siguientes opciones: 
    
    | No. | Nombre      |
    |:---:|:-----------:|
    | 1   | Suma        |
    | 2   | Resta       |
    | 3   | Multiplicar |
    | 4   | Dividir     |
    | 5   | Salir       |
    
    El usuario deberá selecionar una opción, y a continuación, el programa deberá solicitar el ingreso de 2 números enteros. Una vez ingresados los números deberá realizar la operación correspondiente a la selección del usuario. Esto deberá repetirse una y otra vez hasta que el usuario seleccione la opción 5 Salir. 
    
    ###### Ejemplo - Salida
    
    ```bash
    Bienvenidos
    1. Suma
    2. Resta
    3. Multiplicar
    4. Dividir
    5. Salir
    
    Escoja una opción: 1
    
    Ingrese un número: 12
    Ingrese otro número: 5
    
    El resultado de la suma es: 17
    
    1. Suma
    2. Resta
    3. Multiplicar
    4. Dividir
    5. Salir
    
    Escoja una opción: 5
    
    Adios!
    ```

# Extras

1. Realizar una aplicación que pida un número en decimal, y que devuelva su equivalente en binario.
   
   ###### Ejemplo - Salida
   
   ```bash
   Ingrese un número decimal: 10
   El número 10 en Binario es: 1010
   
   Ingrese un número decimal: 7
   El número 7 en binario es: 111
   ```

2. Reazliar una aplicación que solicite un número en binario y devuelva su equivalente en decimal.
   
   ###### Ejemplo - Salida
   
   ```bash
   Ingrese un número en binario: 10
   El número 10 en decimal es: 2
   
   Ingrese un número en binario: 101
   El número 101 en decimal es: 5
   ```

# Entrega

Deberán entregar 1 archivo rar o zip que contenga 12 archivos, 1 por enunciado, con su respectiva solución. El nombre del archivo será [CPB]Tarea_1_\<nombre>_\<pais>.[rar|zip].

> Nota: Los dos problemas extras, como bien dice su nombre son extras y no son obligatorios, sin embargo, si quieren reforzar mas sus conocimientos son muy buenos ejercicios y se entregarían en una carpeta con el nombre de Extras.

# Fecha de Entrega

Antes de la clase del día lunes 21 de Noviembre de 2022. - 