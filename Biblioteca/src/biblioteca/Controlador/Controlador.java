/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Controlador;

import biblioteca.Modelo.conexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Controlador {
    
    private conexionBD conexion;

    public Controlador() {
    }

    public Controlador(conexionBD conexion) {
        this.conexion = conexion;
    }

    public boolean validarLogin(String usuario, String pass) {
        boolean autenticado=false;
        
        try {
            Statement st = conexion.getConexion().createStatement();
            ResultSet rs=st.executeQuery("SELECT CONTRASENA FROM USUARIO WHERE CEDULA='"+usuario+"' AND PASS='"+pass+"'");
            if (rs.next()){
                autenticado=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    return autenticado;
    }
    
    
    
}
