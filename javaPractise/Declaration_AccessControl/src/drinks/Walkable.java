package drinks;

public interface Walkable {
	void doStuff();
	default void doWork() {
		System.out.println("in walk");
	}
	static int name() {
		return 01;
	}
}
