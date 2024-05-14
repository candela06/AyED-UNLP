package Practica1.Ejercicio7;
import java.util.*;


public class TestArrayList {
    public static boolean esta(Estudiante e, ArrayList<Estudiante> list){
        boolean encontre = false;
        int i=0;
        while(i<list.size() && (!encontre)){
            if (list.get(i).equals(e)){
                encontre=true;
            }
            i++;
        }
        return encontre;
    }
    
    public static void metodo7d(){
        
        //■ cree una lista que contenga 3 estudiantes
        ArrayList<Estudiante> listaEst = new ArrayList<Estudiante>();
        listaEst.add(new Estudiante("candela","silva","informatica"));
        listaEst.add(new Estudiante("melnay","silva","ingenieria"));
        listaEst.add(new Estudiante("namjoon","kim","psicologia"));
        
        //■ genere una nueva lista que sea una copia de la lista del inciso i
        ArrayList<Estudiante> clista = new ArrayList<Estudiante>(listaEst);
        
        //■ imprima el contenido de la lista original y el contenido de la nueva lista
        System.out.println("----- primera lista -----");
        for (Estudiante e: listaEst){
            System.out.println(e.getNombre() + " " + e.getApellido() + ", " + e.getFacultad());
        }
        System.out.println("----- lista copiada -----");
        for (Estudiante e: clista){
            System.out.println(e.getNombre() + " " + e.getApellido() + ", " + e.getFacultad());
        }
        
        //■ modifique algún dato de los estudiantes
        Estudiante ests = listaEst.get(0);
        ests.setNombre("soobin");
        ests.setApellido("choi");
        ests.setFacultad("artes");
        
        //■ vuelva a imprimir el contenido de la lista original y el contenido de la nueva lista.
        System.out.println("\n----- lista modificada ----- ");
        for(Estudiante e: listaEst){
            System.out.println(e.getNombre() + " " + e.getApellido() + ", " + e.getFacultad());
        }
        System.out.println("----- lista copiada -----");
        for ( Estudiante e: clista){
            System.out.println(e.getNombre() + " " + e.getApellido() + ", " + e.getFacultad());
        }
        /* por más que el cambio no haya sido en listaEst, se modifica también en la lista copiada, 
            por lo tanto deben apuntar a la misma dirección de memoria*/
        
        
        System.out.println("\n-----NUEVO ESTUDIANTE -----");
        Estudiante testEst = new Estudiante("jungkook","jeon","artes");
        if (!esta(testEst,listaEst)){
            listaEst.add(testEst);
            System.out.println("\nEstudiante agregado exitosamente!!");
        }
        else System.out.println("El estudiante ya existe.");
    }
    


    public static void main(String[]args){
        Scanner escaner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        System.out.println("----- INGRESE NUMEROS (-1 PARA FINALIZAR) -----");
        Integer e = escaner.nextInt();
        while (e!=999){
            lista.add(e);
            e = escaner.nextInt();
        }
        System.out.println("\nLISTA:");
        for(int i: lista){
            System.out.println(i);
        }
        escaner.close();
        metodo7d();
       
    } 
}
