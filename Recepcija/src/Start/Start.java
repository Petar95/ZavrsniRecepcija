/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import recepcija.pomocno.HibernateUtil;
import recepcija.view.Izbornik;

/**
 *
 * @author Petar
 */
public class Start {
    public static void main(String[] args) {
        
 
    new Izbornik().setVisible(true);

        HibernateUtil.getSession();
}
}