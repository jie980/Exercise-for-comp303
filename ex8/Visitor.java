package chex8.ex12;

public interface Visitor {
	void visitFile(File f) ;
	void visitDirectory(Directory d);
	void visitSymbolicLink(SymbolicLink s);
	
}
