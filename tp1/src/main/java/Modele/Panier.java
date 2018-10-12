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
import java.util.*;

public class Panier extends Observable
{
    ArrayList<IFruit> fruits;
    int cap;
    
    public Panier(int c)
    {
        fruits = new ArrayList<IFruit>();
        cap = c;
    }
    public int getSize()
    {
        return fruits.size();
    }
    public boolean estVide()
    {
        return fruits.isEmpty();
    }
    public boolean estPlein()
    {
        return fruits.size() == cap;
    }
    public void Ajoute(IFruit o)
    {
        if (!estPlein())
            fruits.add(o);
        else
            System.out.println("Panier Plein!");
        setChanged();
        notifyObservers();
    }
    public IFruit getFruit(int i)
    {
        return fruits.get(i);
    }
    public void retire()
    {
        if (!estVide())
            fruits.remove(fruits.size() - 1);
        else
            System.out.println("Panier Vide!");
        setChanged();
        notifyObservers();
    }
    public double getPrix()
    {
        double prixPan = 0;
        for (IFruit fs : fruits)
        {
            prixPan += fs.getPrix();
        }
        return prixPan;
    }
    public void BoycotteOrigine(String ori)
    {
        int i = 0;
        IFruit index[] = new IFruit[cap];
        
        for (IFruit fs : fruits)
        {
            if (fs.getOrigine().equals(ori))
            {
                index[i] = fs;
                i++;
            }
        }
        for(i = 0; i < index.length; i++)
        {
            fruits.remove(index[i]);
        }
        setChanged();
        notifyObservers();
    }

    public boolean equals(Panier p)
    {
        int i = 0;
        for (IFruit fs : fruits)
        {
            if (!fs.equals(p.getFruit(i)))
                return false;
            i++;
        }
        return true;
    }
    @Override
    public String toString()
    {
        String s = "";
        for (IFruit fs : fruits)
        {
            s += fs.toString();
        }
        return s;
    }
}
