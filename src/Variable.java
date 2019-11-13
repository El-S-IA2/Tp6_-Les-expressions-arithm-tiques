public class Variable implements Expression{
    private final int id;
    public Variable(int id){
        if (id <0) {
            throw new IllegalArgumentException("id negatf !");
           }
        this.id=id;
    }

    @Override
    public double evalue(double... variables) {
    	if (id>=variables.length) {
    		throw new VariableNonDefinieException(this);
    	}
        return variables[id];
    }

    @Override
    public String toString(){
    	return String.format("%c%d",'x',this.id);
    }
}
