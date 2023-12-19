import java.util.*;

public class Stack {
	private static int s[];
	private static int size;
	private static int top = -1;
	static Scanner scan = new Scanner(System.in);

	public Stack(int n)
	{
		s=new int[n];
		size=s.length;
	}

	public static void push(int n) {
		if (top == (size - 1)) {
			System.out.println("Stack is full");
		} else {
			System.out.println("Enter an element");
			int ele = scan.nextInt();
			++top;
			s[top] = ele;
		}
	}

	public static void pop() {
		if (top == -1)
			System.out.println("Pop is empty");
		else {
			System.out.println("Element deleted is " + s[top]);
			--top;
		}
	}

	public static void display() {
		if (top == -1)
			System.out.println("Not possible to display");
		else {
			for (int i = top; i >= 0; i--) {
				System.out.print(s[i] + " ");
			}
		}
	}
}
