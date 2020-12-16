package models;

public class Plombier extends Personne {

    public Plombier(String name) {
        super(name);
    }

    @Override
    public void affiche() {
        System.out.println("Bonjour suis un plombier nommé " + name);
    }

}
