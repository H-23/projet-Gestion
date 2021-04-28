/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImpGestion;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.projetgestion.Etudiant;
import sn.supinfo.projetGestion.dao.IEtudiant;

/**
 *
 * @author layedamehane
 */
public class ImpEtudiant {
    List<Etudiant> etudiants=new ArrayList<>();

    public void addEtudiant(Etudiant etudiant) {
       etudiants.add(etudiant);
    }

    public void updateEtudiant(Etudiant etudiant) {
        for(Etudiant etudiant2: etudiants){
            if(etudiant2.getIdEtudiant()==etudiant.getIdEtudiant()){
                etudiant2.setPrenom(etudiant.getPrenom());
                etudiant2.setNom(etudiant.getNom());
                etudiant2.setNumeroEtudiant(etudiant.getNumeroEtudiant());
                etudiant2.setDepartement(etudiant.getDepartement());
                etudiant2.setDateNaissance(etudiant.getDateNaissance());
                
                
            }
        }
        
    }

    public Etudiant getEtudiantById(int i) {
        for(Etudiant etudiant:etudiants){
            if(etudiant.getIdEtudiant()==i){
                return etudiant;
                
            }
        }
        return null;
        
    }

    public void removeEtudiant(Etudiant etudiant) {
     etudiants.remove(etudiant);
    }

    public List<Etudiant> getAllEtudiant() {
        return etudiants;
       
    }
    
}
