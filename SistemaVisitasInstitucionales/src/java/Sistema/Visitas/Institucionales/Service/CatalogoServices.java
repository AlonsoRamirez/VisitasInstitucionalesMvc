/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Service;

import Sistema.Visitas.Institucionales.Core.CatalogosInterface;
import Sistema.Visitas.Institucionales.Core.Model.Escuela;
import Sistema.Visitas.Institucionales.Core.Model.Facultad;
import Sistema.Visitas.Institucionales.Core.Model.Institucion;
import Sistema.Visitas.Institucionales.Core.Model.Rol;
import Sistema.Visitas.Institucionales.Data.EscuelasRepository;
import Sistema.Visitas.Institucionales.Data.InstitucionesRepository;
import java.util.List;

/**
 *
 * @author L.Michelle
 */
abstract class CatalogoServices implements CatalogosInterface{

    @Override
    public Escuela GetEscuela(int id) {
        EscuelasRepository EscuelaRep = new EscuelasRepository();        
        return EscuelaRep.cosultarEscuela(id).get(1);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Escuela> GetEscuelas() {
         EscuelasRepository EscuelaRep = new EscuelasRepository();        
        return EscuelaRep.cosultarEscuelas();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DeleteEscuela(int id) {
         EscuelasRepository EscuelaRep = new EscuelasRepository();        
        return EscuelaRep.eliminarEscuela(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Escuela SaveEscuela(Escuela escuela) {
         EscuelasRepository EscuelaRep = new EscuelasRepository();        
        EscuelaRep.guardarEscuela(escuela);
        return escuela;
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Institucion GetInstitucion(int id) {
         InstitucionesRepository InsRep = new InstitucionesRepository();
        return InsRep.cosultarInstitucion(id).get(1);
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Institucion> GetInstituciones(int id, String nombre) {
         InstitucionesRepository InsRep = new InstitucionesRepository();
        return InsRep.cosultarInstituciones();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DeleteInstitucion(int id) {
         InstitucionesRepository InsRep = new InstitucionesRepository();
        return InsRep.eliminarInstitucion(id);
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Institucion SaveInstitucion(Institucion institucion) {
         InstitucionesRepository InsRep = new InstitucionesRepository();
        InsRep.guardarInstitucion(institucion);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public Facultad GetFacultad(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Facultad> GetFacultades(int id, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DeleteFacultad(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Institucion SaveFacultad(Facultad facultad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol GetRol(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rol> GetRoles(int id, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DeleteRol(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Institucion SaveRol(Rol rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
