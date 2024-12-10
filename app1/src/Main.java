import entity.Employe;
import entity.Etudiant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employe E=new Employe();
        Etudiant e=new Etudiant();
        System.out.println();
        System.out.println("Employe :");
        E.saisie();
        System.out.println("Information Employe");
        E.affiche();
        System.out.println("*******************************************************");
        System.out.println("Etudiant :");
        e.saisie();
        System.out.println("Information Etudiant");
        e.affiche();

    }
}