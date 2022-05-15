/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Kulen;
import ffos.model.Mesar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivor
 */

//isto kopi pejst, ali promjenite podatke tako da odgovaraju klasi za koju radite obradu.
// metoda setData uvijek prima parametre tipa String, ako je taj parametar u Modelu naveden kao npr. Integer onda ga morate parsat kao što sam ja dole.
// ovdje vidite kako se radi za datum, uvijek je isto samo kopirajte

public class ObradaKulen extends Obrada<Kulen> {

    public void setData(String broj, String datum){
    if(getEntitet()==null){
    Kulen k = new Kulen();
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
        try {
            k.setBroj(Integer.parseInt(broj));
            k.setDatum((Date)df.parse(datum));
        } catch (Exception ex) {
        } setEntitet(k);
    } else {
         SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
        try {
            getEntitet().setBroj(Integer.parseInt(broj));
            getEntitet().setDatum((Date)df.parse(datum));
        } catch (Exception e) {
        }
    }
        
    }
    // ne zaboravite promjenit parametre u <ImeKlase> i pod navodnicima u querriju stavit naziv klase tj tablice
    public List <Kulen> read(){
    return session.createQuery("from Kulen").list();
    }
    
    //obavezno obrišite ono što vam automatski generira u ovim metodama jer u suprotnom nece nista radit
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
