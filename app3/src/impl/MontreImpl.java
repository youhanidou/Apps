package impl;
import entity.Article;
import entity.Montre;
import service.IMontre;

import java.util.Scanner;

public class MontreImpl implements IMontre{
    @Override
    public Montre saisie() {
        ArticleImpl AI=new ArticleImpl();
        Article A=AI.saisieA();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saisir Nature");
        String nature=scanner.nextLine();
        return new Montre(A.getId(),A.getLib(),nature);
    }

    @Override
    public void affiche(Montre m) {
        System.out.println("ID : " + m.getId());
        System.out.println("Libellé : " + m.getLib());
        System.out.println("Nature : " + m.getNature());
    }
}
