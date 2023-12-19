import java.util.Scanner;

public class StackApp {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("Enter array length : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Stack sd = new Stack(n);
		while (true) {
			System.out.println("Choose one : ");
			System.out.println("1-->Push");
			System.out.println("2-->Pop");
			System.out.println("3-->Display");
			System.out.println("Any-->Exit");

			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				sd.push(n);
				break;
			case 2:
				sd.pop();
				break;
			case 3:
				sd.display();
				break;
			default:
				System.exit(0);
			}
		}

	}

}
