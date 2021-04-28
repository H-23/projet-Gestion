/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.projetgestion;

/**
 *
 * @author layedamehane
 */
public class Professeur {
    private int idProf;
    private String prenom;
    private String nom;
    private String adresse;
    private String telephone;
    private String specialite;

    public Professeur(int idProf, String prenom, String nom, String adresse, String telephone, String specialite) {
        this.idProf = idProf;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.specialite = specialite;
    }

    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
}
