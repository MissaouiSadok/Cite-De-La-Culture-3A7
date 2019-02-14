/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author kahou
 */
public class Salle {
    private long id_salle;
    private String nom;
    private int capacite;

    public Salle() {
    }

    public Salle(long id_salle, String nom, int capacite) {
        this.id_salle = id_salle;
        this.nom = nom;
        this.capacite = capacite;
    }

    public long getId_salle() {
        return id_salle;
    }

    public String getNom() {
        return nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setId_salle(long id_salle) {
        this.id_salle = id_salle;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    
    
    
}
