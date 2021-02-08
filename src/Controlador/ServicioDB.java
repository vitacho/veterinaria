/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Servicio;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import utilidad.HibernateUtil;

/**
 * 
 *
 * @author Personal
 */
public class ServicioDB {
     private Session st;

    public ServicioDB() {
         sessionHibernate();
    }

      public void sessionHibernate() {
        st = HibernateUtil.getSessionFactory().openSession();
    }
       public void nuevoServicio(Servicio servicio) {
        try {
            st.beginTransaction();
            st.save(servicio);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "SERVICIO GUARDADO", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR  " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
       
         public void actualizaServicio(Servicio servicio){
        try{
            st.clear();
            st.beginTransaction();
            st.saveOrUpdate(servicio);
            st.getTransaction().commit();
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LOS DATOS "+e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
             
         public List<Servicio> cargaServicio(String est, List<Servicio> lis) {
        try {
            lis = (List<Servicio>) st.createQuery("from servico where estado='" + est + "'order by nombreServicio").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL TRAER LOS SERVICIOS " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return lis;
    }
           
           
    public Servicio traeServicio(int id) {
        Servicio m = null;
        try {
            m = (Servicio) st.load(Servicio.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL TRAER EL SERVICIO " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return m;
    }
    
       public Servicio traeNombreServicio (String nombre) {
        Servicio ser = null; 
        try {
            Query query = st.createQuery("from servico se Where se.nombreServicio = ?");
            query.setParameter(0, nombre);
            try {
                ser = (Servicio) query.uniqueResult();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "LA DESCRIPCIÓN DEL SERVICIO YA EXISTE EN EL SISTEMA", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL TRAER EL SERVICIO " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return ser;
    }
     
}
