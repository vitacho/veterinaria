/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Personal
 */
public class Servicio implements Serializable {

    
    private int id_serv;
    private String external_serv;
    private int nro_servicio;
    private String codigo_serv;

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }
    private float precio;
    private String descripcion,nombre_servicio;
    

    
    private String estado;
    private List<Factura> ListaFactura = new ArrayList<Factura>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    
        @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    public List<Factura> getListaFactura() {
        return ListaFactura;
    }

    public void setListaFactura(List<Factura> ListaFactura) {
        this.ListaFactura = ListaFactura;
    }
    
     }
