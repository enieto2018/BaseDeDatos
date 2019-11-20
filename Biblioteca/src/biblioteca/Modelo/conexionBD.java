/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Modelo;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


/**
 *
 * @author Usuario
 */
public class conexionBD {
    
    private String URLAccess ="jdbc:oracle:thin:@172.17.1.25:1521:INGROUP";
    private String usuario="USERSETA";
    private String contrasena="D4T4C3NT3R";
    private Connection conexion;

    /**
     * @return the URLAccess
     */
    public String getURLAccess() {
        return URLAccess;
    }

    /**
     * @param URLAccess the URLAccess to set
     */
    public void setURLAccess(String URLAccess) {
        this.URLAccess = URLAccess;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the conexion
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * @param conexion the conexion to set
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public void setConexionOracle (String URLAccess, String usuario,String contrasena){
        try{
            setURLAccess("jdbc:oracle:thin:@"+URLAccess);
            setUsuario(usuario);
            setContrasena(contrasena);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion=DriverManager.getConnection(URLAccess,usuario,contrasena);
            System.out.println("Conexion Exitosa. URL: "+URLAccess+"Usuario :"+usuario);
        }catch (ClassNotFoundException | SQLException e){
          System.out.println("Error x "+e.toString());
        }
    }
    public void closeConexion(){
        try{
            conexion.close();
        }catch (SQLException e){
            System.out.println("Error"+e.toString());
        }
    }
    public void sentenciasNoSelect (String sentencia){
        //metodo encargado para operaciones diferentes al select 
        //como delete update...
        try{
            Statement st = conexion.createStatement();
            st.executeUpdate(sentencia);
            conexion.commit();
        }catch (SQLException ex){
            System.out.println("Error "+ex.toString());
        }
    }
    public void getDatosConsulta (String consulta){
        //Operaciones Select 
        try{
            int i=0;
            Statement st=conexion.createStatement();
            ResultSet rs=st.executeQuery(consulta);
            while(rs.next()){
                for(int j=1; j<=rs.getMetaData().getColumnCount();j++){
                    System.out.println(rs.getObject(j)+"\t");
                    System.out.println(" ");
                }
                
            }
        }catch(SQLException e){
            System.out.println("Error"+e.toString());
            
        }
    }
    public void getMetaDataTable (String consulta){
        try{
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            // MOSTRAR LA METADATA
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Numero de Campos: "+
            rs.getMetaData().getColumnCount());
            int i=1;
            while (i<=rsmd.getColumnCount()){
                System.out.println("Campo: " +
                        rsmd.getColumnName(i)+"Tipo de Dato"+rsmd.getColumnName(i));
                i++;
                }
            }catch(SQLException ex){
                System.out.println("Error getMetaDataTable"+ex.toString());
        }
    }


}


