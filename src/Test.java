public class Test {

    public static void main(String args[]){
        Expression exp = new Addition( new Constante(3),
                new Addition(new Constante(2),new Constante(4)
                )
        );
        System.out.println("exp.interprete() : " + exp.evalue());
    }
}
