package org.example;

/**
 * classe pour les types de plats
 */
public class TypePlat {
    private String typePlat;

    /**
     * Constructeur de pour le type du plat
     * @param typePlat Type de plat entrée, dessert etc...
     */
    public TypePlat(String typePlat) {
        this.typePlat = typePlat;
    }

    @Override
    public String toString() {
        return typePlat;
    }
}
