package com.gestion.g04;

import com.gestion.g04.entities.Produit;
import com.gestion.g04.repositories.ProduitRepositories;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class G04ApplicationTests {
	@Autowired
	ProduitRepositories produitRepositories;

	@Test
	public void TestCreateProduit() {

	}


}
