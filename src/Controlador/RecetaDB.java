/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Receta;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import utilidad.HibernateUtil;

/**
 *
 * @author Personal
 */
public class RecetaDB {
     private Session st;

    public RecetaDB() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = HibernateUtil.getSessionFactory().openSession();
    }
      public Receta traeRecetaID(int id) {
        Receta rec = null;
        try {
            rec = (Receta) st.load(Receta.class, id);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL TRAER LA RECETA MEDICA " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return rec;
    }
      
        public void actualizaReceta(Receta reser) {
        try {
//            st.clear();
            st.beginTransaction();
            st.update(reser);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            st.clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LOS DATOS DE LA ORDEN " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
           public List<Receta> cargarCodigoCita (List<Receta> list) {
        try {
            list = (List<Receta>) st.createQuery("From Receta order by numero").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer Equipo " + e.getMessage());
        }
        return list;

    }
}
