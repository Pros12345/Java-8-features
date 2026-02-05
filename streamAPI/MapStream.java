package practice;

import java.util.Comparator;
import java.util.Map;

public class MapStream {

	public static void main(String[] args) {

		Map<String, Integer> mapLst = Map.of("Abrar", 30000, "chand", 80000, "Kalam", 70000, "Raheem", 25000, "Kiran",
				63000, "Esa", 45000);
		System.out.println("Comparing by Key Ascending Order:");
		mapLst.entrySet().stream().sorted(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER)).toList()
				.forEach(e -> System.out.println("Name: " + e.getKey() + ", Salary: " + e.getValue()));
		System.out.println();
		System.out.println("Comparing by Key Descending Order:");
		mapLst.entrySet().stream().sorted(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER.reversed())).toList()
				.forEach(e -> System.out.println("Name: " + e.getKey() + ", Salary: " + e.getValue()));
		System.out.println();
		System.out.println("Comparing by Value Ascending Order:");
		mapLst.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList()
				.forEach(e -> System.out.println("Name: " + e.getKey() + ", Salary: " + e.getValue()));
		System.out.println();
		System.out.println("Comparing by Value Descending Order:");
		mapLst.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList()
				.forEach(e -> System.out.println("Name: " + e.getKey() + ", Salary: " + e.getValue()));
		System.out.println();
		System.out.println("Get 2nd largest by Salary: " + mapLst.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList().get(1));
		System.out.println();
		System.out.println("Get Max Salary");
		mapLst.entrySet().stream().max(Map.Entry.comparingByValue())
				.ifPresent(e -> System.out.println("Name :" + e.getKey() + ", Salary: " + e.getValue()));
		System.out.println();
		System.out.println("Get Min Salary");
		mapLst.entrySet().stream().min(Map.Entry.comparingByValue())
				.ifPresent(e -> System.out.println("Name :" + e.getKey() + ", Salary: " + e.getValue()));
	}

}
