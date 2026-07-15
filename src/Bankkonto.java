public class Bankkonto {

    String inhaber;
    double kontostand;

    public Bankkonto(String inhaber, double kontostand) {
        this.inhaber = inhaber;
        this.kontostand = kontostand;
    }

    public void einzahlen(double betrag) {
        kontostand = kontostand + betrag;
        System.out.println(betrag + " CHF wurden eingezahlt.");
    }

    public void abheben(double betrag) {
        if (betrag <= kontostand) {
            kontostand = kontostand - betrag;
            System.out.println(betrag + " CHF wurden abgehoben.");
        } else {
            System.out.println("Nicht genügend Geld auf dem Konto.");
        }
    }
}
