public class Constante implements Expression{

    final double constantee;

    Constante(double constante){
        this.constantee = constante;
    }

    @Override
    public double evalue(double... variables) {
        return 0;
    }
}
