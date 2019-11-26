/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Modelo;

import java.awt.List;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    private int idLibro;
    private String titulo;
    

    public Libro() {
    }

    public Libro(int id_libro, String Titulo) {
        this.idLibro = id_libro;
        this.titulo = Titulo;
    }

    /**
     * @return the idLibro
     */
    public int getId_libro() {
        return idLibro;
    }

    /**
     * @param id_libro the idLibro to set
     */
    public void setId_libro(int id_libro) {
        this.idLibro = id_libro;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param Titulo the titulo to set
     */
    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }
    
  
}
