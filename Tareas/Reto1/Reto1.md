> # Reto 1 - Modificar producto
> 
> ### Tutor - Elian Estrada

# Instrucciones

> A continuación se presentara un reto, el cual ustedes deberán resolver utilizando el lenguja de programación Java.

# Enunciado

El reto consiste en lo siguiente, se les propocionara un archivo .java que contiene el código de lo visto en las clases 20, 21 y 22; su reto será agregar la funcionalidad de modificar el producto, pero dando oportunidad al cliente de escoger que campos del producto desea modificar. Ejemplo: 

Asumamos que tenemos un producto con los campos: Nombre, Precio y Costo.

```bash
--------------MENU PRINCIPAL--------------
1. Agregar Producto
2. Modificar Producto
3. Eliminar producto
4. Salir
Ingrese una opcion [1-4]: 2

---------------MODIFICAR PRODUCTO---------------
Ingrese la bodega que desea modificar [1-3]: 1
Ingrese el nombre del producto a modificar: prod1

# aquí se listaran los campos que pueden ser modificados si el producto existe
---------------CAMPOS DEL PRODUCTO---------------
1. Nombre
2. Precio
3. Costo
Escoja los campos que desea modificar: 1,3 # posible solución (no necesariamente lo deben hacer así)

Ingrese el nuevo nombre: prodModificado
Ingrese el nuevo costo: 12.5

Producto modificado con exito.


```

Como se puede ver en el ejemplo, al escoger el producto que se desea modificar, se despliega la lista de campos que posee y se le da a escoger al usuario que campos desea modificar, pude escoger todos o puede escoger solamente algunos. 



Cabe recalcar que esto solo es un ejemplo, no necesariamente deben hacerlo así, usen su creatividad y las herramientas que puedan para dar solución al problema.
