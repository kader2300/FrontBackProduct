package com.sid.catservice;

import com.sid.catservice.dao.ProduitRepository;
import com.sid.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ProduitRestService {
    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping(value="/listProduits")
    public List<Produit> listProduit(){
        return produitRepository.findAll();
    }

    @GetMapping(value="/listProduits/{id}")
    public Produit listProduit(@PathVariable(name="id")Long id){
        return produitRepository.findById(id).get();
    }

    @PutMapping(value="/listProduits/{id}")
    public Produit update(@PathVariable(name="id")Long id,@RequestBody Produit p){
        return produitRepository.findById(id).get();
    }
}
