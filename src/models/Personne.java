package models;

public class Personne {

    protected String name;

    public Personne(String name) {
        this.name = name;
    }

    public void affiche(){
        System.out.println("Bonjour suis une personne nommée " + name);
    }

}
