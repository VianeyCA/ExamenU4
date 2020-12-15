package recorridosexamen;

 public class NodoArbol {
     int dato;
     NodoArbol hijoIzq;
     NodoArbol hijoDer;
     String nombre;
     public NodoArbol(int dato, String nom){
         this.dato=dato;
         this.nombre=nom;
         this.hijoIzq=null;
         this.hijoDer=null;
     }
     
     //Muestra la informacion completa del nodo
     @Override
     public String toString(){
         return nombre+"Sus datos es "+dato;
     }
 }

