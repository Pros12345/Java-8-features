package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStream {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1, 2, 3, 2, 2, 4, 5, 3, 3, 5, 4, 3, 6, 5, 5, 4, 44, 44, 33, 77, 6, 54, 3 - 123, 0,
				-32, 57, 7549, 3392, 444822 };
		System.out.println("Even: " + Arrays.stream(arr).filter(i -> i % 2 == 0).boxed().toList());
		System.out.println("Odd: " + Arrays.stream(arr).filter(i -> i % 2 != 0).boxed().toList());
		System.out.println("Find Max: " + Arrays.stream(arr).boxed().max(Integer::compareTo).get());
		System.out.println("Find Min: " + Arrays.stream(arr).boxed().min(Integer::compareTo).get());
		System.out.println("Asending: " + Arrays.stream(arr).boxed().sorted().toList());
		System.out.println("Desending: " + Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toList());
		System.out.println("Count Number: " + Arrays.stream(arr).count());
		System.out.println("Count Each Number: "
				+ Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting())));
		System.out.println(
				"Get 2nd Largest: " + Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toList().get(1));
		System.out.println("Find Duplicate: " + Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue())));

		List<Integer> lst = Arrays.asList(1, 2, 3, 2, 1, 2, 3, 2, 2, 4, 5, 3, 3, 5, 4, 3, 6, 5, 5, 4, 44, 44, 33, 77, 6,
				54, 3 - 123, 0, -32, 57, 7549, 3392, 444822);
		System.out.println("Even: " + lst.stream().filter(i -> i % 2 == 0).distinct().toList());
		System.out.println("Odd: " + lst.stream().filter(i -> i % 2 != 0).distinct().toList());
		System.out.println("Find Max: " + lst.stream().max(Integer::compareTo).get());
		System.out.println("Find Min: " + lst.stream().min(Integer::compareTo).get());
		System.out.println("Asending: " + lst.stream().sorted().distinct().toList());
		System.out.println("Asending: " + lst.stream().sorted(Comparator.reverseOrder()).distinct().toList());
		System.out.println(
				"Count Each Number: " + lst.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())));
		System.out.println("Get 2nd Largest: " + lst.stream().sorted(Comparator.reverseOrder()).toList().get(1));

	}

}
