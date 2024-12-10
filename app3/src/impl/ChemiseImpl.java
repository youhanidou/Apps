package impl;

import entity.Article;
import entity.Chemise;
import service.IChemise;

import java.util.Scanner;

public class ChemiseImpl implements IChemise {

    @Override
    public Chemise saisieC() {
        ArticleImpl AI= new ArticleImpl();
        Article A = AI.saisieA();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la Couture :");
        String couture = scanner.nextLine();

        return new Chemise(A.getId(), A.getLib(), couture);
    }

    @Override
    public void afficheC(Chemise c) {
        System.out.println("ID : " + c.getId());
        System.out.println("Libellé : " + c.getLib());
        System.out.println("Couture : " + c.getCouture());
    }
}
