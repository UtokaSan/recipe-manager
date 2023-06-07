package org.example;

/**
 * Les valeurs des Menus
 */
public class MenuItem {
    private String label;
    private String action;

    /**
     * Constructeur MenuItem
     * @param label Nom du menu que l'on veut ajouter
     */
    public MenuItem(String label, String action) {
        super();
        this.label = label;
        this.action = action;
    }


    public String getLabel() {
        return label;
    }

    public String getAction() {
        return action;
    }
}