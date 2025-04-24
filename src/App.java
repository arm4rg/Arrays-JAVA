/*Librerias a utilizar en el programa */
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

/*Clase Principal */
public class App {
    public static Scanner sc = new Scanner(System.in);                  //Objeto para ingresar datos al sistema
    public static int[] Array = new int [10];                           //Arreglo global para usarlo en cualquier método del sistema

    /*Método para limpiar la consola */
    public static void LimpiaCon(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /*Método para rellenar las casillas del Arreglo */
    public static void LlenarArray(){
        /*Ingresará los datos y capturará los errores de ingreso*/
        for(int i=0; i<Array.length; i++){
            System.out.print("Ingresa el número " +(i+1) + ": "); 
                try {
                   Array[i] = sc.nextInt();
                } catch (InputMismatchException e) {
                System.out.println("Los caracteres ingresados no son válidos, ingreselos nuevamente.");
                sc.next();           //Limpia la entrada del teclado
                LlenarArray();
             }
                LimpiaCon();                                                       //Cada vez que ingrese un valor se limpiará la consola
            }
            menu();                                                                //Irá al menú de opciones
        
    }


    public static void MostrarAo (){
        System.out.println("El arreglo original es: " +Arrays.toString(Array));     //Muestra el Arreglo convertido en un String
    }

    public static void SumaA(){
        int suma=0;
        /*Ciclo for para recorrer cada casilla del arreglo y sumarla a una variable independiente del método. */
        for(int i=0; i<Array.length; i++){
            suma+= Array[i];
        }
        System.out.println("La suma del array es: " + suma);    //Imprime el valor final de la variable suma.
    }

    public static void MaxyMin(){
        int Menor = Array[0];                           //La variable menor número inicia con el mismo valor que la casilla inicial del arreglo
        int Mayor = Array [0];                          //La variable mayor número inicia con el mismo valor que la casilla inicial del arreglo
       
        /*Ciclo for para comparar el valor de las casillas del arreglo con el valor de la variable mayor número*/
        for (int i=0; i<Array.length; i++){     
            if (Array[i] > Mayor){
                Mayor = Array[i];       //Si el valor de la casilla del arreglo es mayor que la variable mayor entonces, la variable mayor adquiere ese valor.
            }
        }
        System.out.println("El número mayor es: " +Mayor);

        /*Ciclo for para comparar el valor de las casillas del arreglo con el valor de la variable menor número */
        for (int i=0; i<Array.length; i++){
            if (Array[i] < Menor){
                Menor = Array[i];
            }
        }
        System.out.println("El número menor es: " +Menor);

    }

    public static void InvertA(){
        int[] Array2 = new int [Array.length];          //Crea un nuevo arreglo a partir del tamaño del arreglo original
        int pos = Array.length-1;                       //una variable para la cantidad de casillas del arreglo restando 1 unidad a la longitud del arreglo original.

        for (int i = 0; i<Array.length; i++){
            Array2[i] = Array[pos];                     //Al arreglo 2 le asigna el valor de la ultima casilla del arreglo original
            pos--;                                      //La variable posición disminuirá 1 unidad para asi asignarle la nueva última posición al arreglo nuevo.
        }
        System.out.println("El arreglo inverso es: " +Arrays.toString(Array2));
      
    }

    /*Método para el menú de opciones */
    public static void menu(){
        int Opcion = 0;
        LimpiaCon();        //Limpiará los datos ingresados 
        /*Ciclo Hacer mientras para mostrar el menú hasta culminar ejecución */
        do{
            System.out.println("*****************************************************************");
            System.out.println("                     Menú");
            System.out.println("1) Mostrar el array original");
            System.out.println("2) Calcular la suma de los elementos");
            System.out.println("3) Buscar el número máximo y el número mínimo");
            System.out.println("4) Invertir el array ");
            System.out.println("5) Salir");
            System.out.print("Seleccione una opción:  ");
            try {
                Opcion = sc.nextInt();
            } catch (InputMismatchException e) {
              System.out.println("El caracter ingresado no es válido, ingrese uno nuevamente.");
              sc.next();            //Limpia el ingreso de datos del teclado.
              Opcion =0;            //Asigna el valor inicial de la varible para que se vuelva a ejecutar el menú
            }
            /*Selector según opción ingresada */
            switch (Opcion) {
                case 1:
                    LimpiaCon();
                    MostrarAo();    //Dirige al método que muestra el arreglo
                    break;

                case 2:
                    LimpiaCon();       
                    SumaA();        //Dirige al método que suma los valores del arreglo
                    break;
                
                case 3:
                    LimpiaCon();
                    MaxyMin();      //Dirige al método que encuentra el valor máximo y mínimo del arreglo
                    break;
                
                case 4:
                    LimpiaCon();
                    InvertA();      //Dirige al método que invierte los valores de las casillas del arreglo
                    break;
                
                case 5:
                    LimpiaCon();
                    sc.close();     //Cierra el objeto que utilizamos para ingresar valores al sistema
                    System.out.println("Saliendo del programa....");
                    break;

                default:
                    LimpiaCon();
                    System.out.println("La opción ingresada no es válida, seleccione una nuevamente.");
                    break;
            }
           
        }while(Opcion!=5);          //Se ejecuta el ciclo hasta que el valor ingresado en la opción sea igual a 5.
    }
    
    public static void main(String[] args) throws Exception {
        LimpiaCon();        //Limpia la consola al iniciar ejecución
        LlenarArray();      //Dirige al método para llenar el arreglo
        }
}