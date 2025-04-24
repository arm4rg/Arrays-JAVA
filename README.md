# Proyecto en Java: Manipulación de Arrays

Este programa en Java permite realizar diversas operaciones sobre un arreglo de 10 números enteros. El programa incluye funcionalidades para mostrar el arreglo, calcular la suma de los números, encontrar el número máximo y el mínimo e invertir el orden del arreglo.

## Requisitos

- JDK 21 o posteriores
- JVM instalado en el equipo
- Un entorno de desarrollo `IDE` o editor de textos adecuado para ejecutar programas Java. (Visual Studio Code, Eclipse, etc.)

## Ejecución:

1. Clona el repositorio:
   ```bash
   git clone https://github.com/arm4rg/Arrays-JAVA.git)
   cd Arrays-JAVA
2. Compila el programa:
   ```bash
   javac App.java
3. Ejecuta el programa:
   ```bash
   java App
## Descripción del Código
1. Al iniciar el programa, se limpia la consola y se llama al método `LlenarArray()` para llenar el arreglo con los números proporcionados por el usuario.
2. Luego, se presenta un menú de opciones con un ciclo que se repite hasta que el usuario selecciona la opción para salir (opción 5).
3. Dependiendo de la opción seleccionada, se ejecuta el método correspondiente para mostrar resultados, como la suma de los elementos, el valor máximo y mínimo, o el arreglo invertido.

### Librerías Importadas

El programa utiliza las siguientes librerías estándar de Java:
- `java.util.Scanner`: Para la entrada de datos desde la consola.
- `java.util.Arrays`: Para manipular y mostrar arreglos.
- `java.util.InputMismatchException`: Para manejar excepciones al ingresar datos incorrectos.

#### Variables Globales
- `sc`: Objeto de tipo `Scanner` para capturar entradas del usuario.
- `Array`: Arreglo de enteros de tamaño 10 que almacena los números introducidos por el usuario.

#### Métodos Utilizados

1. **LimpiaCon()**: 
   - Limpia la consola para mejorar la visualización del programa después de cada acción.

2. **LlenarArray()**: 
   - Solicita al usuario ingresar 10 números enteros, manejando posibles errores de tipo de entrada con `InputMismatchException`.

3. **MostrarAo()**:
   - Muestra el arreglo en el orden que se ingresaron los números.

4. **SumaA()**:
   - Calcula la suma de todos los números del arreglo y la imprime en consola.

5. **MaxyMin()**:
   - Encuentra y muestra el valor máximo y mínimo en el arreglo.

6. **InvertA()**:
   - Invierte el orden de los elementos del arreglo y lo muestra en consola.

7. **menu()**:
   - Muestra un menú interactivo al usuario con las siguientes opciones:
     - Mostrar el arreglo original.
     - Calcular la suma de los elementos.
     - Buscar el número máximo y el número mínimo.
     - Invertir el arreglo.
     - Salir del programa.

## Autor
Luis Armando Reyes Argueta.

## Uso
El programa tiene un uso exclusivo educativo.
