package recorridosexamen;
public class Nodo {

    private int dato;
    private Nodo HijoIzq, HijoDer;

    public Nodo(int d) {
        this.dato = d;
        this.HijoIzq = null;
        this.HijoDer = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHijoIzq() {
        return HijoIzq;
    }

    public void setHizq(Nodo Hizq) {
        this.HijoIzq = Hizq;
    }

    public Nodo getHder() {
        return HijoDer;
    }

    public void setHder(Nodo Hder) {
        this.HijoDer = Hder;
    }

    @Override
    public String toString() {
        return "[" + dato + "]";
    }
}
