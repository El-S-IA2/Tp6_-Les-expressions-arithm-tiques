public class Constante implements Expression{

    double valeur;

    public Constante(double v) {
        this.valeur=v;
    }

    @Override
    public double evalue(double... variables) {
        return this.valeur;
    }
}
