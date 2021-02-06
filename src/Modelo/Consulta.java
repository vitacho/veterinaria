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
public class Consulta {

    private int id;
    private int external_consulta;
    private String presion;
    private int temp;
    private double peso;
    private String motivo;
    private String diagnostico;
    private String veterinario;
    private Mascota mascota;
    private Date fecha;

    public Consulta(int id, int external_consulta, String presion, int temp, double peso, String motivo, String diagnostico, String veterinario, Mascota mascota, Date fecha) {
        this.id = id;
        this.external_consulta = external_consulta;
        this.presion = presion;
        this.temp = temp;
        this.peso = peso;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.veterinario = veterinario;
        this.mascota = mascota;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExternal_consulta() {
        return external_consulta;
    }

    public void setExternal_consulta(int external_consulta) {
        this.external_consulta = external_consulta;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
