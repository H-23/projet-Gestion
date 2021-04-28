/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetGestion.dao;

import java.util.List;
import sn.supinfo.projetgestion.Professeur;

/**
 *
 * @author layedamehane
 */
public interface IProfesseur {
    public void addProfesseur(Professeur professeur);
     public void updateProfesseur(Professeur professeur);
     public Professeur getProfesseurById(int i);
     public void removeProfesseur(Professeur professeur);
     public List<Professeur> getAllProfesseur();
    
}
