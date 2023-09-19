/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadassimple;

import java.util.Scanner;

/**
 *
 * @author basto
 */
class ListaEnlazada {

    private Nodo cabeza;
    private Nodo cola;

    public ListaEnlazada() {
        cabeza = null;
    }

    private String LeerString() {
        Scanner in = new Scanner(System.in);
        String v = in.nextLine();
        return v;
    }

    /*public ListaEnlazada crearLista() {
        int x;
        cabeza = null;
        cola = null;
        do {
            x = LeerString();
            if (x != -1) {
                cabeza = new Nodo(x, cabeza);
                if (cola == null) {
                    cola = new Nodo(x, cola);
                    cola = cabeza;
                }
            }
        } while (x != -1);
        return this;
    }*/

    public ListaEnlazada insertarCabeza(String y) {
        Nodo nuevo = new Nodo(y);
        nuevo.enlace = cabeza;
        cabeza = nuevo;

        // Si la cola es nula o si solo hay un elemento en la lista,
        // establece la cola como el nuevo nodo
        if (cola == null || cola == cabeza) {
            cola = nuevo;
        }

        return this;
    }

    public ListaEnlazada insertarCola(String y) {
        cola.enlace = new Nodo(y);
        cola = cola.enlace;
        return this;
    }

    public void eliminarInicio() {
        if (cabeza != null) {
            cabeza = cabeza.enlace;
        }
    }

    public void eliminarFinal() {
        if (cabeza == null) {
            // La lista está vacía, no hay nada que eliminar.
            return;
        }

        if (cabeza.enlace == null) {
            // Si solo hay un elemento en la lista, la cabeza se convierte en nula.
            cabeza = null;
            return;
        }

        Nodo actual = cabeza;
        while (actual.enlace.enlace != null) {
            actual = actual.enlace;
        }

        actual.enlace = null;
    }

    public void Eliminar(Object entrada) {
        Nodo actual, anterior;
        boolean find;
        //inicializar apuntadores
        actual = cabeza;
        anterior = null;
        find = false;
        //busqueda del nodo y del anterior
        while ((actual != null) && (!find)) {
            find = (actual.valor.equals(entrada));
            if (!find) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        // Distingue entre que el nodo sea el cabecera,
        // o del resto de la lista 
        if (actual != null) {
            if (actual == cabeza) {
                cabeza = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
        }
        actual = null;
    }

    public boolean isEmpty() {
        Nodo actual = cabeza;
        if (actual == null) {
            return true;
        }
        return false;
    }

    public int obtenerLongitud() {
        Nodo actual = cabeza;
        int longitud = 0;

        while (actual != null) {
            longitud++;
            actual = actual.enlace;
        }

        return longitud;
    }

    public void Visualizar() {
        Nodo n;
        int j = 0;

        n = cabeza;
        while (n != null) {
            System.out.println(n.valor + " ");
            n = n.enlace;
            j++;
        }
    }
}
