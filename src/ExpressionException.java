public class ExpressionException extends RuntimeException{
    Expression ex ;
    ExpressionException(Expression ex){
        super("erreur survenu avec l'expression "+ex);
        this.ex=ex;
    }
}
