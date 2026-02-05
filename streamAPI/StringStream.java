package practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringStream {
	public static void main(String[] args) {
		String s = " My  name is  Prosenjit.  I am from West Bengal ";
		System.out.println("Count total letters without space: ");
		System.out.println(s.chars().filter(c -> c != ' ').count());
		System.out.println();
		System.out.println("Count total letters with space: ");
		System.out.println(s.chars().count());
		System.out.println();
		System.out.println("Remove the extra spaces: " + s.trim().replaceAll("\\s+", " "));
		System.out.println();
		System.out.println("Remove the spcl character: " + s.chars().filter(c -> Character.isLetter(c) || c == ' ')
				.mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()));
		System.out.println("Convert all to lower case: " + s.toLowerCase());
		System.out.println("Convert all to lower case: " + s.toLowerCase());
		s.trim().replaceAll("\\s+", " ");
		System.out.println("Convert all first letter to upper case: " + Arrays.stream(s.trim().split("\\s+"))
				.map(w -> w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase())
				.collect(Collectors.joining(" ")));
	}
}