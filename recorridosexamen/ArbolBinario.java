 package recorridosexamen;           
public class Arbol {

    private Nodo Rn;
    private Nodo Re;
    

    public boolean vacioNormal() {
        if (Rn==null){
              return true;
          }else{
              return false;
          }
    }

    public boolean vacioEspejo() {
        if (Re==null){
              return true;
          }else{
              return false;
          }
    }

    public Nodo getRn() {
        return Rn;
    }

    public Nodo getRe() {
        return Re;
    }

    public void agregar(int dato) {
        insertar(Rn, Re, dato);
    }

    private void insertar(Nodo a, Nodo a2, int d) {
        if (vacioNormal()) {
            Rn = new Nodo(d);
            Re = new Nodo(d);
        } else if (a.getDato() > d) {
            if (a.getHijoIzq()== null) {
                a.setHizq(new Nodo(d));
                //
                a2.setHder(new Nodo(d));
            } else {
                insertar(a.getHijoIzq(), a2.getHder(), d);
            }
        } else {
            if (a.getHder() == null) {
                a.setHder(new Nodo(d));
                //
                a2.setHizq(new Nodo(d));
            } else {
                insertar(a.getHder(), a2.getHijoIzq(), d);
            }
        }
    }

    public void PreOrden(Nodo n) {
        if (n!= null) {
            System.out.print(n);
            PreOrden(n.getHijoIzq());
            PreOrden(n.getHder());
        }
    }

    public void InOrden(Nodo n) {
        if (n!= null) {
            InOrden(n.getHijoIzq());
            System.out.print(n);
            InOrden(n.getHder());
        }
    }

    public void PostOrden(Nodo n) {
        if (n!= null) {
            PostOrden(n.getHijoIzq());
            PostOrden(n.getHder());
            System.out.print(n);
        }
    }
}
