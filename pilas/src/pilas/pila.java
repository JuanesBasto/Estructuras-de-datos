/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;
import java.util.HashSet;
/**
 *
 * @author usuario
 */
public class pila {
    private int tamaño;
    private nodo cima;
    public pila() {
        this.cima = null;
        this.tamaño = 0;
    }
    public void push (int dato){
        nodo nuevo = new nodo(dato);
        if(cima == null){
            cima = nuevo;
        }else{
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
        tamaño ++;
    }
    public void pop (){
        cima = cima.getSiguiente();
        tamaño --;
    }
    public void mostrar(){
        nodo aux = cima;
        for(int i=0;i<tamaño;i++){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
    public void esvacia(){
    if(cima==null)
        System.out.println("la pila esta vacia");
    else
        System.out.println("la pila no esta vacia");
    }
    public int getTamaño() {
        return tamaño;
    }
}