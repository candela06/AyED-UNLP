/*
Escriba una clase llamada Test con el método main, el cual cree un arreglo con 2
objetos Estudiante, otro arreglo con 3 objetos Profesor, y luego recorra ambos
arreglos imprimiendo los valores obtenidos mediante el método tusDatos(). Recuerde
asignar los valores de los atributos de los objetos Estudiante y Profesor invocando los
respectivos métodos setters.

 */
package Practica1.Ejercicio3;

public class Test {

    public static void main(String[] args) {
        
        Estudiante[] estudiantes = new Estudiante[2];
        Profesor[] profesores = new Profesor[3];
        
        estudiantes[0]= new Estudiante("B","La Plata","candela","silva","cande@gmail.com");
        estudiantes[1]= new Estudiante("A","La Plata","melany","silva","mel@gmail.com");
        
        profesores[0]= new Profesor("A3","informatica","juan","torres","juan@gmail.com");
        profesores[1]= new Profesor("B3","ingenieria","manuel","diaz","manuel@gmail.com");
        profesores[2]= new Profesor("C3","psicologia","namjoon","kim","kim@gmail.com");
        
        for(Estudiante e: estudiantes){
            System.out.println(e.tusDatos());
        }
        for(Profesor p: profesores){
            System.out.println(p.tusDatos());
        }
    }
    
    
}
