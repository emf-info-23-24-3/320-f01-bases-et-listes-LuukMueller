package app;

import java.util.ArrayList;

import Models.Personne;

public class Application {

    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();
        
        personnes.add(new Personne("Marc", "Reinhard", 1723));
        personnes.add(new Personne("Basil", "Ahrens", 1700));
        personnes.add(new Personne("Otto", "Olafsson", 1720));

        for (Personne personne : personnes) {
            System.out.println(personne);
        }
    }

    

}
