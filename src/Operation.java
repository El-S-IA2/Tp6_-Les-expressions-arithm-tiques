public abstract class Operation implements Expression  {

    public  Expression op1;
    public  Expression op2;

    public Operation(Expression op1, Expression op2){
        this.op1 = op1;
        this.op2 = op2;
    }


    public abstract double calcule();
    public abstract String otoString();


   @Override
    public String toString () {
       return this.otoString();
   }

    @Override
    public double evalue (double... v){
        return this.calcule();
    }

}
