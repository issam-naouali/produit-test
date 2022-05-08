package com.iteam.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iteam.produits.entities.Produits;

public interface ProduitRepository extends JpaRepository<Produits, Long> {

}
