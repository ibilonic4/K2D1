/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.model;

import javax.persistence.Entity;

/**
 *
 * @author Ivor
 */
@Entity
public class Mjesto extends Entitet {
    
    private String naziv;
    private Integer broj;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getBroj() {
        return broj;
    }

    public void setBroj(Integer broj) {
        this.broj = broj;
    }
    
    @Override
    public String toString() {
        return naziv ;
    }
}
