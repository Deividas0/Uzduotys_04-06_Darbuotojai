public class Darbuotojas {
    String vardas;
    String pavarde;
    String pareigos;
    int asmensKodas;
    String arVairuoja;


    public String vardasPavarde() {
        return vardas + pavarde;
    }

    public int simboliuSkaicius() {
        return vardasPavarde().length();
    }
    public String iskirptasTekstas()
    {
        String a = String.valueOf(vardasPavarde().charAt(3));
        String b = String.valueOf(vardasPavarde().charAt(9));
        return a + b;
    }
}