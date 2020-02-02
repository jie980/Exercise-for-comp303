
public interface Shuffable {
	public void shuffle();
	public static Shuffable NULL = new Shuffable() {
		public void shuffle() {
			
		}
	};
}
