/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ivor
 */

@Entity
public class Kulen extends Entitet {
    private Integer broj;
    
    @Temporal(TemporalType.DATE)
    private Date datum;
    @ManyToOne
    private Mesar mesar;
    @ManyToOne
    private Mjesto mjesto;

    public Integer getBroj() {
        return broj;
    }

    public void setBroj(Integer broj) {
        this.broj = broj;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Mesar getMesar() {
        return mesar;
    }

    public void setMesar(Mesar mesar) {
        this.mesar = mesar;
    }

    public Mjesto getMjesto() {
        return mjesto;
    }

    public void setMjesto(Mjesto mjesto) {
        this.mjesto = mjesto;
    }
    
    
}
