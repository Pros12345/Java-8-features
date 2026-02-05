package practice;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(1, 2, 4, 1, 1, 3);

		// The normal way
//		Consumer<Integer> con = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer n) {
//				System.out.println(n);
//			}
//
//		};

		// using lambda expression in one line

//		number.forEach(n -> System.out.println(n)); //using lambda expression
		number.forEach(System.out::println); // using method referance
	}

}
