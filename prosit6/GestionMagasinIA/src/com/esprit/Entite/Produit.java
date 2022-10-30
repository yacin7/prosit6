package com.esprit.Entite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sanabenfadhel
 */
import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.util.Date;

public class Produit {

    private int identifiant;
    private String marque, libelle;
    private float prix;
    private Date dateexpira;

    public void setPrix(float prix) {
        if (prix > 0) {
            this.prix = prix;
        } else {
            System.out.println("le prix doit être positive");
        }

    }

    public float getPrix() {
        return prix;
    }

    public void setMarque(String m) {
        marque = m;
    }

    public String getMarque() {
        return marque;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateexpira() {
        return dateexpira;
    }

    public void setDateexpira(Date dateexpira) {
        this.dateexpira = dateexpira;
    }

    public Produit(int id, String m) {
        identifiant = id;
        marque = m;
    }

    public Produit(String l, int id) {
        identifiant = id;
        libelle = l;
        //prix=1200;
    }

    public Produit(int id, String mar, String libelle) {

        identifiant = id;
        marque = mar;
        this.libelle = libelle;
    }

    public Produit(int id, String mar, String libelle, float prix) {

        identifiant = id;
        marque = mar;
        this.libelle = libelle;
        this.prix = prix;
    }

    public Produit(int id, String mar, String libelle, float prix, Date d) {

        identifiant = id;
        marque = mar;
        this.libelle = libelle;
        this.prix = prix;
        dateexpira = d;
    }

    public Produit() {
    }

    public void affiche() {
        System.out.println("l'identifiant :" + this.identifiant + "la marque :" + marque + "libelle :" + libelle
                + "prix :" + prix + "Date expiration :" + dateexpira);
    }

    @Override
    public String toString() {
        return "l'identifiant :" + this.identifiant + "la marque :" + marque + "libelle :" + libelle + "prix :" + prix + "Date expiration :" + dateexpira;
    }

    public boolean comparer(Produit p) {
        if (identifiant == p.identifiant && libelle.equals(p.libelle) && prix == p.prix) {
            return true;
        }
        return false;
    }

    public static boolean comparer(Produit p1, Produit p2) {
        if ((p1.identifiant == p2.identifiant) && (p1.libelle==p2.libelle)
                && (p1.prix == p2.prix)) {
            return true;
        }
        return false;

    }

}
