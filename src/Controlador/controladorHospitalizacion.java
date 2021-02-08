/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Hospitalizacion;
import Modelo.Mascota;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Darley
 */
public class controladorHospitalizacion {

    ArrayList<Hospitalizacion> listaHos = new ArrayList<Hospitalizacion>();

    public void registrarHospitalizacion(int id, int external_hosp, String diagnostico, String motivo, int temp, String sangrado, String conbulcion, String intoxicacion, String probleResp, String inchazon, Date ingreso, Date salida, String vereterinario, String estado, Mascota mascota) {
        listaHos.add(new Hospitalizacion(id, external_hosp, diagnostico, motivo, temp, sangrado, conbulcion, intoxicacion, probleResp, inchazon, ingreso, salida, vereterinario, estado, mascota));
    }

    public ArrayList<Hospitalizacion> buscarConsulta(String cedula) {
        ArrayList<Hospitalizacion> lista = new ArrayList<>();
        for (Hospitalizacion con : listaHos) {
            if (con.getMascota().getPersona().getCedula().equals(cedula)) {
                lista.add(con);
            }
        }
        return lista;
    }

    public ArrayList<Hospitalizacion> getListaConsulta() {
        return listaHos;
    }
}
