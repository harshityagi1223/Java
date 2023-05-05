package drinks;

public abstract class Action implements Walkable, Moveable {

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub

	}
	public abstract int name();
	Action(){
		this(10);
		System.out.println("no agr action");
	}
	Action(int s){
		System.out.println(s);
	}

}
