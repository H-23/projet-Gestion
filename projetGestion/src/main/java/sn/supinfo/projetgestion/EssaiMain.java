/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.projetgestion;

import java.util.List;
import java.util.Scanner;
import sn.supinfo.projetGestion_implements.imp.EtudiantImp;
import sn.supinfo.projetGestion_implements.imp.GroupeImp;
import sn.supinfo.projetGestion_implements.imp.ProfImp;

/**
 *
 * @author layedamehane
 */
public class EssaiMain {
    public static void Menu(){
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("#                            MENU PRINCIPAL                           #");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("\n");
        System.out.println("1- Gestion Groupe");
        System.out.println("2- Gestion Etudiant");
        System.out.println("3- Gestion Professeurs");
        System.out.println("4- Gestion groupe-Etudiant");
        System.out.println("5- Quitter");
        System.out.println("Votre Choix :");
    }
    
     public static void main(String args[]){
         GroupeImp groupeImp=new GroupeImp();
         EtudiantImp etudiantImp=new EtudiantImp();
         ProfesseurImp professeurImp=new ProfesseurImp();
        int choix;
        Scanner cl=new Scanner(System.in);
        
        do{
            Menu(); 
            choix=cl.nextInt();
        
          switch(choix){
              case 1:
                 System.out.println("*************** Gestion Groupe **************");
                 System.out.println("========================================\n1\t");
                 System.out.println(" 1- Creer un Groupe");
                 System.out.println(" 2- Modifier un Groupe");
                 System.out.println(" 3- Voire les details d'un Groupe");
                 System.out.println(" 4- Supprimer un Groupe");
                 System.out.println(" 5- Afficher tous les Groupes");
                 System.out.println(" 6- Quitter");
                 System.out.println("Votre Choix :");
                 Scanner ch=new Scanner(System.in);
                 choix=ch.nextInt();
                 switch(choix){
                     
                     case 1:System.out.println("Creation d'un groupe");
                     
                     
                          System.out.println("Nom du Groupe");
                          String nom_groupe=cl.next();
                          System.out.println("Date de creation");
                          String date_creation=cl.next();
                          System.out.println("Module du groupe");
                          String module_groupe=cl.next();
                          System.out.println("Id du groupe");
                          int id_groupe=cl.nextInt();
                          Groupe groupe=new Groupe(id_groupe,nom_groupe,date_creation,module_groupe);
                     
                          groupeImp.addGroupe(groupe);
    
                     break;
                     
                     case 2:System.out.println("Modification d'un groupe");
                          System.out.println("Donez l'id du groupe");
                          int idGroupe=cl.nextInt();
                          Groupe groupe2=groupeImp.getGroupeById(idGroupe);
                           System.out.println("Nom du Groupe");
                          String nomgroupe=cl.next();
                          groupe2.setNom_groupe(nomgroupe);
                          System.out.println("Date de creation");
                          String datecreation=cl.next();
                          groupe2.setDate_creation(datecreation);
                          System.out.println("Module du groupe");
                          String modulegroupe=cl.next();
                          groupe2.setModule_groupe(modulegroupe);
                          
                          groupeImp.updateGroupe(groupe2);
                          
                          System.out.println("Modification reussie !");
                     
                       break;
                     case 3:System.out.println("Details d'un groupe");
                          System.out.println("Donner l'id du groupe");
                          id_groupe=cl.nextInt();
                          Groupe groupe3=groupeImp.getGroupeById(id_groupe);
                          System.out.println(groupe3.getNom_Groupe()+"\n "+groupe3.getDate_creation()+"\n "+groupe3.getModule_groupe());
                          break;
                     case 4:System.out.println("Suppression d'un Groupe :");
                          System.out.println("Donner l'id du groupe");
                          id_groupe=cl.nextInt();
                          Groupe groupe4=groupeImp.getGroupeById(id_groupe);
                          groupeImp.removeGroupe(groupe4);
                          System.out.println("Suppression reussie");
                          break;
                     case 5:System.out.println("Affichage des groupes");
                          List<Groupe> groupes=groupeImp.getAllGroupe();
                          for(Groupe groupe5:groupes){
                          System.out.println(groupe5.getNom_Groupe());
                     }
                          break;
                     case 6:System.out.println("Au revoir !");
                          break;
                     default: System.out.println("Veuillez entrez un chix entre 1 et 6");
                    }
                          break;
            case 2:
               
                 System.out.println("****  Vous avez choisi Gestion Etudiant ****");
                 System.out.println("============================================");
                 System.out.println(" 1- Ajouter un etudiant");
                 System.out.println(" 2- Modifier un etudiant");
                 System.out.println(" 3- Voire les details d'un etudiant");
                 System.out.println(" 4- Supprimer un etudiant");
                 System.out.println(" 5- Afficher tous les etudiants");
                 System.out.println(" 6- Quitter");
                 System.out.println("Faites un Choix :");
                 Scanner ch2=new Scanner(System.in);
                 choix=ch2.nextInt();
                 switch(choix){
                      case 1:System.out.println(" Ajouter un etudiant");
                           System.out.println("id de l'etudiant");
                           int idEtudiant=cl.nextInt();
                           System.out.println("Prenom de l'etudiant");
                           String prenom=cl.next();
                           System.out.println("Nom de l'etudiant");
                           String nom=cl.next();
                           System.out.println("Numero de l'etudiant");
                           String numeroEtudiant=cl.next();
                           System.out.println("Nom du departement");
                           String departement=cl.next();
                           System.out.println("Date de naissance");
                           String dateNaissance=cl.next();
                           Etudiant etudiant=new Etudiant(idEtudiant,prenom, nom, numeroEtudiant, departement, dateNaissance);
                           etudiantImp.addEtudiant(etudiant);
                      break;
                      
                      case 2:System.out.println(" Modifier un etudiant");
                           System.out.println("Donner l'id de l'etudiant");
                           int idEtudiant1=cl.nextInt();
                           Etudiant etudiant2=etudiantImp.getEtudiantById(idEtudiant1);
                           System.out.println("Prenom de l'etudiant");
                           String prenomEt=cl.next();
                           System.out.println("Nom de l'etudiant");
                           String nomEt=cl.next();
                           System.out.println("Numero de l'etudiant");
                           String numEt=cl.next();
                           System.out.println("Nom du departement");
                           String nomDpt=cl.next();
                           System.out.println("Date de naissance");
                           String dateNais=cl.next();
                           etudiantImp.updateEtudiant(etudiant2);
                           System.out.println("Modification reussie !!");
                           break;
                           case 3:System.out.println(" Voire les details d'un etudiant");
                           System.out.println("Donner l'id de l'etudiant");
                           idEtudiant=cl.nextInt();
                           Etudiant etudiant3=etudiantImp.getEtudiantById(idEtudiant);
                           System.out.println(etudiant3.getPrenom()+"\n "+etudiant3.getNom()+"\n "+etudiant3.getNumeroEtudiant()+"\n "+etudiant3.getDepartement()+"\n "+etudiant3.getDateNaissance());
                           break;
                           case 4:System.out.println(" Supprimer un etudiant");
                           System.out.println("Donner l'id du groupe");
                           idEtudiant=cl.nextInt();
                           Etudiant etudiant4=etudiantImp.getEtudiantById(idEtudiant);
                           etudiantImp.removeEtudiant(etudiant4);
                           System.out.println("Suppression reussie");
                           ;break;
                           case 5:System.out.println(" Afficher tous les etudiants");
                           List<Etudiant> etudiants=etudiantImp.getAllEtudiant();
                           for(Etudiant etudiant5:etudiants){
                           System.out.println(etudiant5.getPrenom()+" "+etudiant5.getNom());
                           }
                           break;
                           case 6:System.out.println(" Bye bye !!!");
                           System.exit(0);
                      break;
                      default:System.out.println("Choisir un numero valide !!!");
                          break;
                      
                 }
                 
                 break;
                 
                 
            case 3:
                
                 System.out.println("Vous avez choisi Gestion Professeurs");
                 System.out.println("============================================");
                 System.out.println(" 1- Ajouter un professeur");
                 System.out.println(" 2- Modifier un professeur");
                 System.out.println(" 3- Voire les details d'un professeur");
                 System.out.println(" 4- Supprimer un professeur");
                 System.out.println(" 5- Afficher tous les professeurs");
                 System.out.println(" 6- Quitter");
                  System.out.println("Faites un Choix :");
                 Scanner ch3=new Scanner(System.in);
                 choix=ch3.nextInt();
                 switch(choix){
                      case 1:System.out.println("Ajout d'un professeur");
                          System.out.println("id du Pofesseur");
                           int idProf=cl.nextInt();
                           System.out.println("Prenom du Professeur");
                           String prenom=cl.next();
                           System.out.println("Nom du Professeur");
                           String nom=cl.next();
                           System.out.println("Adresse du Professeur");
                           String adresse=cl.next();
                           System.out.println("Numero telephone du Prof");
                           String telephone=cl.next();
                           System.out.println("Specilite du professeur");
                           String specialite=cl.next();
                           Professeur professeur=new Professeur(idProf,prenom, nom, adresse, telephone,specialite);
                           professeurImp.addProfesseur(professeur);
                          break;
                      case 2:System.out.println("Modification d'un professeur");
                           System.out.println("Donner l'id du professeur");
                           int idProf1=cl.nextInt();
                           Professeur professeur2=professeurImp.getProfesseurById(idProf1);
                           System.out.println("Prenom du Professeur");
                           String prenomProf=cl.next();
                           System.out.println("Nom du professeur");
                           String nomProf=cl.next();
                           System.out.println("Adresse du professeur");
                           String adr=cl.next();
                           System.out.println("Telephone du professeur");
                           String tel=cl.next();
                           System.out.println("Specialite du prof");
                           String special=cl.next();
                           professeurImp.updateProfesseur(professeur2);
                           System.out.println("Modification reussie !!");
                      break;
                      case 3:System.out.println(" Voire les details d'un professeur");
                           System.out.println("Donner l'id du professeur");
                           idProf=cl.nextInt();
                           Professeur professeur3=professeurImp.getProfesseurById(idProf);
                           System.out.println(professeur3.getPrenom()+"\n "+professeur3.getNom()+"\n "+professeur3.getAdresse()+"\n "+professeur3.getTelephone()+"\n "+professeur3.getSpecialite());
                      break;
                      case 4:System.out.println(" Supprimer un etudiant");
                           System.out.println("Donner l'id du groupe");
                           idProf=cl.nextInt();
                           Professeur professeur4=professeurImp.getProfesseurById(idProf);
                           professeurImp.removeProfesseur(professeur4);
                           System.out.println("Suppression du prof reussie");
                      break;
                      case 5:System.out.println(" Afficher tous les professeurs");
                           List<Professeur> professeurs=professeurImp.getAllProfesseur();
                           for(Professeur professeur5:professeurs){
                           System.out.println(professeur5.getPrenom()+" "+professeur5.getNom());
                           };break;
                      case 6:System.out.println("Au revoir !");
                              System.exit(0);break;
                      default:System.out.println("Veuillez choisit un numero valide !!!");break;
                 }
                 break;
                 
                 
            case 4:
               
                 System.out.println("Vous avez choisi Gestion Etudiant d'un groupe");
                 System.out.println("============================================");
                 System.out.println(" 1- Ajouter un etudiant dans un groupe");
                 System.out.println(" 2- Modifier un etudiant d'un groupe");
                 System.out.println(" 3- Voire les details d'un etudiant d'un groupe");
                 System.out.println(" 4- Supprimer un etudiant d'un groupe");
                 System.out.println(" 5- Afficher tous les etudiants d'un groupe");
                 System.out.println(" 6- Quitter");
                 System.out.println("Faites un Choix :");
                 Scanner ch4=new Scanner(System.in);
                 choix=ch4.nextInt();
                 switch(choix){
                      case 1:;break;
                      case 2:;break;
                      case 3:;break;
                      case 4:;break;
                      case 5:;break;
                      case 6:;break;
                      default:break;
                 }
                 break;
                 
            case 5: System.out.println("A la prochaine !");
            System.exit(0);break;
            default: System.out.println("Veuillez choisir entre 1 et 5");break;
            }
        }
        while(choix!=5);
        
        }
    
}
