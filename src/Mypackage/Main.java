package Mypackage;

interface A{
	void show(int i, double j);
}

public class Main {
	public static void main(String args[]) {
		
		A obj = (i,j)->
		{
			double c = i+j;
			System.out.println("hello world, "+c);
		};
		obj.show(10,20);
			
		
	}

}
