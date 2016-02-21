

public class VariableEntry extends Entry {
    
	public VariableEntry(String name, Type t) {
		super(name, t);
    }

    /** 
     * Returns a String representation of the variable.
     * e.g., int var
     */
    public String toString() {
	// Do not put a semicolon after the variable because sometimes 
	// a variable declaration is followed by a comma, e.g., 
	// method parameters. Only include the type and identifier name.
    	String arr = "";
    	if(type().isArrayKind()){
    		int size = type().getArraySize();
    		if(size > 0){
    			arr="[" + type().getArraySize() + "]";
    		}else{
    			arr="[]";
    		}
    	}
    	return type() + " " + name() + arr;
    }
}              // End of class VariableEntry            
