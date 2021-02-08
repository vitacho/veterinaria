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
import Modelo.DetalleFactura;

/**
 *
 * @author DELL
 */
public class detalleFacturaDB {

    Session st;

    public void sessionHibernate() {
        st = HibernateUtil.getSessionFactory().openSession();
    }

    public void nuevadetalleFactura(DetalleFactura factura) {
        try {
            st.beginTransaction();
            st.save(factura);
            st.getTransaction().commit();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR LA FACTURA" + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

    }

}
