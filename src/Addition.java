public class Addition extends Operation {


    Addition(double op1, double op2) {
        super(op1, op2);
    }

    @Override
    public double calcule() {
        return operande1 + operande2;
    }
}
