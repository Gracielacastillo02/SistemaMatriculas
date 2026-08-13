/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamatriculas;

/**
 *
 * @author valem
 */
public class Profesor {
   
    private String nom;
    private int cedula;
    private String correo;
    private String direccion;
    private String materia;
    private int numTelefono;

    public Profesor(String nom, int cedula, String correo, String direccion, String materia, int numTelefono) {
        this.nom = nom;
        this.cedula = cedula;
        this.correo = correo;
        this.direccion = direccion;
        this.materia = materia;
        this.numTelefono = numTelefono;
    }
    
    public Profesor() {
        this.nom = "";
        this.cedula = 0;
        this.correo = "";
        this.direccion = "";
        this.materia = "";
        this.numTelefono = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getmateria() {
        return materia;
    }

    public void setmateria(String materia) {
        this.materia = materia;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
    
}
