package com.gestion.g04.controllers;

import com.gestion.g04.entities.Produit;
import com.gestion.g04.services.ProduitServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProduitController {
    @Autowired
    ProduitServices produitServices;

    @RequestMapping("/createProduit")
    public String createProduit() {
        return "CreateProduit";
    }

    @RequestMapping("/saveProduit")
    public String saveProduit(@Valid Produit produit, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "CreateProduit";
        }
        produitServices.saveProduit(produit);
        return "CreateProduit";
    }

    @RequestMapping("/listProduits")
    public String listProduits(ModelMap modelMap) {
        List<Produit> produits = produitServices.getAllProduits();
        modelMap.addAttribute("produitsJsp", produits);
        return "ListProduits";
    }

    @RequestMapping("/deleteProduit")
    public String deleteProduit(@RequestParam("id") Long id, ModelMap modelMap) {
        produitServices.deleteProduitById(id);
        List<Produit> produitsController = produitServices.getAllProduits();
        modelMap.addAttribute("produitsJsp", produitsController);
        return "ListProduits";
    }

    @RequestMapping("/showProduit")
    public String showProduit(@RequestParam("id") Long id, ModelMap modelMap) {
        Produit produitsController = produitServices.getProduit(id);
        modelMap.addAttribute("produitsJsp", produitsController);
        return "EditProduit";
    }

    @RequestMapping("/updateProduit")
    public String updateProduit(@ModelAttribute("produit") Produit produit) {
        produitServices.saveProduit(produit);
        return "CreateProduit";
    }
}
