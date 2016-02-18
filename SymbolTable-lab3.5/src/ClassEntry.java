
public class ClassEntry extends ScopeEntry {
    public ClassEntry(String name) {
    	super(name);
    }

    /** 
     * Only instances of VariableEntry, MethodEntry, or ClassEntry can be 
     * inserted into a class scope.
     * If symTabEntry is a VariableEntry, MethodEntry, or ClassEntry,
     * then insert it into the local symbol table declared in the 
     * superclass (ScopeEntry), otherwise return false.  
     */
    public boolean addBinding(String name, Entry symTabEntry) {
    	if(symTabEntry instanceof VariableEntry ||
    			symTabEntry instanceof MethodEntry ||
    			symTabEntry instanceof ClassEntry){
    		return super.addBinding(name, symTabEntry);
    		
    	}else{
    		return false;
    	}
    }

    /** 
     * Return a String representation of the class.
     */
    public String toString() {
    	String cls = "class " + name() + "{\n";
    	cls += super.toString();
    	cls += "}\n";
    	return cls;
    }
}              // End of class ClassEntry            

