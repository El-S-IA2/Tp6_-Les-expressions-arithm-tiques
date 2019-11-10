public abstract class Operation implements Expression {

    public abstract double calcule();


    @Override
    public double evalue(double... variables) {
        return 0;
    }
}
