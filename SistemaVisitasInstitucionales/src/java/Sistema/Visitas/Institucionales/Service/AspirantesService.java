/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Service;

import Sistema.Visitas.Institucionales.Core.AspirantesInterface;
import Sistema.Visitas.Institucionales.Core.Model.Aspirante;
import java.util.List;

/**
 *
 * @author HP-PC
 */
abstract class AspirantesService implements AspirantesInterface{

    @Override
    public Aspirante GetAspirante(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aspirante> GetAspirantes(int id, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aspirante SaveAspirante(Aspirante aspirante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DeleteAspirante(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
