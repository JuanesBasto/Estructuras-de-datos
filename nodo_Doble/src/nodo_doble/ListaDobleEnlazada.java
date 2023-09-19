/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodo_doble;

/**
 *
 * @author Usuario
 */

class ListaDobleEnlazada {
    NodoDoble inicio;
    NodoDoble fin;
    int longitud;

    public ListaDobleEnlazada() {
        this.inicio = null;
        this.fin = null;
        this.longitud = 0;
    }

 
    public void insertarAlPrincipio(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.siguiente = inicio;
            inicio.anterior = nuevoNodo;
            inicio = nuevoNodo;
        }
        longitud++;
    }

    public void insertarAlFinal(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.anterior = fin;
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
        longitud++;
    }

   
    public void retirarAlPrincipio() {
        if (inicio != null) {
            inicio = inicio.siguiente;
            if (inicio != null) {
                inicio.anterior = null;
            } else {
                fin = null; 
            }
            longitud--;
        }
    }

    public void retirarAlFinal() {
        if (fin != null) {
            fin = fin.anterior;
            if (fin != null) {
                fin.siguiente = null;
            } else {
                inicio = null; 
            }
            longitud--;
        }
    }

   
    public void consultar() {
        NodoDoble actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    public void consultarFinal() {
        NodoDoble actual2 = fin;
        while (actual2 != null) {
            System.out.print(actual2.dato + " ");
            actual2 = actual2.anterior;
        }
        System.out.println();
    }

    public int longitud() {
        return longitud;
    }

   
    public boolean estaVacia() {
        return inicio == null;
    }
}

