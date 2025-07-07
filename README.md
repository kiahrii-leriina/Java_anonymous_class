📌 What is an Anonymous Class?
An anonymous class is a local inner class without a name. It's used when you need to create a one-time-use subclass or implementation of an interface or abstract class.
Anonymous classes are typically used to override methods directly at the point of instantiation.

✅ Primary Usage
-To provide method implementation of an interface or abstract class without creating a separate named class.
-To handle short-lived, single-use logic—commonly used in:
-Event handling (e.g., button click listeners)
-Threading (Runnable)
-Sorting with custom Comparator

🛠️ How to Create an Anonymous Class
You create an anonymous class using the new keyword followed by an interface or abstract class name, and then override the necessary methods inside a code block { ... }.
Syntax: 
Type ref = new Type() {
    // overridden methods
};

Eg: 
Runnable task = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running in anonymous class.");
    }
};

new Thread(task).start();

Eg 2 : 

you can also use it for concrete classes.

class A{
	public void greet() {
		System.out.println("Greetings from A");
	}
}

A Aobj = new A() {
			 @Override
			 public void greet() {
				 System.out.println("Overrides Geetings from A");
			 }
		 };
		 Aobj.greet(); // output: overrides grettings from A


⚠️ Key Points
-You can define helper methods inside an anonymous class, but they can't be accessed outside unless declared in the type.
-You cannot declare constructors in anonymous classes. (or u can try to create a constructor without a name 😂)
-They are ideal for use cases where class definitions are short-lived or single-use.



in the code we used two interfaces "One" and "Two" just to show how to create helper methods inside the anonymous class.





		 

