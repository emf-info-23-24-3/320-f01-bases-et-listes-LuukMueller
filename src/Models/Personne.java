package Models;

public class Personne {
String nom;
String Prenom;
Integer numeroPostal;



public Personne(String nom, String prenom, Integer numeroPostal) {
    this.nom = nom;
    Prenom = prenom;
    this.numeroPostal = numeroPostal;
}



public String getNom() {
    return nom;
}



public String getPrenom() {
    return Prenom;
}



public Integer getNumeroPostal() {
    return numeroPostal;
}



@Override
public String toString() {
    return "nom=" + nom + ", Prenom=" + Prenom + ", numeroPostal=" + numeroPostal ;
}


}

