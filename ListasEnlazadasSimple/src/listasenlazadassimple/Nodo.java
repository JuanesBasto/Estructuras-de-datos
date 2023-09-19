/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadassimple;

/**
 *
 * @author basto
 */
public class Nodo {
    
    String   valor;
    Nodo enlace;
    
    public Nodo(String valor){
        this. valor= valor;
        this. enlace=null;
    }
    public Nodo(String x, Nodo n ){
        this. valor= x;
        this. enlace=n;
    }

    public String getValor() {
        return valor;
    }

    public Nodo getEnlace() {
        return enlace;
    }
    
    public void setEnlace(Nodo n){
        this. enlace = n;
    }
    
    
}