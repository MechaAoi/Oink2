/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import Modele.*;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author vn934281
 */
public class VueConsole implements Observer {
    
    VueConsole()
    {
        System.out.println("Valeur par défaut 0");
    }
    

    @Override
    public void update(Observable o, Object arg) {
        Panier p = (Panier)o;
        System.out.println("Nombre de fruits : "+ p.getSize() );
    }
}
