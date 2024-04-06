import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Uzduotis1 {

    public static void main(String[] args) {
        Darbuotojas darb1 = new Darbuotojas();
        Darbuotojas darb2 = new Darbuotojas();
        Darbuotojas darb3 = new Darbuotojas();
        Darbuotojas darb4 = new Darbuotojas();

        darb1.vardas = "Tadas ";
        darb1.pavarde = "Tadelis";
        darb1.pareigos = "Operatorius";
        darb1.asmensKodas = 254158874;
        darb1.arVairuoja = "Darbuotojas turi vairuotojo pažimėjimą";

        darb2.vardas = "Mantas ";
        darb2.pavarde = "Mantelis";
        darb2.pareigos = "Krovėjas";
        darb2.asmensKodas = 251438874;
        darb2.arVairuoja = "Darbuotojas turi vairuotojo pažimėjimą";

        darb3.vardas = "Jonas ";
        darb3.pavarde = "Jonelis";
        darb3.pareigos = "Melžėjas";
        darb3.asmensKodas = 254612374;
        darb3.arVairuoja = "Darbuotojas neturi vairuotojo pažimėjimo";

        darb4.vardas = "Kęstas ";
        darb4.pavarde = "Kęstutis";
        darb4.pareigos = "Pakuotojas";
        darb4.asmensKodas = 251231874;
        darb4.arVairuoja = "Darbuotojas turi vairuotojo pažimėjimą";

        System.out.println(darb1.vardasPavarde());
        System.out.println(darb1.simboliuSkaicius());
        System.out.println(darb1.iskirptasTekstas());
        System.out.println();

        System.out.println(darb2.vardasPavarde());
        System.out.println(darb2.simboliuSkaicius());
        System.out.println(darb2.iskirptasTekstas());
        System.out.println();

        System.out.println(darb3.vardasPavarde());
        System.out.println(darb3.simboliuSkaicius());
        System.out.println(darb3.iskirptasTekstas());
        System.out.println();

        System.out.println(darb4.vardasPavarde());
        System.out.println(darb4.simboliuSkaicius());
        System.out.println(darb4.iskirptasTekstas());
        System.out.println();
    }

    public String palyginimas() {

        Darbuotojas darb1 = new Darbuotojas();
        Darbuotojas darb2 = new Darbuotojas();
        Darbuotojas darb3 = new Darbuotojas();
        Darbuotojas darb4 = new Darbuotojas();
        List<String> palyginimoSarasas = new ArrayList<>() {};
    }
}