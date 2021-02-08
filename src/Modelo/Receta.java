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
import javax.persistence.OneToMany;

/**
 *
 * @author Personal
 */
public class Receta implements Serializable {

    private int id_receta;
    ///ojo variable falta de tipo date
    private String medicamentos;
    private String indicaciones;
    private int num_receta;
    private List<Consulta> ListaFactura = new ArrayList<Consulta>();
    
     private String external_receta;

    public int getId_receta() {
        return id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public String getExternal_receta() {
        return external_receta;
    }

    public void setExternal_receta(String external_receta) {
        this.external_receta = external_receta;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public int getNum_receta() {
        return num_receta;
    }

    public void setNum_receta(int num_receta) {
        this.num_receta = num_receta;
    }

    public List<Consulta> getListaFactura() {
        return ListaFactura;
    }

    @OneToMany(mappedBy = "receta", cascade = CascadeType.ALL)
    public void setListaFactura(List<Consulta> ListaFactura) {
        this.ListaFactura = ListaFactura;
    }
}
