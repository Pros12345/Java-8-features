package practice;

import java.util.Arrays;

public class StringArrayStream {

	public static void main(String[] args) {

		String s[] = { "JavA", "python", "htMl", "css", "RuBy", "dataBase", "SQL" };
		System.out.println("Sorted in Ascending: ");
		Arrays.stream(s).sorted(String.CASE_INSENSITIVE_ORDER).toList().forEach(System.out::println);
		System.out.println();
		System.out.println("Sorted in Descending: ");
		Arrays.stream(s).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).toList().forEach(System.out::println);
		System.out.println();
		System.out.println("Convert all to lowerCase: ");
		Arrays.stream(s).map(s1 -> s1.toLowerCase()).toList().forEach(System.out::println);
		System.out.println();
		System.out.println("Convert all to lowerCase 2nd method: ");
		Arrays.stream(s).map(String::toLowerCase).toList().forEach(System.out::println);
		System.out.println();
		System.out.println("Convert all first letter to Upper other lower: ");
		Arrays.stream(s).map(q -> q.substring(0, 1).toUpperCase() + q.substring(1).toLowerCase()).toList()
				.forEach(System.out::println);
	}

}
