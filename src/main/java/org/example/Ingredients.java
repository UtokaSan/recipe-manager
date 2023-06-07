package org.example;

import java.util.HashMap;

/**
 * Classe pour créer des ingrédients
 */
public class Ingredients {
    private int m_amount;
    private String m_name;

    /**
     * Constructeur de Ingrédients
     * @param amount Le nombre d'ingredient
     * @param name le nom de l'ingredient
     */
    public Ingredients(int amount, String name) {
        this.m_amount = amount;
        this.m_name = name;
    }

    @Override
    public String toString() {
        return m_amount + " " + m_name;
    }

    public int getM_amount() {
        return m_amount;
    }

    public String getM_name() {
        return m_name;
    }
}
