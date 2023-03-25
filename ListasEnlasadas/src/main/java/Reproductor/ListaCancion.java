/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reproductor;

/**
 *
 * @author Leonel
 */
public class ListaCancion {
    public Nodo primero;
    
    public Lista(){
        primero = null;
    }
    
    private int leerEntero(){
        System.out.println("Ingrese valor, -1 para terminar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
    
    public Lista crearLista(){
        int x=0;
        primero = null;
        do{
            x=leerEntero();
            if(x != -1){
            primero = new Nodo(x,primero);
        }
        }while (x != -1);
    return this;
    }
    
    
    
    //Insertar elemento en una parte especifica de la lista
    public Lista insertarLista(int testigo, int entrada){//testigo = valor a buscar en el nodo de la lista
        Nodo nuevo, anterior;
        anterior = buscarLista(testigo);
        if (anterior != null){
            nuevo = new Nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }
}
