package Practice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileScan {

	public static void main(String[] args) throws FileNotFoundException {

//		scan the file and strore the words in a string

		File file = new File(
				"C:\\Users\\Prosenjit.Chakra\\Downloads\\MessageLog-BP_create_and_change-attachment_1-res_payload (4).txt");
		Scanner sc = new Scanner(file);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextLine()) {

			sb.append(sc.nextLine()).append("\n");
		}
		sc.close();

		String s = sb.toString().replaceAll("[^a-zA-Z0-9\\s]", "").trim().replaceAll("\\s+", " ");

		System.out.println(sb);

		System.out.println("get count of all the words: ");
		System.out.println(Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue())));

		System.out.println("Find the word with max occurances: ");
		System.out.println(Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null));
	}

}
