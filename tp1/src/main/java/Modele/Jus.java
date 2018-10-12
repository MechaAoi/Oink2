/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;

/**
 *
 * @author vn934281
 */
public class Jus {
     ArrayList<IFruit> fruits;
     
    public Jus(ArrayList<IFruit> l)
    {
        fruits = l;
    }
             
    public boolean isSeedLess()
    {
        for(int i=0 ; i < fruits.size(); i++)
        {
            if(!fruits.get(i).isSeedless())
                return false;
        }
        return true;
     }
    
    public double getPrix()
    {
        double prix = 0;
        for(int i=0 ; i < fruits.size(); i++)
        {
            prix += fruits.get(i).getPrix();
        }
        return prix;
    }
    
    public String getOrigine()
    {
        String ori;
        if(fruits.size() > 1)
            ori = "";
        else
            ori= fruits.get(0).getOrigine();
        return ori;
    }
    
    public boolean Equals(IFruit f1)
    {
        int i = 0;
        for (IFruit f : fruits)
        {
            if (!f.Equals(f1))
                return false;
            i++;
        }
        return true;
    }

     @Override
    public String toString()
    {
        String s="jus :\n";
        for (int i=0 ; i< fruits.size(); i++)
        {
            s+= fruits.get(i).toString();
        }
        return s;
    }
    
}
