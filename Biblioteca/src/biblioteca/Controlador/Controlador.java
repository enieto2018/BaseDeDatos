/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Controlador;

import biblioteca.Modelo.Libro;
import biblioteca.Modelo.ConexionBD;
import biblioteca.Modelo.Solicitud;
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

    public int validarLogin(String usuario, String pass) {
        int idUsuario = 0;

        try {
            Statement st = conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_USUARIO FROM USUARIO WHERE CEDULA='" + usuario + "' AND PASS='" + pass + "'");
            if (rs.next()) {
       
                idUsuario= rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idUsuario;
    }

    public List<Libro> listaLibros(String titulo) {

        List<Libro> listLibros = new ArrayList<>();
        try {
            Statement st = conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT IDLIBRO,TITULO FROM LIBRO WHERE TITULO LIKE'%" + titulo + "%'");
            while (rs.next()) {
                Libro lb = new Libro();
                lb.setTitulo(rs.getNString(2));
                lb.setId_libro(rs.getInt(1));
                listLibros.add(lb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listLibros;

    }

    public void registrarSolicitud(int idLibro, String fechaDesde, String fechaHasta, int idUsuario,
            int idBiblioteca, int idSatelite) {
        conexion.sentenciasNoSelect("INSERT INTO SOLICITUD VALUES (" + idLibro
                + ",TRUNC(SYSDATE),TO_DATE('" + fechaDesde
                + "','DD/MM/YYYY'),TO_DATE('" + fechaHasta
                + "','DD/MM/YYYY'),SEQ_IDsolicitud.NEXTVAL,"
                + idUsuario + "," + idBiblioteca + "," + idSatelite + ")");
    }
    
    
    
    public void registrarPrestamo(int idLibro, String fechaDesde, String fechaHasta,int idUsuario) {
        conexion.sentenciasNoSelect("INSERT INTO PRESTAMO (ID, FECHA_SALIDA, FECHA_DEVOLUCION, USUARIO_ID) "
                + "VALUES (SEQ_PRESTAMO.NEXTVAL"
                + ",TO_DATE('" + fechaDesde
                + "','DD/MM/YYYY'),TO_DATE('" + fechaHasta
                + "','DD/MM/YYYY'),"+idUsuario+")");
    }

    
    
    
    public Solicitud findSolicitudById(int solicitudId){
        Solicitud solicitud = null;
        
        try {
            Statement st = conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT USUARIO_ID, RECURSO_ID, FECHADESDE, FECHAHASTA "
                    + "FROM SOLICITUD WHERE ID_SOLICITUD=" +solicitudId);
            if (rs.next()) {
                solicitud = new Solicitud();
                solicitud.setUsuarioId(rs.getInt(1));
                solicitud.setRecursoId(rs.getInt(2));
                solicitud.setFechaDesde(rs.getDate(3));
                solicitud.setFechaHasta(rs.getDate(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return solicitud;
    }   
    
    
    public ConexionBD getConexion() {
        return conexion;
    }

    public void setConexion(ConexionBD conexion) {
        this.conexion = conexion;
    }

}
