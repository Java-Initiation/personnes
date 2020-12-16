import models.Menuisier;
import models.Personne;
import models.Plombier;

public class Main {

    public static void main(String[] args) {

        Personne[] personnes = new Personne[3];
        personnes[0] = new Menuisier("Toto");
        personnes[1] = new Plombier("Tata");
        personnes[2] = new Menuisier("Titi");

        for (Personne personne: personnes){
            personne.affiche();
        }


    }


}
