package models;

public class Menuisier extends Personne {

    public Menuisier(String name) {
        super(name);
    }

    @Override
    public void affiche() {
        System.out.println("Bonjour suis un menuisier nommé " + name);
    }
}
