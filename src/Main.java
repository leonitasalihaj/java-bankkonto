public class Main {

    public static void main(String[] args) {

        Bankkonto konto = new Bankkonto("Leonita Salihaj", 500.0);

        konto.einzahlen(200.0);
        konto.abheben(100.0);

        System.out.println("Inhaberin: " + konto.inhaber);
        System.out.println("Kontostand: " + konto.kontostand + " CHF");
    }
}