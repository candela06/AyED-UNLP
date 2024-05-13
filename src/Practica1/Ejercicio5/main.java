/*
Dado un arreglo de valores tipo entero se desea calcular el valor máximo, mínimo, y promedio
en un único método. Escriba tres métodos de clase, donde respectivamente:
a. Devuelva lo pedido por el mecanismo de retorno de un método en Java ("return").
b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede ser de
tipo arreglo).
c. Devuelva lo pedido sin usar parámetros ni la sentencia "return"
 */
package Practica1.Ejercicio5;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = {1,6,3,8,9};
        Resultados r= new Resultados();
        
        
        System.out.println(Calculadora.maxMinPromA(num));
        Calculadora.minMaxPromB(num, r);
        System.out.println(r.toString());
        Calculadora.maxMinPromc(num);
        System.out.println(Calculadora.ResultadoC());
    }
    
}
