public class Test {

    public static void main(String args[]){

        Expression [] test ={new Addition( new Constante(3), new Addition(new Constante(2),new Constante(4))),new Multiplication(
                new Constante(5),new Constante(7)),new Addition(
                new Division(
                        new Constante(2),
                        new Constante(4)),
                new Constante(1))};
        for (Expression exp : test) {
            System.out.println(" l'expression " + exp + " a pour valeur : " + exp.evalue());
        }
    }
}
