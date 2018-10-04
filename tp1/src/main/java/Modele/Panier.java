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
    ArrayList<Orange> Oranges;
    int cap;
    
    public Panier(int c)
    {
        Oranges = new ArrayList<Orange>();
        cap = c;
    }
    public int getSize()
    {
        return Oranges.size();
    }
    public boolean estVide()
    {
        return Oranges.isEmpty();
    }
    public boolean estPlein()
    {
        return Oranges.size() == cap;
    }
    public void Ajoute(Orange o)
    {
        if (!estPlein())
            Oranges.add(o);
        else
            System.out.println("Panier Plein!");
        setChanged();
        notifyObservers();
    }
    public Orange getOrange(int i)
    {
        return Oranges.get(i);
    }
    public void retire()
    {
        if (!estVide())
            Oranges.remove(Oranges.size() - 1);
        else
            System.out.println("Panier Vide!");
        setChanged();
        notifyObservers();
    }
    public double getPrix()
    {
        double prixPan = 0;
        for (Orange orange : Oranges)
        {
            prixPan += orange.getPrix();
        }
        return prixPan;
    }
    public void BoycotteOrigine(String ori)
    {
        int i = 0;
        Orange index[] = new Orange[cap];
        
        for (Orange orange : Oranges)
        {
            if (orange.getOrigine().equals(ori))
            {
                index[i] = orange;
                i++;
            }
        }
        for(i = 0; i < index.length; i++)
        {
            Oranges.remove(index[i]);
        }
        setChanged();
        notifyObservers();
    }

    public boolean equals(Panier p)
    {
        int i = 0;
        for (Orange orange : Oranges)
        {
            if (!orange.equals(p.getOrange(i)))
                return false;
            i++;
        }
        return true;
    }
    @Override
    public String toString()
    {
        String s = "";
        for (Orange orange : Oranges)
        {
            s += orange.toString();
        }
        return s;
    }
}
