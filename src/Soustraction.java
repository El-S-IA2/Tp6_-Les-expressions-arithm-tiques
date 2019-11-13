public class Soustraction extends Operation {

    public Soustraction(Expression op1 , Expression op2){
        super(op1,op2);
    }

    public double calcule(double v1, double v2) {
        return v1-v2;
    }

    public  String otoString(){
        //return String.format("({0}-{1})",op1.toString(),op2.toString());
        return "(" + op1 + " " + "-" + " " + op2 + ")";

    }
}

