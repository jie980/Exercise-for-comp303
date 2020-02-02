package chex8.ex12;

public class PrintVisitor extends  AbstractVisitor {
	private static final String TAB = "--";
	private StringBuilder aIndent = new StringBuilder();
	   private void indent()
	   {
	      aIndent.append(TAB);
	   }
		
	   private void unindent()
	   {
	      aIndent.delete(aIndent.length()-TAB.length(), aIndent.length());
	   }
	   
	public void visitFile(File f) {
		
		System.out.println(aIndent+f.name());
	}
	public void visitDirectory(Directory d) {
		System.out.println(aIndent+d.name());
		indent();
		for(Node n:d) {
			n.accept(this);
		
		}
		unindent();
		
	}
	
	public void visitSymbolicLink(SymbolicLink s) {

		System.out.println(aIndent+s.name());
	
		
	}
}
