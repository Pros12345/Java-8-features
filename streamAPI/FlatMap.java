package practice;

import java.util.Arrays;
import java.util.List;

public class FlatMap {

	public static void main(String[] args) {
		List<List<String>> flatmap = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c"));
		flatmap.stream().flatMap(list -> list.stream()).toList().forEach(System.out::println);
	}

}
