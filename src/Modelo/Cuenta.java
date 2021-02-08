/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DELL
 */
public class Cuenta {
    private int id;
    private String external_cuenta;
    private String clave;
    private boolean estado;

    public Cuenta() {
    }

    public Cuenta( String external_cuenta, String clave, boolean estado) {
        this.external_cuenta = external_cuenta;
        this.clave = clave;
        this.estado = estado;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExternal_cuenta() {
        return external_cuenta;
    }

    public void setExternal_cuenta(String external_cuenta) {
        this.external_cuenta = external_cuenta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
