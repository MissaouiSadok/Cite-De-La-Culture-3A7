/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author kahou
 */
public class Club {
    

    private long club_id;
    private String nom;
    private Genre genre;
    private Date date_creation;
    private Salle salle;
    private GroupeAge groupe_age;
    private float prix_inscription;   //par mois
    private String description;
    private Etat etat;
    private String president;
    private int nbr_participant;
    private float budget;
    private int seance_semaine;
    private int duree_seance;        //en minutes

    public Club() {
    }

    public Club(long club_id, String nom,Genre genre, Date date_creation,Salle salle, GroupeAge groupe_age, float prix_inscription, String description, Etat etat, String president, int nbr_participant, float budget, int seance_semaine, int duree_seance) {
        this.club_id = club_id;
        this.nom = nom;
        this.genre = genre;
        this.date_creation = date_creation;
        this.salle = salle;
        this.groupe_age = groupe_age;
        this.prix_inscription = prix_inscription;
        this.description = description;
        this.etat = etat;
        this.president = president;
        this.nbr_participant = nbr_participant;
        this.budget = budget;
        this.seance_semaine = seance_semaine;
        this.duree_seance = duree_seance;
    }

    public Club(long club_id, String nom, Genre genre, Date date_creation, Salle salle, GroupeAge groupe_age, float prix_inscription, Etat etat, String president, int nbr_participant, float budget, int seance_semaine, int duree_seance) {
        this.club_id = club_id;
        this.nom = nom;
        this.genre = genre;
        this.date_creation = date_creation;
        this.salle = salle;
        this.groupe_age = groupe_age;
        this.prix_inscription = prix_inscription;
        this.etat = etat;
        this.president = president;
        this.nbr_participant = nbr_participant;
        this.budget = budget;
        this.seance_semaine = seance_semaine;
        this.duree_seance = duree_seance;
    }

    public Club(long club_id, String nom, Genre genre, Date date_creation, GroupeAge groupe_age, float prix_inscription, Etat etat, String president, int nbr_participant, float budget, int seance_semaine, int duree_seance) {
        this.club_id = club_id;
        this.nom = nom;
        this.genre = genre;
        this.date_creation = date_creation;
        this.groupe_age = groupe_age;
        this.prix_inscription = prix_inscription;
        this.etat = etat;
        this.president = president;
        this.nbr_participant = nbr_participant;
        this.budget = budget;
        this.seance_semaine = seance_semaine;
        this.duree_seance = duree_seance;
    }
    
    

    public long getClub_id() {
        return club_id;
    }

    public String getNom() {
        return nom;
    }

    public Genre getGenre() {
        return genre;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public Salle getSalle() {
        return salle;
    }

    public GroupeAge getGroupe_age() {
        return groupe_age;
    }

    public float getPrix_inscription() {
        return prix_inscription;
    }

    public String getDescription() {
        return description;
    }

    public Etat getEtat() {
        return etat;
    }

    public String getPresident() {
        return president;
    }

    public int getNbr_participant() {
        return nbr_participant;
    }

    public float getBudget() {
        return budget;
    }

    public int getSeance_semaine() {
        return seance_semaine;
    }

    public int getDuree_seance() {
        return duree_seance;
    }

    public void setClub_id(long club_id) {
        this.club_id = club_id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public void setGroupe_age(GroupeAge groupe_age) {
        this.groupe_age = groupe_age;
    }

    public void setPrix_inscription(float prix_inscription) {
        this.prix_inscription = prix_inscription;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public void setNbr_participant(int nbr_participant) {
        this.nbr_participant = nbr_participant;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public void setSeance_semaine(int seance_semaine) {
        this.seance_semaine = seance_semaine;
    }

    public void setDuree_seance(int duree_seance) {
        this.duree_seance = duree_seance;
    }

    @Override
    public String toString() {
        return "Club{" + "club_id=" + club_id + ", nom=" + nom + ", genre=" + genre + ", date_creation=" + date_creation + ", salle=" + salle + ", groupe_age=" + groupe_age + ", prix_inscription=" + prix_inscription + ", description=" + description + ", etat=" + etat + ", president=" + president + ", nbr_participant=" + nbr_participant + ", budget=" + budget + ", seance_semaine=" + seance_semaine + ", duree_seance=" + duree_seance + '}';
    }

    
    
    

   

    
}
