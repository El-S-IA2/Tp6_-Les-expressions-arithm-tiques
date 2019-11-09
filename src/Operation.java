public abstract class Operation implements Expression  {

    public  Expression op1;
    public  Expression op2;

    public Operation(Expression op1, Expression op2){
        this.op1 = op1;
        this.op2 = op2;
    }


    public abstract double calcule();


    @Override
    public double evalue(double... v)  {
        double resultat = 0.0 ;
            switch (this.op1) {
                case '+' :
                     resultat = op1.evalue() + op2.evalue();
                     break;
                    case '-' :
                     resultat =  op1.evalue() - op2.evalue();
                     break;
                 case '*' :
                     resultat =  op1.evalue() * op2.evalue();
                     break;
                 case '/' :
                     resultat =  op1.evalue() / op2.evalue();
                     break;
                 case 'v' :
                     resultat = 0;
                     }
             return resultat;

    }


}
