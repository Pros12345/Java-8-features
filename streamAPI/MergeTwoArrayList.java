package Practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrayList {

	public static void main(String[] args) {

		List<Integer> lst1 = Arrays.asList(1, 3, 5, 7, 9, 11, 13);
		List<Integer> lst2 = Arrays.asList(2, 4, 6, 8, 10, 12);

		Stream.concat(lst1.stream(), lst2.stream()).toList().forEach(System.out::println);

		// merge
		List<Integer> mergedList = IntStream.range(0, Math.min(lst1.size(), lst2.size()))
				.flatMap(i -> IntStream.of(lst1.get(i), lst2.get(i))).boxed().collect(Collectors.toList());
		if (lst1.size() > lst2.size()) {
			mergedList.addAll(lst1.subList(lst2.size(), lst1.size()));
		} else if (lst1.size() < lst2.size()) {
			mergedList.addAll(lst2.subList(lst1.size(), lst2.size()));
		}
		System.out.println(mergedList);
	}

}
