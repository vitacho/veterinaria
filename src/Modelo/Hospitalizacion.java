/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Darley
 */
public class Hospitalizacion {

    private int id;
    private int external_hosp;
    private String diagnostico;
    private String motivo;
    private int temp;
    private boolean sangrado;
    private boolean conbulcion;
    private boolean intoxicacion;
    private boolean probleResp;
    private boolean inchazon;
    private Date ingreso;
    private Date salida;
    private int dias;
    private String vereterinario;
    private String estado;
    private Mascota mascota;

    public Hospitalizacion(int id, int external_hosp, String diagnostico, String motivo, int temp, boolean sangrado, boolean conbulcion, boolean intoxicacion, boolean probleResp, boolean inchazon, Date ingreso, Date salida, int dias, String vereterinario, String estado, Mascota mascota) {
        this.id = id;
        this.external_hosp = external_hosp;
        this.diagnostico = diagnostico;
        this.motivo = motivo;
        this.temp = temp;
        this.sangrado = sangrado;
        this.conbulcion = conbulcion;
        this.intoxicacion = intoxicacion;
        this.probleResp = probleResp;
        this.inchazon = inchazon;
        this.ingreso = ingreso;
        this.salida = salida;
        this.dias = dias;
        this.vereterinario = vereterinario;
        this.estado = estado;
        this.mascota = mascota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExternal_hosp() {
        return external_hosp;
    }

    public void setExternal_hosp(int external_hosp) {
        this.external_hosp = external_hosp;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public boolean isSangrado() {
        return sangrado;
    }

    public void setSangrado(boolean sangrado) {
        this.sangrado = sangrado;
    }

    public boolean isConbulcion() {
        return conbulcion;
    }

    public void setConbulcion(boolean conbulcion) {
        this.conbulcion = conbulcion;
    }

    public boolean isIntoxicacion() {
        return intoxicacion;
    }

    public void setIntoxicacion(boolean intoxicacion) {
        this.intoxicacion = intoxicacion;
    }

    public boolean isProbleResp() {
        return probleResp;
    }

    public void setProbleResp(boolean probleResp) {
        this.probleResp = probleResp;
    }

    public boolean isInchazon() {
        return inchazon;
    }

    public void setInchazon(boolean inchazon) {
        this.inchazon = inchazon;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getVereterinario() {
        return vereterinario;
    }

    public void setVereterinario(String vereterinario) {
        this.vereterinario = vereterinario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

}
