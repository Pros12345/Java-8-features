package practice;

import java.util.ArrayList;

public class LambdaExpression {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(29);
		number.add(4);
		number.add(7);
		number.add(90);
		number.add(98);

//		for(int num:number) {
//			System.out.println(num);
//		}

		number.forEach((n) -> {
			System.out.println(n);
		});
		number.forEach(System.out::println);// method referance
	}
}
