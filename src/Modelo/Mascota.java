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
public class Mascota {
    private int id;
    private String external_mascota;
    private String nombre;
    private int edad;
    private String raza;
    private String especie;
    private String tamanio;
    private String sexo;
    private String colorPelaje;

    public Mascota(int id, String external_mascota, String nombre, int edad, String raza, String especie, String tamanio, String sexo, String colorPelaje) {
        this.id = id;
        this.external_mascota = external_mascota;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.especie = especie;
        this.tamanio = tamanio;
        this.sexo = sexo;
        this.colorPelaje = colorPelaje;
    }

    public Mascota() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExternal_mascota() {
        return external_mascota;
    }

    public void setExternal_mascota(String external_mascota) {
        this.external_mascota = external_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    
    
    
}
