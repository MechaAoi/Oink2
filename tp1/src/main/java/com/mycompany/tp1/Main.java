/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp1;

/**
 *
 * @author vn934281
 */
public class Main
{
    public static void main(String args[])
    {
        Panier panier  = new Panier(10);
        panier.Ajoute(new Orange(0.80,"France"));
        panier.Ajoute(new Orange(0.80,"Espagne"));
        panier.Ajoute(new Orange(0.90,"Floride"));
        panier.BoycotteOrigine("France");
        System.out.println(panier.toString());
    }
}
