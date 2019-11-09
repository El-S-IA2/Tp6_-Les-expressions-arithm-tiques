public class Variable implements Expression{
    int id;
    char v='x';
    public Variable(int id){
        this.id=id;
        this.v='x';
        if (id <0) {
            throw new IllegalArgumentException("id negatf !");
        }
    }

    @Override
    public double evalue(double... variables) {
        return this.id+this.v;
    }
}
