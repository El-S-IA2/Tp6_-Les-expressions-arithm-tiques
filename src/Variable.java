public class Variable implements Expression{
    private final int id;
    
    public Variable(int identifiant){
    	if (identifiant <0) {
            throw new IllegalArgumentException("id negatif !");
        }
        id = identifiant;
    }

    @Override
    public double evalue(double... variables) {
    	if(id >= variables.length)
    		throw new VarNonDefEx(this);
        return variables[id];
    }

    @Override
    public String toString(){
        return String.format("%c%d",'x',id);
    }
}
