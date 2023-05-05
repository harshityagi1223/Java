package drinks;

import java.io.IOException;
import java.sql.SQLException;

public class Test  {

	Test() {
		super();
		System.out.println("agr test");
	}
	int sum(int a,long b){
		System.out.println("a method invoked");
		return a;
		}  
	int sum(long a,int b){
		System.out.println("b method invoked");
		return b;
		}  
	public static void main(String... s) {
		int result = new Action() {
			@Override
			public int name() {
				return 10;
			}
		}.name();
		
	}

}
