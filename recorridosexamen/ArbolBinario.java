 package recorridosexamen;

 public class ArbolBinario {
     NodoArbol raiz;
     
     public ArbolBinario(){
         raiz=null;
     }
     
     //Inserta un nodo al arbol
     public void agregarNodo(int d, String nom){
         NodoArbol nuevo= new NodoArbol(d, nom);
         if(raiz==null){
             raiz=nuevo;
         }else{
             NodoArbol auxiliar=raiz;
             NodoArbol padre;
             while(true){
                 padre=auxiliar;
                 if(d<auxiliar.dato){
                     auxiliar=auxiliar.hijoIzq;
                     if(auxiliar==null){
                         padre.hijoIzq=nuevo;
                         return;
                     }
                 }else{
                     auxiliar=auxiliar.hijoDer;
                     if(auxiliar==null){
                         padre.hijoDer=nuevo;
                         return;
                     }
                 }
             }
         }
        
     }
     
     public boolean estaVacio(){
         return raiz==null;
     }
     
     public void inOrden(NodoArbol n){
         if(n!=null){
             inOrden(n.hijoIzq);
             System.out.println(n.dato);
             inOrden(n.hijoDer);
         }
     }
     
      public void PreOrden(NodoArbol n) {
         if (n != null) {
             System.out.print(n);
             PreOrden(n.hijoIzq);
             PreOrden(n.hijoDer);
         }
     }

     public void PostOrden(NodoArbol n) {
         if (n != null) {
             PostOrden(n.hijoIzq);
             PostOrden(n.hijoDer);
             System.out.println(n);
         }
     }
     
 }
