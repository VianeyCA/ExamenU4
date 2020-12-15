
package recorridosexamen;

import java.util.Scanner;

public class RecorridosExamen {

    public static void main(String[] args) {
        // TODO code application logic here
        int opc=0;
         int elemento;
         String nombre;
         ArbolBinario arbol=new ArbolBinario();
         ArbolBinario arbolE= new ArbolBinario();
         
         Scanner leer= new Scanner(System.in);
         for (int i = 0; i < 10; i++) {
             System.out.println("Primer Arbol");
             System.out.print("Ingresa el numero del nodo: ");
             elemento=leer.nextInt();
             System.out.print("Ingresa el nombre del nodo: ");
             nombre=leer.next();
             arbol.agregarNodo(elemento, nombre);
             System.out.println(""); 
        }
         for (int i = 0; i < 10; i++) {
             System.out.println("Segundo Arbol");
             System.out.print("Ingresa el numero del nodo: ");
             elemento=leer.nextInt();
             System.out.print("Ingresa el nombre del nodo: ");
             nombre=leer.next();
             arbolE.agregarNodo(elemento, nombre);
             System.out.println(""); 
        }
         
         System.out.println("--------------------Primer Arbol--------------------");
         System.out.println("Recorrido en In-Orden");
         if(!arbol.estaVacio()){
             arbol.inOrden(arbol.raiz);
             }else{
                   System.out.println("El árbol esta vacio");
                  }
         System.out.println("Recorrido en  Pre-Orden");
         arbol.PreOrden(arbol.raiz);
         
         System.out.println("Recorrido en Pos-Orden");
         arbol.PostOrden(arbol.raiz);
         System.out.println("--------------------Segundo Arbol--------------------");
         System.out.println("Recorrido en In-Orden");
         if(!arbolE.estaVacio()){
             arbolE.inOrden(arbolE.raiz);
             }else{
                   System.out.println("El árbol esta vacio");
                  }
         System.out.println("Recorrido en  Pre-Orden");
         arbolE.PreOrden(arbolE.raiz);
         
         System.out.println("Recorrido en Pos-Orden");
         arbolE.PostOrden(arbolE.raiz);
    }
    
}
