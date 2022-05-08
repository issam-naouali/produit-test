package com.iteam.produits.service;

import java.util.List;

import com.iteam.produits.entities.Produits;

public interface ProduitsService {
	Produits saveProduit(Produits p);
	Produits updateProduit(Produits p);
	void deleteProduit(Produits p);
	 void deleteProduitById(Long id);
	 Produits getProduit(Long id);
	List<Produits> getAllProduits();


}
