/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_franciscopagoaga;

/**
 *
 * @author Francisco Pagoaga
 */
public class Libros {
    private String autor;
    private String titulo;
    private String genero;
    private String editoriales;
    private String idioma;
    private int anioescrito;
    private String isbn;
    private int aniolibreria;
    private String estado;
    private String nombreprestado;
    private int numcuenta;

    public Libros(String autor, String titulo, String genero, String editoriales, String idioma, int anioescrito, String isbn, int aniolibreria, String estado, String nombreprestado, int numcuenta) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.editoriales = editoriales;
        this.idioma = idioma;
        this.anioescrito = anioescrito;
        this.isbn = isbn;
        this.aniolibreria = aniolibreria;
        this.estado = estado;
        this.nombreprestado = nombreprestado;
        this.numcuenta = numcuenta;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(String editoriales) {
        this.editoriales = editoriales;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAnioescrito() {
        return anioescrito;
    }

    public void setAnioescrito(int anioescrito) {
        this.anioescrito = anioescrito;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAniolibreria() {
        return aniolibreria;
    }

    public void setAniolibreria(int aniolibreria) {
        this.aniolibreria = aniolibreria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreprestado() {
        return nombreprestado;
    }

    public void setNombreprestado(String nombreprestado) {
        this.nombreprestado = nombreprestado;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }
    
}
