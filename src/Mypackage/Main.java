package Mypackage;

interface One{
	void greet();
}
interface Two extends One{
	void show();
}




class A{
	public void greet() {
		System.out.println("Greetings from A");
	}
}





public class Main {
	public static void main(String args[]) { 
		
		 One obj = new One() {
			public void greet() {
				System.out.println("Grettings from One");
			}
		 };
		 obj.greet(); 
		 Two obj1 = new Two() {
			@Override
			public void greet() {
				System.out.println("grettings from Two");
			}
			@Override
			public void show() {
				System.out.println("show from Two");
			}
		 };
		 obj1.greet();
		 obj1.show();
		 
		 
		 
		 
		 
		 A Aobj = new A() {
			 @Override
			 public void greet() {
				 System.out.println("Overrides Geetings from A");
			 }
		 };
		 Aobj.greet(); // output: overrides grettings from A
		 
		 
		 Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Running anonymous class");
			}
			 
		 };
		 
		 Thread t = new Thread(r);
		 t.start();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
