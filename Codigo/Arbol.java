
package arbolBinario;

public class Arbol {

    
    public static void main(String[] args) {
       Nodo raiz = new Nodo("1");
       Nodo nodo2 = new Nodo("A");
       Nodo nodo3 = new Nodo("B");
       
       raiz.setNodoIzquierdo(nodo2);
       raiz.setNodoDerecho(nodo3);
       nodo2.setNodoIzquierdo(new Nodo("4"));
       nodo2.setNodoDerecho(new Nodo("7"));
       nodo3.setNodoIzquierdo(new Nodo("5"));
       nodo3.setNodoDerecho(new Nodo("6"));
       
        System.out.println("Preorden");
        preOrden(raiz);
        System.out.println("");
        System.out.println("PostOrden");
        postOrden(raiz);
    }
    
    private static void preOrden(Nodo raiz){
        if(raiz != null){
            System.out.print(raiz.getDato()+" - ");
            preOrden(raiz.getNodoIzquierdo());
            preOrden(raiz.getNodoDerecho());
        }
    }
    
    private static void postOrden(Nodo raiz){
        if(raiz != null){
            postOrden(raiz.getNodoIzquierdo());
            postOrden(raiz.getNodoDerecho());
            System.out.print(raiz.getDato()+" - ");
        }
    }
    
}

