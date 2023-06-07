package org.example;

/**
 * Classe pour le temps de préparation d'une recette
 */
public class TempsPreparation {
    private String m_tempsPreparation;

    /**
     * Constructeur TempsPreparation
     * @param tempsPreparation String afin d'indiquer le temps de préparation
     */
    public TempsPreparation(String tempsPreparation) {
        this.m_tempsPreparation = tempsPreparation;
    }

    @Override
    public String toString() {
        return m_tempsPreparation;
    }
}