/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import ffos.utility.HibernateUtil;
import ffos.view.Izbornik;


/**
 *
 * @author Korisnik
 */
public class Start {
    
    public static void main(String[] args) {
      //  HibernateUtil.getSession();ovo pokrenete jednom, prvi puta kada želite kreirat tablice, nakon toga u configu promjenite na update i maknete ovo
      new Izbornik().setVisible(true); //otvara formu izbornik
    }
    
}
