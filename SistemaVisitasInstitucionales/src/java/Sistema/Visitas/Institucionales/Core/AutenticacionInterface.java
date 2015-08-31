/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Core;

import Sistema.Visitas.Institucionales.Core.Model.Autenticacion;
import org.apache.struts.action.Action;

/**
 *
 * @author HP-PC
 */
public interface AutenticacionInterface {
    
    public boolean autenticacion(Autenticacion aut);
}
