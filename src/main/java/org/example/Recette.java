package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe recette pour créer des recettes
 */
public class Recette {
    private String m_name;
    private List<Ingredients> m_ingredients;
    private TypePlat m_typePlat;
    private TempsPreparation m_tempsPreparation;

    /**
     * Constructeur de Recette
     * @param name Nom de la recette
     * @param ingredients objet ingredients
     * @param typePlat objet typePlat
     * @param tempsPreparation objet tempsPreparation
     */
    public Recette(String name, List<Ingredients>ingredients, TypePlat typePlat, TempsPreparation tempsPreparation) {
        this.m_name = name;
        this.m_ingredients = ingredients;
        this.m_typePlat = typePlat;
        this.m_tempsPreparation = tempsPreparation;
    }

    @Override
    public String toString() {
        return "Recette :" + m_name +
                ", ingrédients : " + m_ingredients +
                ", type de plat : " + m_typePlat +
                ", temps de préparation :" + m_tempsPreparation;
    }

    public String getM_name() {
        return m_name;
    }
}