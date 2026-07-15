package Practice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FileScan {

	public static void main(String[] args) throws FileNotFoundException {

//		scan the file and strore the words in a string.

		File file = new File("C:\\Users\\Prosenjit.Chakra\\Downloads\\NewText.txt");
		Scanner sc = new Scanner(file);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextLine()) {

			sb.append(sc.nextLine()).append("\n");
		}
		sc.close();
		System.out.println(sb);

//		Find the word occurences.

		String s = sb.toString().replaceAll("[^a-zA-Z0-9\\s]", "").trim().replaceAll("\\s+", " ");
		System.out.println("get count of all the words: ");
		System.out.println(Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue())));

//		Find the max repeated word.
		System.out.println("Find the word with max occurances: ");
		System.out.println(Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null));

//		Take out the mobile numbers from a file String.

		List<String> mobiles = new ArrayList<>();
		Pattern pattern = Pattern.compile("\\b\\d{10}\\b");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			mobiles.add(matcher.group());
		}
		System.out.println(mobiles);

	}

}
