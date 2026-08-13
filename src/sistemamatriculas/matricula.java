/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamatriculas;

/**
 *
 * @author Student
 */
public class matricula {
   private String codigoMatricula;
   private Estudiante estudiante;
   private Profesor profesor;
   private String curso;
   private String fecha;

    public matricula(String codigoMatricula, Estudiante estudiante, Profesor profesor, String curso, String fecha) {
        this.codigoMatricula = codigoMatricula;
        this.estudiante = estudiante;
        this.profesor = profesor;
        this.curso = curso;
        this.fecha = fecha;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
