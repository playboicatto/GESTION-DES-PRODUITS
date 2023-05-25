package com.gestion.g04.services;

import com.gestion.g04.entities.Produit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProduitServices {

    Produit saveProduit(Produit produit);

    Produit updateProduit(Produit produit);

    Produit getProduit(Long id);

    List<Produit> getAllProduits();

    void deleteProduitById(Long id);

    void deleteAllProduits();

    Produit getProduitById(int id);
}