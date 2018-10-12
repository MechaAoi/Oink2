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
public abstract class FruitSimple {
    private double prix;
    private String origine;
    private boolean seed;
    
    public double getPrix()
    {
        return prix;
    }
    
    public String getOrigine()
    {
        return origine;
    }
    
    public boolean isSeedless()
    {
        return !seed;
    }
    
    public boolean Equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        FruitSimple fs = (FruitSimple)o;
        return (this.prix == fs.getPrix() && this.origine.equals(fs.getOrigine()));
    }
    
    @Override
    public String toString(){
        return "Prix : " + this.prix + "€ \t Origine : " + this.origine;
    }
}
