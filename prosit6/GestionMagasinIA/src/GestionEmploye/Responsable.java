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
public class Responsable extends Employe{
    private int prime;

    public Responsable(int prime, int id, String n, String ad, int nbh) {
        super(id, n, ad, nbh);
        this.prime = prime;
    }

    public Responsable() {
    }

    @Override
    public String toString() {
        return "Responsable"+super.toString()+"prime :"+prime; //To change body of generated methods, choose Tools | Templates.
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }
    
    public float calculSalaire()
    {
        float plus=0;
        float tot=0;
       if(nbh > 160)
       {
           plus = nbh - 160;
       }
        tot = (nbh*10)+(plus*10)*0.2f;
      return tot+prime;
    }
}
