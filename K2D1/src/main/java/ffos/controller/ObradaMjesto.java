/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Mjesto;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author Ivor
 */
public class ObradaMjesto extends Obrada<Mjesto> {

    
    public void SetData(String naziv, String broj){
    if(getEntitet()==null){
    Mjesto m = new Mjesto();
        try {
            m.setNaziv(naziv);
            m.setBroj(Integer.parseInt(broj));
        } catch (Exception ex) {
        } setEntitet(m);
    } else {
        try {
            getEntitet().setNaziv(naziv);
            getEntitet().setBroj(Integer.parseInt(broj));
        } catch (Exception e) {
        }
    }
        
    }
    
    public List <Mjesto> read(){
    return session.createQuery("from Mjesto").list();
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
