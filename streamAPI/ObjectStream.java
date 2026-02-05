package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ObjectStream {

	public static void main(String[] args) {
		List<Employee> employeeDetailsLst = Arrays.asList(
				new Employee(1, "Prosenjit", 110000, new EmployeeAddress("Marathalli", "Bangalore", "Karnataka", 50037),
						"HR"),
				new Employee(2, "Alice", 65000, new EmployeeAddress("Andheri", "Mumbai", "Maharashtra", 400053), "IT"),
				new Employee(3, "Bob", 45000, new EmployeeAddress("BTM Layout", "Bangalore", "Karnataka", 560076),
						"HR"),
				new Employee(4, "David", 70000, new EmployeeAddress("Salt Lake", "Kolkata", "West Bengal", 700091),
						"IT"),
				new Employee(4, "Ram", 40000, new EmployeeAddress("Pune", "Pune", "Maharashtra", 700091), "IS"),
				new Employee(4, "Aniket", 50000, new EmployeeAddress("Madhubani", "Mysure", "Karnataka", 700091), "IS"),
				new Employee(4, "Saty", 55000, new EmployeeAddress("SectorV", "Gurgao", "Uttar Predesh", 700091), "IS"),
				new Employee(4, "Rohan", 10000, new EmployeeAddress("Salt Lake", "Kolkata", "West Bengal", 700091),
						"HR"));

		System.out.println("Comparing by salary and print the name: ");
		employeeDetailsLst.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList()
				.forEach(e -> System.out.println(e.employeeName));
		System.out.println();
		System.out.println("Comparing by salary and print the all details: ");
		employeeDetailsLst.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList()
				.forEach(System.out::println);

		System.out.println();
		System.out.println("Comparing by dept and then comparing by salary");
		employeeDetailsLst.stream()
				.sorted(Comparator.comparing(Employee::getDepartment).reversed().thenComparing(Employee::getSalary))
				.toList().forEach(System.out::println);

		System.out.println();
		System.out.println("Comparing by City");
		employeeDetailsLst.stream()
				.sorted(Comparator.comparing((Employee e) -> e.getEmployeeAddress().getCity())
						.thenComparing((Employee e) -> e.getEmployeeAddress().getState()))
				.toList().forEach(System.out::println);

		employeeDetailsLst.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList()
				.forEach(System.out::println);
		System.out.println();
		employeeDetailsLst.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()
						.thenComparing((Employee e) -> e.getEmployeeAddress().getCity()).reversed())
				.toList().forEach(System.out::println);

	}

}
