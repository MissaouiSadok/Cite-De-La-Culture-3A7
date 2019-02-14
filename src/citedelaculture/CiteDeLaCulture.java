/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citedelaculture;

import entities.Salle;
import services.ClubServices;
import entities.Club;
import static entities.Etat.accepte;
import static entities.Etat.en_cours;
import static entities.Genre.musique;
import static entities.Genre.theatre;
import static entities.GroupeAge.adulte;
import java.util.Date;
import utils.MyDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kahou
 */
public class CiteDeLaCulture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Salle s1 =new Salle(0,)
       // Club c1 = new Club(0,"opera",musique,new Date(119,02,03,12,50,00),adulte,"groupe musique",30,accepte,"alaa",15,1000,3,60);
       // Club c2 = new Club(1,"redbull",dance,"01/01/2019",2,enfant,"groupe dance",30,en_cours,"boj",15,1000,3,60);
        //Club c3 = new Club(2,"moliere",theatre,"28/02/2019",3,adulte,"groupe theatre",30,en_cours,"houssem",15,1000,3,60);
       // Club c1 = new Club(0, "nom", musique,new Date(119,02,03,12,50,00) , salle, adulte, 0, description, accepte, president, 0, 0, 0, 0)
       Club c1 = new Club(0, "nom", musique,new Date(119,02,03,12,50,00), adulte, 30, accepte,"alaa", 15, 1000, 3, 60);
       Club c2 = new Club(1, "nom1", musique,new Date(119,02,03,12,50,00), adulte, 30, accepte,"kahou", 17, 2000, 4, 90);
       Club c3 = new Club(2, "nom2", theatre,new Date(119,02,03,12,50,00), adulte, 30, accepte,"ali", 16, 900, 5, 45);
               
               
               ClubServices cs = new ClubServices();
               cs.ajouterClub(c1);
               cs.ajouterClub(c2);
               cs.ajouterClub(c3);
               
               
               cs.modifierClub(c1, 2);
               
               
               
               cs.supprimerClub(1);
        
    }
    
    
    
    
}
