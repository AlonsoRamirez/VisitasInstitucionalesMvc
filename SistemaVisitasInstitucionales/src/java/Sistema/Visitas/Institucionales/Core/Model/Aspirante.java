/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Core.Model;

import java.util.List;

/**
 *
 * @author Robert Bonilla
 */
public class Aspirante {
     int id;
    String nombre;
    String apellido;
    String telefono;
    String correo;
    String fechaIngreso;
    int id_carrera1;
    int id_carrera2;
    int id_institucion;
    List<Institucion> listInstitucion;
    List<Escuela> listCarrera;
    List<Escuela> listCarrera2;

    public Aspirante() {
    }

    public Aspirante(int id, String nombre, String apellido, String telefono, String correo, String fechaIngreso, int id_carrera1, int id_carrera2, int id_institucion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaIngreso = fechaIngreso;
        this.id_carrera1 = id_carrera1;
        this.id_carrera2 = id_carrera2;
        this.id_institucion = id_institucion;
    }
     public Aspirante(int id, String nombre, String apellido, String telefono, String correo, String fechaIngreso, int id_carrera1, int id_carrera2, int id_institucion,List<Institucion> listInstitucion,List<Escuela> listEscuela,List<Escuela> listEscuela2) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaIngreso = fechaIngreso;
        this.id_carrera1 = id_carrera1;
        this.id_carrera2 = id_carrera2;
        this.id_institucion = id_institucion;
        this.listInstitucion = listInstitucion;
        this.listCarrera = listEscuela;
        this.listCarrera2 = listEscuela2;
    }

    public Aspirante(int id, String nombre, String apellido, String telefono, String correo, String fechaIngreso, int id_carrera1, int id_institucion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaIngreso = fechaIngreso;
        this.id_carrera1 = id_carrera1;
        this.id_institucion = id_institucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getId_carrera1() {
        return id_carrera1;
    }

    public List<Escuela> getListCarrera() {
        return listCarrera;
    }

    public void setListCarrera(List<Escuela> listCarrera) {
        this.listCarrera = listCarrera;
    }

    public List<Escuela> getListCarrera2() {
        return listCarrera2;
    }

    public void setListCarrera2(List<Escuela> listCarrera2) {
        this.listCarrera2 = listCarrera2;
    }

    public void setId_carrera1(int id_carrera1) {
        this.id_carrera1 = id_carrera1;
    }

    public int getId_carrera2() {
        return id_carrera2;
    }

    public List<Institucion> getListInstitucion() {
        return listInstitucion;
    }

    public void setListInstitucion(List<Institucion> listInstitucion) {
        this.listInstitucion = listInstitucion;
    }

    public void setId_carrera2(int id_carrera2) {
        this.id_carrera2 = id_carrera2;
    }

    public int getId_institucion() {
        return id_institucion;
    }

    public void setId_institucion(int id_institucion) {
        this.id_institucion = id_institucion;
    }
    
}
