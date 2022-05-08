package com.iteam.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iteam.produits.entities.Produits;
import com.iteam.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	
	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
	Produits prod = new Produits("Serveur HP",7000.500,new Date());
	produitRepository.save(prod);
	}
	
	@Test
	public void testFindProduit()
	{
	Produits p = produitRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateProduit()
	{
	Produits p = produitRepository.findById(1L).get();
	p.setPrixProduit(2000.0);
	produitRepository.save(p);
	}
	@Test
	public void testDeleteProduit()
	{
	produitRepository.deleteById(4L);
	}
	@Test
	public void testListerTousProduits()
	{
	List<Produits> prods = produitRepository.findAll();
	for (Produits p : prods)
	{
	System.out.println(p);
	}
	
	}
}


    

