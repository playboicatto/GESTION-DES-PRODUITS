package com.gestion.g04.services;

import com.gestion.g04.entities.Produit;
import com.gestion.g04.repositories.ProduitRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitServicesImpl implements ProduitServices {
    @Autowired
    ProduitRepositories produitRepositories;

    @Override
    public Produit saveProduit(Produit produit) {
        return produitRepositories.save(produit);
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepositories.save(produit);
    }

    @Override
    public Produit getProduit(Long id) {
        return produitRepositories.findById(id).get();
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepositories.findAll();
    }

    @Override
    public void deleteProduitById(Long id) {
        produitRepositories.deleteById(id);
    }

    @Override
    public void deleteAllProduits() {
        produitRepositories.deleteAll();
    }

    @Override
    public Produit getProduitById(int id) {
        return null;
    }
}