public class Test {

    public static void main(String args[]){

        Expression [] test ={new Addition(new Division(new Constante(2),new Variable(0)),new Constante(1)),
        		new Addition( new Constante(3), new Addition(new Constante(2),new Constante(4))),new Multiplication(
                new Constante(5),new Constante(7)),
        		new Addition(new Division(
                              new Constante(2),
                              new Constante(4)),
        				new Constante(1)),
        		new Variable(1)};
        for (Expression exp : test) {
            System.out.println(" l'expression " + exp + " a pour valeur : " + exp.evalue(1,5,15));
        }
        
        Expression t=new Division(new Constante(1.0), new Variable(1));
        try {
        	t.evalue(0.0,0.0);}
        catch (DivisionParZeroException e2) {System.out.printf("exeption rattrapé : %s",e2);}
}
}
