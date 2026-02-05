package practice;

import java.util.Arrays;
import java.util.List;

public class FlatMap {

	public static void main(String[] args) {
		List<List<String>> listOfList = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"),
				Arrays.asList("e", "f"));
//		List<String> flatList = 
		listOfList.stream().flatMap(list -> list.stream()).forEach(System.out::println);
		// System.out.println(flatList);
	}
}
