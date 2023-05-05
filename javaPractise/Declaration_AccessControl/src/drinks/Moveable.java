package drinks;

public interface Moveable {
	void doStuff();
	default void doork() {
		System.out.println("in moveable");
	}
	static int name() {
		return 11;
	}
}
