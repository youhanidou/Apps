package entity;

import service.IProduit;

import java.util.Scanner;

public class ProduitImpl implements IProduit {


    @Override
    public Produit saisie() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saisir la reference :");
        String ref=scanner.nextLine();

        System.out.println("Saisir Libellé :");
        String libelle=scanner.nextLine();


        System.out.println("Saisir Quantite :");
        double quantite= scanner.nextDouble();

        System.out.println("Saisir Prix :");
        int prix= scanner.nextInt();

        return new Produit(ref,libelle,quantite,prix);
    }

    @Override
    public void affiche(Produit P) {
        System.out.println("Référence: " + P.getRef());
        System.out.println("Libellé: " + P.getLibelle());
        System.out.println("Quantité: " + P.getQuantite());
        System.out.println("Prix: " + P.getPrix());
    }

}
