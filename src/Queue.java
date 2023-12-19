import java.util.*;
public class Queue {
	
	private int arr[];
	private int size;
	private int rear=-1;
	private int front=0;
	private Scanner scan=new Scanner(System.in);
	
	public Queue(int n)
	{
		arr=new int[n];
		size=arr.length;
	}
	
	public void insert()
	{
		if(rear>=size-1)
			System.out.println("Insertion not possible!");
		else
		{
			System.out.println("Enter an element :");
			rear++;
			arr[rear]=scan.nextInt();
		}
	}
	
	//Deletion operation
	public void delete()
	{
		if(front>rear)
			System.out.println("Deletion is not possible");
		else
		{
			System.out.println("Deleted element is : "+arr[front]);
			front++;
		}
	}
	
	//Display operation
	public void display()
	{
		if(rear==(size-1)||front>rear)
			System.out.println("Nothing to display!");
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	
}
