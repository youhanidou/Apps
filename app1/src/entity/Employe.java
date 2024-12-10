package entity;

import service.IPersonne;

import java.util.Scanner;

public class Employe extends Personne implements IPersonne {
    private String fonction;
    private int salaire;

    public Employe() {
    }

    public Employe(String nom, String prenom, String fonction, int salaire) {
        super(nom, prenom);
        this.fonction = fonction;
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void saisie() {
        saisiP();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saisir la Fonction :");
        fonction=scanner.nextLine();
        do {
            System.out.println("Saisir salaire :");
            salaire=scanner.nextInt();
        }while (salaire<=0);

    }

    @Override
    public void affiche() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        System.out.println("Fonction : " + this.fonction);
        System.out.println("Salaire : " + this.salaire);
    }
}
