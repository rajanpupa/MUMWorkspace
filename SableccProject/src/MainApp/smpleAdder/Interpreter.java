package MainApp.smpleAdder;
/* An interpreter for the simple math language we all espouse. */

import java.io.FileReader;
import java.io.PushbackReader;

import simpleAdder.analysis.DepthFirstAdapter;
import simpleAdder.lexer.Lexer;
import simpleAdder.node.AIntStatement;
import simpleAdder.node.AProgram;
import simpleAdder.node.AStatement;
import simpleAdder.node.PStatement;
import simpleAdder.node.Start;
import simpleAdder.parser.Parser;

public class Interpreter extends DepthFirstAdapter {

	public static void main(String[] args) {
		if (args.length > 0) {
			try {
				/* Form our AST */
				Lexer lexer = new Lexer(new PushbackReader(new FileReader(args[0]), 1024));
				Parser parser = new Parser(lexer);
				Start ast = parser.parse();

				/* Get our Interpreter going. */
				Interpreter interp = new Interpreter();
				ast.apply(interp);
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.err.println("usage: java simpleAdder inputFile");
			System.exit(1);
		}
	}

//	public void caseAProgram(AProgram node) {
//		String lhs = node.getLeft().getText().trim();
//		String rhs = node.getRight().getText().trim();
//		int result = (new Integer(lhs)).intValue() + (new Integer(rhs)).intValue();
//		System.out.println(lhs + "+" + rhs + "=" + result);
//	}
	
	public void caseAProgram(AProgram node) {
		if(node.getStatement()!=null){
			//System.out.println(node);
			String result = caseAProgram(node.getStatement());
			System.out.println(node + " = " + result);
		}
	}
	
	private String caseAProgram(PStatement statement) {
		//if(statement.)
		AStatement st = (AStatement) statement;
		
		String sum;
		
		if(! (st.getStatement() instanceof AIntStatement)) {
			//System.out.println(st.getStatement());
			sum = caseAProgram(st.getStatement());
			String i = st.getInteger().getText().trim();
			return (Integer.parseInt(sum) + Integer.parseInt(i)) + "";
		}else{
			String r = st.getInteger().getText().trim();
			String l = st.getStatement().toString().trim();
			
			//System.out.println("r = " + r + ", l = " + l);
			
			return (Integer.parseInt(r) + Integer.parseInt(l)) + "";
		}
	}
	

}
