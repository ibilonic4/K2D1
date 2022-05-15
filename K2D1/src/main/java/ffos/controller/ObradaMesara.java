/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Mesar;
import ffos.model.Mjesto;
import java.util.List;

/**
 *
 * @author Ivor
 */
public class ObradaMesara extends Obrada <Mesar> {

    public void SetData(String ime, String prezime){
    if(getEntitet()==null){
    Mesar m = new Mesar();
        try {
            m.setIme(ime);
            m.setPrezime(prezime);
        } catch (Exception ex) {
        } setEntitet(m);
    } else {
        try {
            getEntitet().setIme(ime);
            getEntitet().setPrezime(prezime);
        } catch (Exception e) {
        }
    }
        
    }
    
    public List <Mesar> read(){
    return session.createQuery("from Mesar").list();
    }
    
    @Override
    public void kontrolaCreate() throws Exception {
    }

    @Override
    public void kontrolaUpdate() throws Exception {
    }

    @Override
    public void kontrolaDelete() throws Exception {
    }
    
}
