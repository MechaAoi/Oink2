/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modele.Orange;
import Modele.Panier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import view.IHM;
import view.VueGraphique;

/**
 *
 * @author vn934281
 */
public class Controleur implements ActionListener {
    Panier p1;
    VueGraphique vue;
    IHM inter_graph;
    
    public Controleur(Panier p, VueGraphique v)
    {
        p1 = p;
        vue = v;
    }
    public Controleur(Panier p,IHM inter){
        p1=p;
        inter_graph=inter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b =(JButton)e.getSource();
        if (b.getName().equals("plus"))
        {
            Orange o = new Orange(0,"oui");
            p1.Ajoute(o);
        }
        if (b.getName().equals("moins"))
        {
            p1.retire();
        }
    }
    
}
