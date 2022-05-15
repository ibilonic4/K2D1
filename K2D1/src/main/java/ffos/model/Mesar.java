/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.model;

import javax.persistence.Entity;
import net.bytebuddy.implementation.ToStringMethod;

/**
 *
 * @author Ivor
 */
@Entity
public class Mesar extends Entitet {
    
    private String ime;
    private String prezime;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
   
   //ovaj override sluzi tome da kada vam u formi prikazuje listu ne pišu oni znakovi i glupa sranja nego vam samo prikaže ono sto ste stavili nakon return, radit ce neovisno o tome, ali eto
     @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
