/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.Controlador.Controlador;
import biblioteca.Modelo.conexionBD;
import biblioteca.Vista.Login;

/**
 *
 * @author Usuario
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conexionBD vc= new conexionBD();
        vc.setConexionOracle("jdbc:oracle:thin:@172.17.1.25:1521:INGROUP","USERSETA","D4T4C3NT3R");
        Controlador metodos=new Controlador(vc);
        Login login =new Login();
        login.setVisible(true);
        login.setMetodos(metodos);
        System.out.println("MetaDatos de la consulta");
        //vc.getMetaDataTable("Select * from SETA.SETA_MA_EQUIPO ");
        vc.closeConexion();
    }
    
}
