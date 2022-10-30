package com.esprit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanabenfadhel
 */
import com.esprit.Entite.Magasin;
import com.esprit.Entite.Produit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produit p1 = new Produit();

        System.out.println("'lidentifiant :" + p1.getIdentifiant());
        System.out.println("marque :" + p1.getMarque());
        System.out.println("libelle :" + p1.getLibelle());
        System.out.println("prix :" + p1.getPrix());

        p1.setIdentifiant(12);
        System.out.println("lidentifiant :" + p1.getIdentifiant());
        System.out.println("p2");
        Produit p2 = new Produit("lait", 1);
        System.out.println("libelle =" + p2.getLibelle());
        System.out.println("id :" + p2.getIdentifiant());
        System.out.println("prix :" + p2.getPrix());
        System.out.println("p3");
        p2.setPrix(- 300);
        System.out.println("prix :" + p2.getPrix());
        Produit p3 = new Produit("Yaourt", 2);
        System.out.println("libelle =" + p3.getLibelle());
        System.out.println("id :" + p3.getIdentifiant());
        System.out.println("prix :" + p3.getPrix());

        Produit p4 = new Produit(1024, "Delice", "Lait");
        System.out.println("libelle =" + p4.getLibelle());
        System.out.println("id :" + p4.getIdentifiant());
        System.out.println("prix :" + p4.getPrix());
        System.out.println("marque :" + p4.getMarque());

        p1.affiche();
        p2.affiche();
        p3.affiche();

        System.out.println(p1.toString());

        System.out.println(p1);

        System.out.println(p2.toString());
        System.out.println(p2);

        Produit p5 = new Produit(3250, "Sicam", "tomata", 1.200f);

        Date d1 = new Date();

        p5.setDateexpira(d1);

        p5.affiche();

        System.out.println(p5);

        Produit p6 = new Produit(5, "Vitalait", "lait", 1.30f, d1);
        System.out.println("p6 :");
        System.out.println(p6);
        Date d2;
        System.out.println("Date");
        String pattern="yyyy-MM-dd";
        SimpleDateFormat form = new SimpleDateFormat(pattern);
        try {
            d2 = form.parse("2022-02-02");
            System.out.println(d2);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        
        System.out.println(p1.comparer(p2));
        System.out.println(Produit.comparer(p3, p2));
        
        Magasin m1=new Magasin(1, "Ariana");
        m1.ajouter(p1);
        m1.ajouter(p1);
        Magasin.affiTotal();
        System.out.println("Le nombre du m1 :"+m1.getNbP());
        Magasin m2=new Magasin(2, "tunis");
        m2.ajouter(p6);
        m2.ajouter(p3);
          System.out.println("Le nombre du m2 :"+m2.getNbP());
        Magasin.affiTotal();
        System.out.println("Plus produit");
        System.out.println(Magasin.plusProduit(m1, m2));
    }

}
