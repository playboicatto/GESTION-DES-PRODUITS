package com.gestion.g04.repositories;

import com.gestion.g04.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepositories extends JpaRepository<Produit, Long> {

}
