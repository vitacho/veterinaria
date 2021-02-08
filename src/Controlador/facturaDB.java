package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Modelo.Factura;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import utilidad.HibernateUtil;

/**
 *
 * @author DELL
 */
public class facturaDB {

    private Session st;

    public facturaDB() {
        sessionHibernate();
    }

    public void sessionHibernate() {
        st = HibernateUtil.getSessionFactory().openSession();
    }

    public void nuevoFactura(Factura factura) {
        try {
            st.beginTransaction();
            st.save(factura);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "FACTURA GUARDADA", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR  " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizaFactura(Factura factura) {
        try {
            st.clear();
            st.beginTransaction();
            st.saveOrUpdate(factura);
            st.getTransaction().commit();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LOS DATOS " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Factura> cargaFactura(String est, List<Factura> lis) {
        try {
            lis = (List<Factura>) st.createQuery("from servico where estado='" + est + "'order by nombreServicio").list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL TRAER LOS SERVICIOS " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return lis;
    }

    
}
