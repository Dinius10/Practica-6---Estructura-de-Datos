package abb;

public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public ArbolBinarioBusqueda(){
        raiz = null;
    }


    //Arbol esta vacio o no

    public boolean estaVacio(){
        return raiz == null;
    }

    //METODO RECURSIVO PARA INSERTAR UN NODO A NUESTRO ABB

    private void insertar(Nodo padre, Nodo hijo, int dato) {
        if (hijo==null) {//caso base
             Nodo nuevo = new Nodo(null,dato,null);
             if(dato >= padre.getDato()){
                 padre.setDerecho(nuevo);
             }else{
                 padre.setIzquierdo(nuevo);
             }
        } else {//llama recursiva
            if(dato >= padre.getDato()){
                insertar(hijo, hijo.getDerecho(), dato);
            }else{
                insertar(hijo, hijo.getIzquierdo(), dato);
            }
        }
    }

    //METODO AUXILIAR PARA INSERTAR UN NUEVO NODO AL ABB
    public void insertar(int dato) {
       if (estaVacio()){
          Nodo nuevo = new Nodo(null, dato, null);
          raiz = nuevo;
       }else{
          if (dato >= raiz.getDato()){
              insertar(raiz, raiz.getDerecho(), dato);
          }else{
              insertar(raiz, raiz.getIzquierdo(), dato);
          }
       }
    }

    //METODO RECURSIVO PARA RECORRER/MOISTRAR EL ARBOL INORDEN
    private void mostrarInOrden(Nodo nodo){
        if(nodo == null){//caso base

        }else{//llamada recursiva
           mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + "  ");
            mostrarInOrden(nodo.getDerecho());
        }
    }

    //METODO AUXILIAR PARA RECORREO/MOSTRAR EL ARBOL INORDEN
    public void mostrarInOrden(){
        Nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }

    //METODO RECURSIVO PARA RECORRER/MOISTRAR EL ARBOL PREORDEN
    private void mostrarPreOrden(Nodo nodo){
        if(nodo == null){//caso base

        }else{//llamada recursiva
            System.out.print(nodo.getDato() + "  ");
            mostrarPreOrden(nodo.getIzquierdo());
            mostrarPreOrden(nodo.getDerecho());
        }
    }
    //METODO AUXILIAR PARA RECORREO/MOSTRAR EL ARBOL PREORDEN
    public void mostrarPreOrden(){
        Nodo temp = raiz;
        mostrarPreOrden(raiz);
        System.out.println();
    }

    //METODO RECURSIVO PARA RECORRER/MOISTRAR EL ARBOL PostORDEN
    private void mostrarPostOrden(Nodo nodo){
        if(nodo == null){//caso base

        }else{//llamada recursiva
            mostrarPostOrden(nodo.getIzquierdo());
            mostrarPostOrden(nodo.getDerecho());
            System.out.print(nodo.getDato() + "  ");
        }
    }
    //METODO AUXILIAR PARA RECORREO/MOSTRAR EL ARBOL PostORDEN
    public void mostrarPostOrden(){
        Nodo temp = raiz;
        mostrarPostOrden(raiz);
        System.out.println();
    }

}
