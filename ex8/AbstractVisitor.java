package chex8.ex12;

public abstract class AbstractVisitor implements Visitor{
	public void visitDirectory(Directory d) {
		for(Node n:d) {
			n.accept(this);
		
		}
	}
	public abstract void visitFile(File f);
	public abstract void visitSymbolicLink(SymbolicLink s);
}
