/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.Controlador.Controlador;
import biblioteca.Modelo.ConexionBD;
import biblioteca.Vista.Login;
import biblioteca.Vista.SolicitudLibro;
import biblioteca.Vista.Solicitud_Prestamo;

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
//        ConexionBD vc = new ConexionBD();
//        vc.setConexionOracle("jdbc:oracle:thin:@172.17.1.25:1521:INGROUP", "USERSETA", "D4T4C3NT3R");
//        Controlador metodos = new Controlador(vc);
//        Controlador capLibro = new Controlador(vc);
        Login login = new Login();
        login.setVisible(true);
//        login.setMetodos(metodos);
//        SolicitudLibro solicitudLib = new SolicitudLibro();
//        solicitudLib.setVisible(true);
//        solicitudLib.setCapLibro(capLibro);
//        System.out.println("MetaDatos de la consulta");
//      vc.getMetaDataTable("Select * from USUARIO");
//        vc.getMetaDataTable("Select * from SETA.SETA_MA_EQUIPO ");
//        vc.closeConexion();

//        Solicitud_Prestamo sp = new Solicitud_Prestamo();
//        sp.setVisible(true);
    }

}
