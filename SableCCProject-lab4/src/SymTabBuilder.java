
import analysis.DepthFirstAdapter;
import node.AClassdeclFirstClassDecl;
import node.AClassdeclSecondClassDecl;
import node.AClasshdrFirstClassHdr;
import node.AFieldFirstField;
import node.AFieldSecondField;
import node.AFieldThirdField;
import node.AFormalFirstFormal;
import node.AFormalSecondFormal;
import node.AMethodFirstMethod;
import node.AMethodSecondMethod;
import node.AMethodhdrFirstMethodHdr;
import node.AMethodhdrSecondMethodHdr;
import node.ATypeFifthType;
import node.ATypeFourthType;
import node.ATypeSecondType;
import node.ATypeThirdType;
import node.PType;

public class SymTabBuilder extends DepthFirstAdapter
{ 
    static private SymbolTable symtab = new SymbolTable();

    public SymbolTable symtab() {
    	return symtab;
    }
        
    //  your evaluation rules (i.e., method overrides) go here.

	@Override
	public void outAClasshdrFirstClassHdr(AClasshdrFirstClassHdr node) {
		String className = node.getId().getText();
		ScopeEntry cls = new ClassEntry(className);
		symtab.insertBinding(cls);
		symtab.enterScope(cls);
	}	

	@Override
	public void outAClassdeclFirstClassDecl(AClassdeclFirstClassDecl node) {
		symtab.leaveScope();
	}

	@Override
	public void outAClassdeclSecondClassDecl(AClassdeclSecondClassDecl node) {
		symtab.leaveScope();
	}

	// field declarations
	@Override
	public void outAFieldFirstField(AFieldFirstField node) {// type id;
		String varName = node.getId().getText();
		PType t = node.getType();
		Type type = getType(t);
		
		Entry fld = new VariableEntry(varName, type);
		symtab.insertBinding(fld);
	}
	@Override
	public void outAFieldSecondField(AFieldSecondField node) {// type id = expr ;
		String varName = node.getId().getText();
		PType t = node.getType();
		Type type = getType(t);
		
		Entry fld = new VariableEntry(varName, type);
		symtab.insertBinding(fld);
	}
	@Override
	public void outAFieldThirdField(AFieldThirdField node) {//type id[5];
		String varName = node.getId().getText();
		PType t = node.getType();
		Type type = getType(t);
		type = type.makeArrayType( Integer.parseInt(node.getIntegerConstant().getText()) );
		
		Entry fld = new VariableEntry(varName, type);
		symtab.insertBinding(fld);
	}

	// method headers
	@Override
	public void outAMethodhdrFirstMethodHdr(AMethodhdrFirstMethodHdr node) {// void methodName
		String methodName = node.getId().getText();
		ScopeEntry mtd = new MethodEntry(methodName, Type.voidValue);
		symtab.insertBinding(mtd);
		symtab.enterScope(mtd);
	}
	@Override
	public void outAMethodhdrSecondMethodHdr(AMethodhdrSecondMethodHdr node) {// type methodName
		String methodName = node.getId().getText();
		PType t = node.getType();
		Type type = getType(t);
		ScopeEntry mtd = new MethodEntry(methodName, type);
		
		// insert the scope and enter the scope
		symtab.insertBinding(mtd);
		symtab.enterScope(mtd);
		//System.out.println("entering method scope " + t.toString() + methodName);
	}
	
	// method formals
	@Override
	public void outAFormalFirstFormal(AFormalFirstFormal node) {// type id
		String varName = node.getId().getText();
		PType t = node.getType();
		Type type = getType(t);
		Entry fml = new VariableEntry(varName, type);
		//System.out.println("inside outaformal first formal " + t.toString() + varName);
		// insert the scope 
		symtab.insertBinding(fml);
		//symtab.enterScope(fml);
	}
	@Override
	public void outAFormalSecondFormal(AFormalSecondFormal node) {// type id[]
		String varName = node.getId().getText();
		PType t = node.getType();
		Type type = getType(t);
		type = type.makeArrayType(0);
		Entry fml = new VariableEntry(varName, type);
		
		// insert the scope 
		symtab.insertBinding(fml);
		//symtab.enterScope(fml);
	}
	
	// method
	@Override
	public void outAMethodFirstMethod(AMethodFirstMethod node) {
		symtab.leaveScope();
	}
	@Override
	public void outAMethodSecondMethod(AMethodSecondMethod node) {
		symtab.leaveScope();
	}
	
	// block not needed
	
	
	

	// Helper methods
	/**
	 * find out Integer, char, bool, String and float but not <b>void</b>
	 * 
	 * @param t
	 * @return
	 */
	public Type getType(PType t){
		Type type = Type.intValue;
		
		if(t instanceof ATypeSecondType){
			type = Type.charValue;
		}else if(t instanceof ATypeThirdType){
			type = Type.boolValue;
		}else if(t instanceof ATypeFourthType){
			type = Type.stringValue;
		}else if(t instanceof ATypeFifthType){
			type = Type.floatValue;
		}
		
		return type;
	}

}              /*        end of SymTabBuilder       */
