/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;

/**
 *
 * @author qb503660
 */
public class Macedoine implements IFruit {
   ArrayList<IFruit> tabFruit;

   public Macedoine(){
       tabFruit = new ArrayList<IFruit>();
   }
   
   public Macedoine(ArrayList<IFruit> tabFruit){
    this.tabFruit = tabFruit;
    }   

    @Override
    public double getPrix() {
        double prixPan = 0;
        for (IFruit fruit : tabFruit)
        {
            prixPan += fruit.getPrix();
        }
        return prixPan;
    }

    @Override
    public String getOrigine() {
        String origine = "";
        for (IFruit fruit : tabFruit)
        {
            origine += fruit.getOrigine()+"\n";
        }
        return origine;
    }

    @Override
    public boolean isSeedless() {
        for (IFruit fruit : tabFruit)
        {
            if(!fruit.isSeedless()){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean Equals(Object o) {
         if(o.getClass().getName().equals("Macedoine")){  
             if(((Macedoine)o).getSize() == this.getSize()){
                for (int i = 0; i < ((Macedoine)o).getSize(); i++)
               {
                   if(!this.tabFruit.get(i).Equals(((Macedoine)o).tabFruit.get(i))){
                       return false;
                   }
                  
               }
             }
         }
         return true;
    }
    
    public int getSize(){
        return tabFruit.size();
    }

    @Override
    public String ToString() {
        String res = "";
        for (IFruit fruit : tabFruit)
        {
            res += fruit.ToString()+"\n";
        }
        return res;
    }
    
       public boolean estVide()
    {
        return tabFruit.isEmpty();
    }
  
    public void Ajoute(IFruit fruit)
    {
          tabFruit.add(fruit);
    }
    public IFruit getOrange(int i)
    {
        return tabFruit.get(i);
    }
    public void retire()
    {
        if (!estVide())
            tabFruit.remove(tabFruit.size() - 1);
        else
            System.out.println("Panier Vide!");
    }
   
}
