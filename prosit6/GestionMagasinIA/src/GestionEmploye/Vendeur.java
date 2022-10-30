/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEmploye;

/**
 *
 * @author sanabenfadhel
 */
public class Vendeur extends Employe{
  private int tauxVente;
  
  public Vendeur(int id,String n,String ad,int nbh,int tauxV)
  {
  super(id,n,ad,nbh);
  this.tauxVente=tauxV;
  }

    public Vendeur() {
    }

    public int getTauxVente() {
        return tauxVente;
    }

    public void setTauxVente(int tauxVente) {
        this.tauxVente = tauxVente;
    }
  
  public String toString()
  {
  return "Vendeur"+super.toString()+"taux de vente :"+tauxVente;
  
  }
  public float calculSalaire(){
  return (450*tauxVente);
  }
          
}
