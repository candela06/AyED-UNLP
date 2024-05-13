/*
Escriba una clase llamada TestArrayList cuyo método main recibe una secuencia de
números, los agrega a una lista de tipo ArrayList, y luego de haber agregado todos los
números a la lista, imprime el contenido de la misma iterando sobre cada elemento.

 */
package Practica1.Ejercicio7;

import java.util.*;
public class TestArrayList {

    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(21);
        num.add(52);
        num.add(18);
        num.add(25);
        
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        ArrayList<Estudiante> listaEsts= new ArrayList<Estudiante>();
        listaEsts.add(new Estudiante("candela","silva","informatica"));
        listaEsts.add(new Estudiante("melnay","silva","ingenieria"));
        listaEsts.add(new Estudiante("namjoon","kim","psicologia"));
        
        ArrayList<Estudiante> copiaEsts= new ArrayList<Estudiante>(listaEsts);
        
        listaEsts.trimToSize();
        copiaEsts.trimToSize();
        
        Iterator<Estudiante> it1 = listaEsts.iterator();
        Iterator<Estudiante> it2 = copiaEsts.iterator();
        
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
    

    
}
