/*
Cree una clase llamada Estudiante con los atributos especificados abajo y sus
correspondientes métodos getters y setters (haga uso de las facilidades que brinda
eclipse)
● nombre
● apellido
● comision
● email
● direccion
 */
package Practica1.Ejercicio3;

/**
 *
 * @author Candela
 */
public class Estudiante extends Persona{
    private String comision;
    private String direccion;

    public Estudiante(String comision, String direccion, String nombre, String apellido, String email) {
        super(nombre, apellido, email);
        this.setComision(comision);
        this.setDireccion(direccion);
    }

    public String getComision() {
        return comision;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String tusDatos() {
        return super.tusDatos()+ " comision=" + this.getComision() + ", direccion=" + this.getDireccion();
    }

    
}
