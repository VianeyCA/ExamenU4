
package recorridosexamen;

import java.util.Scanner;

public class RecorridosExamen {
            public static void main(String[] args) {
         // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         Arbol arbol = new Arbol();
         int dato;
         System.out.println("----------------Inserción de Datos----------------");
         for (int i = 0; i < 10; i++) {
             System.out.print("Ingresa un nodo: ");
             dato = leer.nextInt();
             arbol.agregar(dato);
         }
         System.out.println("");
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("                    Impresión                     ");
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("");
         System.out.println("+------------------Arbol Normal--------------------");
         System.out.println("Pre-Orden");
         arbol.PreOrden(arbol.getRn());
         System.out.println("");
         System.out.println("In-Orden");
         arbol.PostOrden(arbol.getRn());
         System.out.println("");
         System.out.println("Post-Orden");
         arbol.InOrden(arbol.getRn());
         System.out.println("");
         System.out.println("");
         System.out.println("--------------------Arbol Espejo-------------------");
         System.out.println("Pre-Orden");
         arbol.PreOrden(arbol.getRe());
         System.out.println("");
         System.out.println("In-Orden");
         arbol.InOrden(arbol.getRe());
         System.out.println("");
         System.out.println("Post-Orden");
         arbol.PostOrden(arbol.getRe());
         System.out.println("");
    }
