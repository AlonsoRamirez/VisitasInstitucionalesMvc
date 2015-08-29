/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Core;

import Sistema.Visitas.Institucionales.Core.Model.Visitas;
import java.util.List;

/**
 *
 * @author HP-PC
 */
public interface VisitasInterface {
    public Visitas GetVisita(int id);
    public List<Visitas> GetVisitas(int id);
    public Visitas SaveVisita(Visitas visita);
    public boolean DeleteVisita(int id);
}
