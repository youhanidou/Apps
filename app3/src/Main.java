
import entity.Chemise;
import entity.Montre;
import impl.ChemiseImpl;
import impl.MontreImpl;

public class Main {
    public static void main(String[] args) {
        ChemiseImpl CI= new ChemiseImpl();
        MontreImpl MI= new MontreImpl();

        System.out.println("CHEMISE :");
        Chemise C=CI.saisieC();
        System.out.println("Information Chemise :");
        CI.afficheC(C);
        System.out.println("*************************************");
        System.out.println("MONTRE :");
        Montre M=MI.saisie();
        System.out.println("Information Nature :");
        MI.affiche(M);
    }
        }
