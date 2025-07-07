package Mypackage;

@FunctionalInterface
interface A{
	void show(int i, double j);
}

@FunctionalInterface
interface B{
	void show(int i);
}
public class Main {
	public static void main(String args[]) {
		
		
		A ob = new A() {							// using anonymous class
			public void show(int i,double j) {
				System.out.println(" sum = "+ (i+j));
			}
		};
		ob.show(10, 20);
		
		
		A obj = (i,j)->								//using lamda
		{
			double c = i+j;
			System.out.println("Sum =  "+c);
		};
		obj.show(10,20);
		
		
		B obj1 = i -> System.out.println("hello");
		obj1.show(10);
		
		
		Runnable task = ()->System.out.println("task running");
		new Thread(task).start();
	}

}
