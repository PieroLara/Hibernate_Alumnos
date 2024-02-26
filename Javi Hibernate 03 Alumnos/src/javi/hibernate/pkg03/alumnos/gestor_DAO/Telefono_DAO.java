/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javi.hibernate.pkg03.alumnos.gestor_DAO;


import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author josepiero.lara
 */
public class Telefono_DAO {

    private Session sesion;
    private Transaction tx;

    private void iniciaOperacion() throws HibernateException {
      sesion = HibernateUtil.getSessionFactory().openSession();
tx = sesion.beginTransaction();
    }

}
