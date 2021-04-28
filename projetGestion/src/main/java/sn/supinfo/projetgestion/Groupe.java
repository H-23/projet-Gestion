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
public class Groupe {
    private int id_groupe;
    private String nom_groupe;
    private String date_creation;
    private String module_groupe;

    public Groupe(int id_groupe,String nom_groupe, String date_creation, String module_groupe) {
        this.id_groupe= id_groupe;
        this.nom_groupe = nom_groupe;
        this.date_creation = date_creation;
        this.module_groupe = module_groupe;
    }

    public int getId_groupe() {
        return id_groupe;
    }

    public void setId_groupe(int id_groupe) {
        this.id_groupe = id_groupe;
    }
   
    public String getNom_Groupe() {
        return nom_groupe;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public String getModule_groupe() {
        return module_groupe;
    }

    public void setNom_groupe(String nom_groupe) {
        this.nom_groupe = nom_groupe;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public void setModule_groupe(String module_groupe) {
        this.module_groupe = module_groupe;
    }
    
}
