import java.util.Scanner;

public class QueueApp {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter queue size : ");
		int size=scan.nextInt();
		Queue q=new Queue(size);
		while(true)
		{
			System.out.println("1--->Insert");
			System.out.println("2--->Delete");
			System.out.println("3--->Display");
			System.out.println("4--->Stop!");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:q.insert();
			break;
			case 2:q.delete();
			break;
			case 3:q.display();
			break;
			default:System.exit(0);
			}
			
		}
	}

}
