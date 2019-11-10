public class Multiplication extends Operation {

    public Multiplication(Expression op1 , Expression op2){
        super(op1,op2);
    }

    public double calcule() {
        return op1.evalue()*op2.evalue();
    }

    public  String otoString(){
        //return String.format("({0}*{1})",op1.toString(),op2.toString());
        return "(" + op1 + " " + "*" + " " + op2 + ")";

    }
}
