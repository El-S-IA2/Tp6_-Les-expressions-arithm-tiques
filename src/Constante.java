public class Constante implements Expression {

    float valeur;

    public Constante(float v) {
        this.valeur = v;
    }

    @Override
    public double evalue(double... variables) {
        return this.valeur;
    }

    @Override
    public String toString() {
        return String.format("%.2g",this.valeur);
    }
}

