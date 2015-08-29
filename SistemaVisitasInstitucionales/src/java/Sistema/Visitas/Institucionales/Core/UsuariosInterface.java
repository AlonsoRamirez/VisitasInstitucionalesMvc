/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Visitas.Institucionales.Core;

import Sistema.Visitas.Institucionales.Core.Model.Usuario;
import java.util.List;

/**
 *
 * @author HP-PC
 */
public interface UsuariosInterface {
    
    public Usuario GetUsuario(int id);
    public List<Usuario> GetUsuarios(int id,String nombre);
    public Usuario SaveUsuario(Usuario user);
    public boolean DeleteUsuario(int id);
    
}
