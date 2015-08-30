/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Core;

import Sistema.Visitas.Institucionales.Core.Model.*;
import java.util.List;

/**
 *
 * @author HP-PC
 */
public interface CatalogosInterface {
    public Escuela GetEscuela(int id);
    public List<Escuela> GetEscuelas (int id,String nombre);
    public boolean DeleteEscuela(int id);
    public Escuela SaveEscuela(Escuela escuela);
    
    public Institucion GetInstitucion(int id);
    public List<Institucion> GetInstituciones (int id,String nombre);
    public boolean DeleteInstitucion(int id);
    public Institucion SaveInstitucion(Institucion institucion);
    
     
    public Facultad GetFacultad(int id);
    public List<Facultad> GetFacultades (int id,String nombre);
    public boolean DeleteFacultad(int id);
    public Institucion SaveFacultad(Facultad facultad);
    
    public Rol GetRol(int id);
    public List<Rol> GetRoles (int id,String nombre);
    public boolean DeleteRol(int id);
    public Institucion SaveRol(Rol rol);
}
