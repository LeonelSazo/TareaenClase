/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reproductor;

/**
 *
 * @author Leonel
 */
public class NodoMusic {
     Nombre dato;
    NodoMusic enlace;
    
    public NodoMusic(String x){
        nombre = x;
        enlace=null;
        
    }
    
    public NodoMusic(String x, NodoMusic n){
        nombre= x;
        enlace = n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    
    
    public NodoMusic getEnlace(){
        return enlace;
    }
    
    public void setEnlace(NodoMusic n){
        enlace = n;
    }
}
