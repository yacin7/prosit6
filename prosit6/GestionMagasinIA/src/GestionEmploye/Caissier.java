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
public class Caissier extends Employe{
    private int numCais;
    //private int nbh;
    public Caissier()
    {
    //super();
    }
    
    public Caissier(int num,int id,String n,String ad,int nbh)
    {
    super(id,n,ad,nbh);
    this.numCais=num;
    }

    public Caissier(  String n,int id,int numCais) {
        super(id, n);
        this.numCais = numCais;
    }
    
    

    public int getNumCais() {
        return numCais;
    }

    public void setNumCais(int numCais) {
        this.numCais = numCais;
    }
//    @Override
//    public String toString()
//    {
//    return "num cais:"+numCais+super.toString();
//    }
//    
    
    public void affiche()
    {
    
        System.out.println("this :"+this.toString());
        System.out.println("super :"+super.toString());
   
    
    }
    @Override
    public void test()
    {
    
        System.out.println("test caissier ");
        super.test();
    }
    public void test(int id)
    {
    
        System.out.println("test caissier "+id);
        super.test();
    }
    public float calculSalaire()
            
    {
         float plus=0;
        float tot=0;
       if(nbh > 180)
       {
           plus = nbh - 180;
       }
        tot = (nbh*5)+(plus*5.75f);
      return tot;
    }
            
}
