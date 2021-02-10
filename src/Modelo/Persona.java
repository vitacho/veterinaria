/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author DELL
 */
public class Persona implements Serializable{

    private int id;
    private String external_persona;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String cedula;
    private String telefono;
    private String direccion;
    private Rol rol;
    private Cuenta cuenta;

    public Persona() {
    }

    public Persona(String external_persona, String nombre, String apellido, String correoElectronico, String cedula, String telefono, String direccion, Rol rol, Cuenta cuenta) {
        this.external_persona = external_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.rol = rol;
        this.cuenta = cuenta;
    }
    
    @OneToOne(mappedBy = "cuenta", cascade = CascadeType.ALL)
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    @OneToOne(mappedBy = "rol", cascade = CascadeType.ALL)
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExternal_persona() {
        return external_persona;
    }

    public void setExternal_persona(String external_persona) {
        this.external_persona = external_persona;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
