package practice;

@FunctionalInterface
interface DemoInterface {
	void show();
}

public class Lamda {

	public static void main(String[] args) {

		DemoInterface DemoInterface = () -> System.out.println("Lambda expression");
		DemoInterface.show();
	}

}
