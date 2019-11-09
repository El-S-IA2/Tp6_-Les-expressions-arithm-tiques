public class Soustraction extends Operation {

    public Soustraction(Expression op1 , Expression op2){
        super(op1,op2);
    }

    public double calcule() {
        return op1.evalue()-op2.evalue();
    }
}
