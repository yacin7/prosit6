/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEmploye;

import com.esprit.Entite.Magasin;

/**
 *
 * @author sanabenfadhel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  Employe e1=new Employe(); //emplo par defau
        Caissier c1=new Caissier();//emplo par defau
        Caissier c2=new Caissier(1, 2, "nom", "ad", 10);//emp par
        
        System.out.println("id "+c2.id);
        System.out.println("num cais:"+c2.getNumCais());
    
       // System.out.println(e1.toString());
        System.out.println(c2.toString());
        
       // System.out.println(e1);
        System.out.println(c2);
        System.out.println("test affiche");
        c2.affiche();
        
        c2.test();
        c2.test(4);
        
        Vendeur vend=new Vendeur(1, "ons", "tnis", 10, 500);
        // Vendeur vend1=new Vendeur(1, "ons", "tnis", 10, 500);
        Responsable resp=new Responsable(1000, 4, "sinda", "nabeul", 10);
        
        Magasin m1=new Magasin(1, "ariana");
        m1.ajouter(c2);
        m1.ajouter(vend);
        m1.ajouter(resp);
        System.out.println("Magasin");
        
        System.out.println(m1);
        
        System.out.println("Affiche Salaire");
        
        m1.afficheSalaire();
     Employe emp=new Responsable(500, 12, "sana","tunis", 10);
        if(emp instanceof Responsable){
      Responsable resp1=(Responsable)emp; 
      
        System.out.println(resp1.getPrime());
        
        System.out.println(((Responsable)emp).getPrime());
        }
        
        else{
            System.out.println("ce n'est pas un responsable");
        }
        
//       if(emp instanceof Vendeur)
//       {
       Vendeur vend2=(Vendeur)emp; 
      
//        System.out.println("Taux de vente :"+vend2.getTauxVente());
//       }
//       else{
           System.out.println("ce n'est pas un vendeur");
       
       m1.affichePrime();
       m1.ajouter(emp);
       m1.nbEmplParType();
       
        Vendeur vend2=new Vendeur(1, "ons", "tnis", 10, 500);
         Vendeur vend3=new Vendeur(1, "ons", "tnis", 10, 500);
       Responsable  resp4=new Responsable();
       resp4.setId(1);
       resp4.setNom("ons");
             
        System.out.println(vend3.equals(vend2));
        
        String str="abc";
        System.out.println(str.equals(emp));
        
        System.out.println(emp.equals(str));
        
        
        System.out.println(vend3.equals(resp4));
        
        System.out.println(vend3.getClass());
        System.out.println(resp4.getClass());
       }
    
    
}
