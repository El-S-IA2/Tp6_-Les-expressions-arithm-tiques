public class Variable implements Expression {

    int id=0;

    Variable(){
        this.id++;
    }

    @Override
    public double evalue(double... variables) {
        return 0;
    }
}
