/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Entite;

import GestionEmploye.Caissier;
import GestionEmploye.Employe;
import GestionEmploye.Responsable;
import GestionEmploye.Vendeur;

/**
 *
 * @author sanabenfadhel
 */
public class Magasin {

    private int id;
    private String adresse;
    private final int CAPACITE = 50;
    private Produit[] tab = new Produit[CAPACITE];
    private int nbP;
    private static int total;
    private final int MAX_EMP = 20;
    private Employe[] tabEmp = new Employe[MAX_EMP];
    private int nbE;

    public int getNbP() {
        return nbP;
    }

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
    }

    public static void affiTotal() {
        System.out.println("Le nombre total des produits ajoutés :" + total);
    }

    public void ajouter(Employe e) {
        if (nbE < MAX_EMP) {
            tabEmp[nbE] = e;
            nbE++;
        } else {
            System.out.println("Magasin plein");
        }
    }

    public void ajouter(Produit p) {
        if (!chercher(p)) {
            if (nbP < CAPACITE) {
                tab[nbP] = p;
                nbP++;
                total++;
            }
        } else {
            System.out.println("le produit existe déjà");
        }
    }

    public boolean chercher(Produit p) {
        for (int i = 0; i < nbP; i++) {

            if (Produit.comparer(tab[i], p)) // if(p.comparer(tab[i]))
            {
                return true;
            }

        }
        return false;
    }

    public Magasin plusProduit(Magasin m) {
        if (this.nbP > m.nbP) {
            return this;
        } else {
            return m;
        }
    }

    public static Magasin plusProduit(Magasin m1, Magasin m2) {
        if (m1.nbP > m2.nbP) {
            return m1;
        } else {
            return m2;
        }
    }

    public String toString() {
        String str = "";
        String str2 = "les employés \n";
        for (int i = 0; i < nbE; i++) {
            str2 += tabEmp[i] + "\n";
        }
        for (int i = 0; i < nbP; i++) {
            str += tab[i] + "\n";
        }
        return "id " + id + " adresse " + adresse + " les Produits" + str + str2;
    }

    public void afficheSalaire() {

        for (int i = 0; i < nbE; i++) {
            System.out.println("Salaire :" + tabEmp[i].calculSalaire());
        }
    }

    public void affichePrime() {
        for (int i = 0; i < nbE; i++) {
            if (tabEmp[i] instanceof Responsable) {
                Responsable res = (Responsable) tabEmp[i];
                System.out.println("Prime :" + res.getPrime());

            } else {
                System.out.println("ce n'est pas un responsable");
            }
        }
    }
public void nbEmplParType()
    {
    int nbV=0,nbC=0,nbR=0;
    
    for(int i=0;i<nbE;i++)
    {
    if(tabEmp[i] instanceof Responsable)
        nbR++;
    
    if(tabEmp[i] instanceof Vendeur)
        nbV++;
    if(tabEmp[i] instanceof Caissier)
        nbC++;
    
    }
        System.out.println("Le nombre de caissier :"+nbC);
        System.out.println("Le nombre de vendeur :"+nbV);
        System.out.println("Le nombre de responsable :"+nbR);
    }
    
}
