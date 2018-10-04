package Modele;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vn934281
 */
public class Orange {
    double prix;
    String origine;
    
    public Orange(double p, String o)
    {
        if (p >= 0)
            prix = p;
        else
        {
            System.out.println("prix incorrect");
            System.exit(1);
        }
        origine = o;
    }
    
    public double getPrix()
    {
        return prix;
    }
    public boolean equals(Orange o)
    {
        return prix == o.getPrix() && origine.equals(o.getOrigine());
    }
    public String getOrigine()
    {
        return origine;
    }
    public String toString()
    {
        return "Prix: " + prix + "€  Origine: " + origine + "\n";
    }
    
}
