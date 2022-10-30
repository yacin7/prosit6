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
public abstract class Employe {

    protected int id;
    protected String nom, adresse;
    protected int nbh;

    public Employe(int id, String n, String ad, int nbh) {
        this.id = id;
        nom = n;
        adresse = ad;
        this.nbh = nbh;
        System.out.println("employe parametré");
    }

    public Employe() {
        System.out.println("Employe par defaut");
    }

    public Employe(int id, String n) {
        this.id = id;
        nom = n;

        System.out.println("employe 2 parametrés");
    }

    @Override
    public String toString() {
        return "id :" + id + "nom :" + nom + "adresse :" + adresse + "nbh :" + nbh;
    }

    public void test() {
        System.out.println("test");
    }

    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }

        if (o.getClass() != this.getClass()) {
            return false;
        }
        
        Employe em = (Employe) o;
        if (em.id == id && em.nom.equals(nom)) {
            return true;
        }

        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbh() {
        return nbh;
    }

    public void setNbh(int nbh) {
        this.nbh = nbh;
    }

    public abstract float calculSalaire();

}
