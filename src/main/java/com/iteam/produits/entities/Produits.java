package com.iteam.produits.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produits {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idProduit;
   private String nomProduit;
   private Double prixProduit;
   private Date dateCreation;
   
   
public Produits() {
	super();
	// TODO Auto-generated constructor stub
	
	
}
public Produits(String nomProduit, Double prixProduit, Date dateCreation) {
	super();
	this.nomProduit = nomProduit;
	this.prixProduit = prixProduit;
	this.dateCreation = dateCreation;
}
public Long getIdProduit() {
	return idProduit;
}
public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}
public String getNomProduit() {
	return nomProduit;
}
public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
}
public Double getPrixProduit() {
	return prixProduit;
}
public void setPrixProduit(Double prixProduit) {
	this.prixProduit = prixProduit;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
@Override
public String toString() {
	return "Produits [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
			+ ", dateCreation=" + dateCreation + "]";
}


   
   
   
}
