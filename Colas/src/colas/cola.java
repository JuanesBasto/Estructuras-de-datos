/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author basto
 */
public class cola {

    private int tamaño;
    private Nodo frente;
    private Nodo fin;

    public cola() {
        this.frente = null;
        this.fin = null;
        this.tamaño = 0;
    }

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tamaño++;
    }

    public void pop() {
        if (frente != null) {
            frente = frente.getSiguiente();
            tamaño--;
            if (frente == null) {
                fin = null;
            }
        }
    }

    public void mostrarInverso(Nodo nodoActual) {
        if (nodoActual == null) {
            return; // Caso base de la recursión
        }
        mostrarInverso(nodoActual.getSiguiente()); // Llamada recursiva para avanzar hacia el final
        System.out.print(nodoActual.getDato()+ " "); // Imprimir el dato después de la llamada recursiva
    }

    public void mostrar() {
        /*Nodo aux = frente;
        while (aux != null) {
            System.out.print(aux.getDato());
            aux = aux.getSiguiente();
        }*/
        mostrarInverso(frente);
    }

    public void esVacia() {
        if (frente == null) {
            System.out.println("La cola está vacia");
        } else {
            System.out.println("La cola no está vacia");
        }
    }

    public int getTamaño() {
        return tamaño;
    }
}
