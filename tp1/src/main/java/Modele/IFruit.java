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
public interface IFruit {
    public double getPrix();
    public String getOrigine();
    public boolean isSeedless();
    public boolean Equals(Object o);
    public String ToString();
}
