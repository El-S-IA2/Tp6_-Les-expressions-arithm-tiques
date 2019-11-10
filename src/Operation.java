public abstract class Operation implements Expression {


    double operande1;
    double operande2;

    Operation(double op1, double op2){
        operande1 = op1;
        operande2 = op2;
    }

    public abstract double calcule();

    @Override
    public double evalue(double... variables) {
        return 0;
    }
}
