/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Controlador;

import biblioteca.Modelo.Libro;
import biblioteca.Modelo.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Controlador {

    private ConexionBD conexion;
    private List<Libro> listaLibro;

    public Controlador() {
    }

    public Controlador(ConexionBD conexion) {
        this.conexion = conexion;
    }

    /**
     * @return the listaLibro
     */
    public List<Libro> getListaLibro() {
        return listaLibro;
    }

    /**
     * @param listaLibro the listaLibro to set
     */
    public void setListaLibro(List<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }

    public boolean validarLogin(String usuario, String pass) {
        boolean autenticado = false;

        try {
            Statement st = conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT PASS FROM USUARIO WHERE CEDULA='" + usuario + "' AND PASS='" + pass + "'");
            autenticado = rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return autenticado;
    }

    public List<Libro> listaLibros(String titulo) {

        List<Libro> listLibros = new ArrayList<>();
        try {
            Statement st = conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT TITULO FROM LIBRO WHERE TITULO LIKE'%" + titulo + "%'");
            while(rs.next()){
                Libro lb=new Libro();
                lb.setTitulo(rs.getNString(1));
                listLibros.add(lb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listLibros;

    }

}
