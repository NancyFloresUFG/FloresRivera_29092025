/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package floresrivera_29092025;

/*
Nancy Beatriz Flores Rivera - FR100524
 */
//Esta clase se convertirá en un objeto de memoria RAM en la computadora
public class BusquedaBinaria {
    //Método para realizar una búsqueda binaria de un arreglo unidimensional
    public int BuscarEnteroArray (int [] Arreglo, int ValorBuscado) {
        //Se declaran las variables de inicioy fin
        int Inicio = 0;
        int Fin = Arreglo.length;
        //Se realiza la ejecuciónde búsqueda mientras el arreglo tenga al menos un elemento
        while (Inicio <= Fin){
            //Se obtiene la posición del centro del arreglo
            int Medio = (Inicio + Fin) / 2;
            //Se evalúa si el elemento en la posición media es igual al valor buscado
            if(Arreglo [Medio]== ValorBuscado){
                return Medio;
            }
            else if (Arreglo[Medio] < ValorBuscado){
                //Se evalúa si el elemento en la posición media es menor que el valor buscado
                Inicio = Medio + 1;
            }
            else {
                //Se deduce que el elemento es mayor, por lo tanto, el fin cambia
                Fin = Medio - 1;
            }
        }
        //Se devuelve -1 cuando no hay valores encontrados
        return -1;
    }
    //Método para buscar un valor en una matriz
    public void BuscarEnteroMatriz (int [][] Matriz, int Objetivo){
        //Se declaran las filas y las columnas para conocer la dimensión de la matriz
        int Filas = Matriz.length;
        int Columnas = Matriz[0].length;
        //Se establece el inicio y el fin de la matriz
        int Inicio = 0;
        //Cantidad total de elementos en la matriz
        int Fin = (Filas * Columnas) - 1;
        //Bandera que indica si el valor fue encontrado
        boolean Encontrado = false;
        //Se realiz una repetición mientras la matriz posea al menos un elemento
        while (Inicio <= Fin) {
            //Se deduce el punto medio de la matriz
            int Medio = (Inicio + Fin) / 2;
            //Se simula el arreglo bidimensional como un arreglo unidimensional
            int f = Medio/Columnas; //¿Cuál fila es? (Cuantas filas completas existen antes del punto medio)
            int c = Medio % Columnas;// ¿Cúal columna es? (Posición exacta de la columna)
            //Se evalúa si el valor buscado se encuentra en la posición media
            if (Matriz[f][c] == Objetivo){
                System.out.println("En la matriz, el elemento encontrado esta en la posicion [" + f + "] [" + c + "]");
                //Se encontró el valor buscado
                Encontrado = true;
                break;
            }
            else if (Matriz[f][c] < Objetivo){
                //Se evalúa si el valor del punto medio es menor
                Inicio = Medio + 1;
            }
            else {
                //El valor del punto medio es mayor
                Fin = Medio - 1;
            }
        }
        //Se evalúa la bandera por si acaso no se encontró ningún valor
        if(Encontrado == false){
            //Se imprime la salida en consola
            System.out.println("El elemento buscado no ha sido encontrado en la matriz.");
        }      
    }// Fin del método   
}
