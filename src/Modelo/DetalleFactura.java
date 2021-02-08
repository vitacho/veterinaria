/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DetalleFactura implements Serializable {
    private String iddetallefactura;
    private int cantidad;
    private String detalle;
    private String descripcion;
    private double preciounitario;
    private double preciototal;
    private String esternal_hos;
    private String external_consulta;
    private int id_factura;
    private int id_servicio; 
    private Factura factura;
    private Servicio servicio;
    
    List<Servicio> listaServicios=new ArrayList<>();
    
    
    public String getIddetallefactura() {
        return iddetallefactura;
    }

    public void setIddetallefactura(String iddetallefactura) {
        this.iddetallefactura = iddetallefactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    public String getEsternal_hos() {
        return esternal_hos;
    }

    public void setEsternal_hos(String esternal_hos) {
        this.esternal_hos = esternal_hos;
    }

    public String getExternal_consulta() {
        return external_consulta;
    }

    public void setExternal_consulta(String external_consulta) {
        this.external_consulta = external_consulta;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getServicio() {
        return id_servicio;
    }

    public void setServicio(int servicio) {
        this.id_servicio = servicio;
    }
    
    
    
}
