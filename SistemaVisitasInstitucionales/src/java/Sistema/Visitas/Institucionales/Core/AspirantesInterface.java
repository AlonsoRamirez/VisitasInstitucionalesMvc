/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Core;

import Sistema.Visitas.Institucionales.Core.Model.Aspirante;
import java.util.List;

/**
 *
 * @author HP-PC
 */
public interface AspirantesInterface {
    
    public Aspirante GetAspirante(int id);
    public List<Aspirante> GetAspirantes(int id,String nombre);
    public Aspirante SaveAspirante(Aspirante aspirante);
    public boolean DeleteAspirante(int id);
}
