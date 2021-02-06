/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class Factura {
    private int id;
    private String externa_Factura;
    private int nro_fatura;
    //va variable de la fecha
    private float iva;
    private String tipo_de_pago;
    private String id_persona;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExterna_Factura() {
        return externa_Factura;
    }

    public void setExterna_Factura(String externa_Factura) {
        this.externa_Factura = externa_Factura;
    }

    public int getNro_fatura() {
        return nro_fatura;
    }

    public void setNro_fatura(int nro_fatura) {
        this.nro_fatura = nro_fatura;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public String getTipo_de_pago() {
        return tipo_de_pago;
    }

    public void setTipo_de_pago(String tipo_de_pago) {
        this.tipo_de_pago = tipo_de_pago;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }
    
}