package com.sid.catservice;

import com.sid.catservice.dao.ProduitRepository;
import com.sid.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepository produitRepository;

	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(CatServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		restConfiguration.exposeIdsFor(Produit.class);
		produitRepository.save(new Produit(null,"Ordinateur",6700,3));
		produitRepository.save(new Produit(null,"imprimanteHp",1700,3));
		produitRepository.save(new Produit(null,"Samsung S9",8000,13));
		produitRepository.save(new Produit(null,"Ordinateur2",6700,3));
		produitRepository.save(new Produit(null,"imprimanteHp2",1700,3));
		produitRepository.save(new Produit(null,"Samsung S92",8000,13));
		produitRepository.save(new Produit(null,"Ordinateur3",6700,3));
		produitRepository.save(new Produit(null,"imprimanteHp3",1700,3));
		produitRepository.save(new Produit(null,"Samsung S93",8000,13));
		restConfiguration.exposeIdsFor(Produit.class);
		produitRepository.save(new Produit(null,"Ordinateur",6700,3));
		produitRepository.save(new Produit(null,"imprimanteHp",1700,3));
		produitRepository.save(new Produit(null,"Samsung S9",8000,13));
		produitRepository.save(new Produit(null,"Ordinateur2",6700,3));
		produitRepository.save(new Produit(null,"imprimanteHp2",1700,3));
		produitRepository.save(new Produit(null,"Samsung S92",8000,13));
		produitRepository.save(new Produit(null,"Ordinateur3",6700,3));
		produitRepository.save(new Produit(null,"imprimanteHp3",1700,3));
		produitRepository.save(new Produit(null,"Samsung S93",8000,13));
		restConfiguration.exposeIdsFor(Produit.class);
		produitRepository.save(new Produit(null,"Ordinateur",6700,3));
		produitRepository.save(new Produit(null,"imprimanteHp",1700,3));
		produitRepository.save(new Produit(null,"Samsung S9",8000,13));
		produitRepository.save(new Produit(null,"Ordinateur2",6700,3));
		produitRepository.save(new Produit(null,"imprimanteHp2",1700,3));
		produitRepository.save(new Produit(null,"Samsung S92",8000,13));
		produitRepository.save(new Produit(null,"Ordinateur3",6700,3));
		produitRepository.save(new Produit(null,"imprimanteHp3",1700,3));
		produitRepository.save(new Produit(null,"Samsung S93",8000,13));
		produitRepository.findAll().forEach(p -> System.out.println(p.toString()));

	}
}
