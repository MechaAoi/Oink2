/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author cb653705
 */
public class Banane extends FruitSimple
{
    private double prix;
    private String origine;
    private boolean seed;
    
    public Banane(double p, String o)
    {
        if (p >= 0)
            prix = p;
        else
        {
            System.out.println("prix incorrect");
            System.exit(1);
        }
        origine = o;
        
        seed = false;
    }
}
