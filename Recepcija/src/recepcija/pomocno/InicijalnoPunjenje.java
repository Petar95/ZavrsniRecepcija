/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recepcija.pomocno;

import recepcija.controller.Obrada;
import recepcija.model.Rezervacija;

import recepcija.model.Soba;

/**
 *
 * @author Polaznik
 */
public class InicijalnoPunjenje {

    public static void main(String[] args) {

        Obrada o = new Obrada();
        Soba s = new Soba();
        s.setTelefon(true);
        s.setInternet(false);
        s.setBrojLezaja(4);
        s.setKat(5);
        s.setBrojObroka(3);
        s.setBrojSobe("13");

        o.save(s);

        Obrada or = new Obrada();
        Rezervacija r = new Rezervacija();

        r.setBrojOsoba(3);

        or.save(r);
        
        

    }
}
