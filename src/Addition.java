public class Addition  extends Operation {

    public Addition(Expression op1 , Expression op2){
        super(op1,op2);
    }

    public double calcule() {
        return op1.evalue()+op2.evalue();
    }

    public  String otoString(){
        //return String.format("%b%b",op1.toString(),op2.toString());
        return "(" + op1 + " " + "+" + " " + op2 + ")";
    }
}
