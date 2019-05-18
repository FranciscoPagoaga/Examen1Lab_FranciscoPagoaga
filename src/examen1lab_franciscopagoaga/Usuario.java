/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_franciscopagoaga;

import java.util.ArrayList;

/**
 *
 * @author Francisco Pagoaga
 */
public class Usuario {
    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList <Libros> prestado=new ArrayList();
    private ArrayList <Libros> historial=new ArrayList();
    private String usuario;
    private String psswd;

    public Usuario() {
    }

    public Usuario(int codigo, String nombre, String apellido, int edad, String usuario, String psswd) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.usuario = usuario;
        this.psswd = psswd;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Libros> getPrestado() {
        return prestado;
    }

    public void setPrestado(ArrayList<Libros> prestado) {
        this.prestado = prestado;
    }

    public ArrayList<Libros> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Libros> historial) {
        this.historial = historial;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPsswd() {
        return psswd;
    }

    public void setPsswd(String psswd) {
        this.psswd = psswd;
    }
    
}
