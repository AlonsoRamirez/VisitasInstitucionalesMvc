/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Data;

import Sistema.Visitas.Institucionales.Core.Model.Institucion;
import Sistema.Visitas.Institucionales.Core.Model.Rol;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author HP-PC
 */
public class RolRepository {
        private Connection cn;
        private Rol rol;

        public RolRepository(){
        
                 this.cn = new Conexion().getCon();

        }
        
        public Connection getCn() {
                 return cn;
        }
        
        public Rol GetRol(int id) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public List<Rol> GetRoles(int id, String nombre) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public boolean DeleteRol(int id) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Institucion SaveRol(Rol rol) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
}
