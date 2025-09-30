/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package floresrivera_29092025;

/*
Nancy Beatriz Flores Rivera - FR100524
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciamos la variable (referencia o puntero)
        BusquedaBinaria Buscar = new BusquedaBinaria ();
        //Se establece un arreglo unidimensional
        int [] Arreglo = {17, 19, 21, 23, 25, 27, 29, 31};
        
        int[][] Matriz = {
            {1,3,5},
            {7,9,11},
            {13,15,17}
        };
        //Se establece un valor a buscar
        int A_Buscar = 11;
        //Se implementa el método y mediante la herencia se ejecuta
        int Posicion = Buscar.BuscarEnteroArray(Arreglo, A_Buscar);
        //Se evalúa el resultado devuelto por el método
        if (Posicion != -1){
            System.out.println("El valor: " + A_Buscar + " esta en la posicion: " + Posicion);
        }
        else { 
            System.out.println("No se encontro el valor de: " + A_Buscar);
        }
        //Implementación del método de búsqueda en una matriz
        Buscar.BuscarEnteroMatriz(Matriz, A_Buscar);
        
    }
}
