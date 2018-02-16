
package arbolBinario;

public class Nodo {
    private String dato;
    private Nodo izq;
    private Nodo der;
    
    public Nodo(String dato){
        this.dato = dato;
    }
    
    public Nodo getNodoIzquierdo(){
        return izq;
    }
    
    public Nodo getNodoDerecho(){
        return der;
    }
    
    public void setNodoIzquierdo(Nodo nodo){
        izq = nodo;
    }
    
    public void setNodoDerecho(Nodo nodo){
        der = nodo;
    }
    
    public String getDato(){
        return dato;
    }
}
