/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Consulta;
import Modelo.Mascota;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Darley
 */
public class controladorConsulta {
    
    ArrayList<Consulta> listaConsulta = new ArrayList<>();
    
    public void registrarConsulta(int id, int external_consulta, String presion, int temp, double peso, String motivo, String diagnostico, String veterinario, Mascota mascota, Date fecha) {
        listaConsulta.add(new Consulta(id, external_consulta, presion, temp, peso, motivo, diagnostico, veterinario, mascota, fecha));
    }
    
    public ArrayList<Consulta> buscarConsulta(String cedula) {
        ArrayList<Consulta> lista = new ArrayList<>();
        for (Consulta con : listaConsulta) {
            if (con.getMascota().getPersona().getCedula().equals(cedula)) {
                lista.add(con);
            }
        }
        return lista;
    }
    
    public ArrayList<Consulta> getListaConsulta() {
        return listaConsulta;
    }
    
}
