package drinks;

import food.Fruit;
		
public class Apple extends Fruit{

	@Override
	public void fruitName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Apple ap = new Apple();
		ap.fruitName("Banana");
	}
}
