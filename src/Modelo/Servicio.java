/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Personal
 */
public class Servicio implements Serializable{
     private int id_serv;
     private String external_serv;
     private int nro_servicio;
     private String codigo_serv;
     private float precio;
     private String descripcion;
     private String estado;

    public int getId_serv() {
        return id_serv;
    }

    public void setId_serv(int id_serv) {
        this.id_serv = id_serv;
    }

    public String getExternal_serv() {
        return external_serv;
    }

    public void setExternal_serv(String external_serv) {
        this.external_serv = external_serv;
    }

    public int getNro_servicio() {
        return nro_servicio;
    }

    public void setNro_servicio(int nro_servicio) {
        this.nro_servicio = nro_servicio;
    }

    public String getCodigo_serv() {
        return codigo_serv;
    }

    public void setCodigo_serv(String codigo_serv) {
        this.codigo_serv = codigo_serv;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     
     
    
}
