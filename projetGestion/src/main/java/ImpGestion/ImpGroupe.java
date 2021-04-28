/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImpGestion;

import java.util.ArrayList;
import java.util.List;
import projetGestion.dao.IGroupe;
import sn.supinfo.projetgestion.Groupe;

/**
 *
 * @author layedamehane
 */
public class ImpGroupe implements IGroupe {
    ArrayList<Groupe> groupes=new ArrayList<>();
    
    public void addGroupe(Groupe groupe){
        groupes.add(groupe);
        
    }

    public void updateGroupe(Groupe groupe) {
        
         for(Groupe groupe2:groupes){
            if(groupe2.getId_groupe()==groupe.getId_groupe()){
                
                groupe2.setNom_groupe(groupe.getNom_Groupe());
                groupe2.setDate_creation(groupe.getDate_creation());
                groupe2.setModule_groupe(groupe.getModule_groupe());
            }
       
        }
    }

    public Groupe getGroupeById(int i) {
        for(Groupe groupe:groupes){
            if(groupe.getId_groupe()==i){
            return groupe;
            }
        }  
        return null;
    }

    public void removeGroupe(Groupe groupe) {
        groupes.remove(groupe);
       
    }

    public List<Groupe> getAllGroupe() {
        return groupes;
       
    }
    
}
