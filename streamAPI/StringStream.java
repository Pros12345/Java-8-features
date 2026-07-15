package Practice1;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringJava {

	public static void main(String[] args) throws FileNotFoundException {

		String s = "Hi This  is prosenjit. I #am working in@  Bangalore";
		String result = s.replaceAll("[^a-zA-Z0-9.\\s]", "").trim().replaceAll("\\s+", " ");
		System.out.println(result);
		System.out.println(
				Arrays.stream(result.split(" ")).collect(Collectors.groupingBy(s1 -> s1, Collectors.counting()))
						.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue())));
		System.out.println(Arrays.stream(result.split(" "))
				.map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase())
				.collect(Collectors.joining(" ")));

	}

}
