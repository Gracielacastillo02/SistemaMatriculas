/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamatriculas;

/**
 *
 * @author graci
 */
public class Estudiante {
    // Atributos
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private String correo;

    //Constructor vacío
    public Estudiante() {
        this.cedula = 0;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.carrera = "";
        this.correo = "";
    }
    
    // Constructor con parámetros
    public Estudiante(int cedula, String nombre, String apellido, int edad, String carrera, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.correo = correo;
    }
    
    //Gets y sets
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
