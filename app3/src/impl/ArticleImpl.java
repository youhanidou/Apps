package impl;

import entity.Article;
import service.IArticle;

import java.util.Scanner;

public class ArticleImpl implements IArticle {

    @Override
    public Article saisieA() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saisir L'ID :");
        int Id=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Saisir Libelle :");
        String lib=scanner.nextLine();
        return new Article(Id,lib);
    }
    @Override
    public void afficheA(Article a) {
        System.out.println("ID : " + a.getId());
        System.out.println("LIB : " + a.getLib());
    }
}
