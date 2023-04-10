/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tp4banque.jsf;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;

/**
 *
 * @author tomik
 */
@Named(value = "transfert")
@ViewScoped
public class TransfertArgent implements Serializable {

    /**
     * Creates a new instance of TransfertArgent
     */
    
    private int idEnvoyeur;
    private int idReceveur;
    private int montant;
    
    public TransfertArgent() {
    }

    public int getIdEnvoyeur() {
        return idEnvoyeur;
    }

    public void setIdEnvoyeur(int idEnvoyeur) {
        this.idEnvoyeur = idEnvoyeur;
    }

    public int getIdReceveur() {
        return idReceveur;
    }

    public void setIdReceveur(int idReceveur) {
        this.idReceveur = idReceveur;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
    
    
}
