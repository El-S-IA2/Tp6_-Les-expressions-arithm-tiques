public class Test {

    public static void main(String args[]){

        Expression [] test ={
        		new Addition(new Division(new Constante(2),new Variable(0)),new Constante(1))};
        for (Expression exp : test) {
            System.out.println(" l'expression " + exp + " a pour valeur : " + exp.evalue(1,5,15));
        }
    	
    	Expression e = new Variable(1);
    	System.out.println(e.evalue(1,5,15));
    	
    	Expression e2 = new Addition(new Constante(3), new Constante(7));
    	System.out.println(e2.evalue());
    
        Expression u = new Division(new Constante(1), new Constante(0));
        try {
        	u.evalue();
        }
        catch(DivisionParZeroException i) {
        	System.out.println("Exception attrapée : " + i);
        }
    }
}
