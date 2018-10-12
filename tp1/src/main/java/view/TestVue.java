/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.Controleur;
import Modele.*;

/**
 *
 * @author vn934281
 */
public class TestVue {
    
         public static void main(String args[])
    {
        Panier panier  = new Panier(10);
        VueConsole vc = new VueConsole();
        VueGraphique vg = new VueGraphique();
        IHM inter_graph=new IHM();
        Controleur c = new Controleur(panier,vg);
        vg.addControleur(c);
        vg.setVisible(true);
        inter_graph.setVisible(true);
        panier.addObserver(vc);
        panier.addObserver(vg);
        
    }

    
}
