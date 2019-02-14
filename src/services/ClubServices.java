/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Club;
import entities.Etat;
import entities.Salle;
import entities.Genre;
import entities.GroupeAge;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.MyDB;

/**
 *
 * @author kahou
 */
public class ClubServices {
    Connection cnx;

    public ClubServices() {
        cnx = MyDB.getInstance().getConnexion();
    }
    
    
 public void ajouterClub(Club c){
        String request =  "INSERT INTO `club` (`club_id`, `nom`, `genre`, `date_creation`, `salle`, `groupe_age`, `prix_inscription`, `description`, `etat`, `president`, `nbr_participant`, `budget`, `seance_semaine`, `duree_seance`)"
                + " VALUES (NULL, '"+c.getNom()+
                "', '"+c.getGenre()+"', '"+c.getDate_creation()+
                "', '"+c.getSalle().getId_salle()+"', '"+c.getGroupe_age()+
                "', '"+c.getPrix_inscription()+"', '"+c.getDescription()+"', '"+
                c.getEtat()+"', '"+
                c.getPresident()+"','" +
        c.getNbr_participant()+"', '"+
                c.getBudget()+"', '"+c.getSeance_semaine()+"', '"+c.getDuree_seance()+"')";
        try {
            Statement stm = cnx.createStatement();
            stm.executeUpdate(request);
        } catch (SQLException ex) {
            Logger.getLogger(ClubServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 
 
    public void modifierClub(Club c,int id){
        String request = "UPDATE `produit` SET `nom` = '"+c.getNom()+
                "',`genre` = '"+c.getGenre()+
                "',`dateCreation` = '"+c.getDate_creation()+
                "',`idSalle` = '"+c.getSalle().getId_salle()+
                "',`groupeAge` = '"+c.getGroupe_age()+
                "',`prixInscri` = '"+c.getPrix_inscription()+
                "',`description` = '"+c.getDescription()+
                "',`etat` = '"+c.getEtat()+
                "',`president` = '"+c.getPresident()+
                "',`nbrParticipant` = '"+c.getNbr_participant()+
                "',`budget` = '"+c.getBudget()+
                "',`seanceSemaine` = '"+c.getSeance_semaine()+
                "',`dureeSeance` = '"+c.getDuree_seance()+"'WHERE `id`="+id;
           try {
            Statement stm = cnx.createStatement();
            stm.executeUpdate(request);
        } catch (SQLException ex) {
            Logger.getLogger(ClubServices.class.getName()).log(Level.SEVERE, null, ex);
        }  
           
           
    }
    
    
    public void supprimerClub(int id){
        String request = "DELETE FROM `club` WHERE `id` = "+id;
         try {
            Statement stm = cnx.createStatement();
            stm.executeUpdate(request);
        } catch (SQLException ex) {
            Logger.getLogger(ClubServices.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    public ArrayList<Club> getAllClubs(){
        ArrayList<Club> resultat = new ArrayList<>();
        
        try {
            Statement st = cnx.createStatement();
            ResultSet res= st.executeQuery("select * from produit");
            while(res.next()){
                Club c = new Club();
                c.setClub_id(res.getInt("idClub"));
                c.setNom(res.getString(2));
                c.setGenre(Genre.valueOf(res.getString(3)));
                c.setDate_creation(res.getDate(4));
                c.getSalle().setId_salle(res.getInt(5));
                c.setGroupe_age(GroupeAge.valueOf(res.getString(6)));
                c.setPrix_inscription(res.getFloat(7));
                c.setDescription(res.getString(8));
                c.setEtat(Etat.valueOf(res.getString(9)));
                c.setPresident(res.getString(10));
                c.setNbr_participant(res.getInt(11));
                c.setBudget(res.getFloat(12));
                c.setSeance_semaine(res.getInt(13));
                c.setDuree_seance(res.getInt(14));
                
                resultat.add(c);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClubServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultat;
    }
    


 
 

    
    
    
    
    
}
