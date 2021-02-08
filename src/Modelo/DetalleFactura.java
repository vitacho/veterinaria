/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author DELL
 */
public class DetalleFactura implements Serializable {

    private int iddetallefactura;
    private int cantidad;
    private String detalle;
    private String descripcion;
    private double preciounitario;
    private double preciototal;
    private String esternal_hos;
    private String external_consulta;
    private Factura factura;
    private Servicio servicio;

    List<Servicio> listaServicios = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIddetallefactura() {
        return iddetallefactura;
    }

    public void setIddetallefactura(int iddetallefactura) {
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

    @ManyToOne
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @ManyToOne
    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

}
