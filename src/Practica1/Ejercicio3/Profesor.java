/*
Cree una clase llamada Profesor con los atributos especificados abajo y sus
correspondientes métodos getters y setters (haga uso de las facilidades que brinda
eclipse)
● nombre
● apellido
● email
● catedra
● facultad
 */
package Practica1.Ejercicio3;

/**
 *
 * @author Candela
 */
public class Profesor extends Persona {
    private String catedra;
    private String facultad;

    public Profesor(String catedra, String facultad, String nombre, String apellido, String email) {
        super(nombre, apellido, email);
        this.setCatedra(catedra);
        this.setFacultad(facultad);
    }

    public String getCatedra() {
        return catedra;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String tusDatos() {
        return super.tusDatos()+ " catedra=" + this.getCatedra() + ", facultad=" + this.getFacultad();
    }
 
    
}
