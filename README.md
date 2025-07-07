After learning anonymous class, we know the easier way to implemet a functional interface(an interface wiht ony one abstract method) is using lamda.

🔹 What is a Lambda Expression?
A lambda expression is a short and concise way to implement functional interfaces (interfaces with only one abstract method, using @FunctionalInterface is recomended), introduced in Java 8.
It allows you to treat functionality as a method argument or code as data, which is a feature of functional programming. 

Syntax: 
(parameters) -> { body }
You can omit parentheses if there's only one parameter and curly braces if the body has a single statement. // u can see in the code .



Eg: using lamda in a functional interface (say Runnable because it has only one method to implement ie run())
1. wihtout using lamda

   Runnable r = new Runnable() {
    public void run() {
        System.out.println("Running...");
    }
  };
  new Thread(r).start();



1. using lamda
   Runnable r = () -> System.out.println("Running...");
   new Thread(r).start();


🕐 When to Use Lambda Expressions
Use lambdas when:

✅ You want short, inline implementations of functional interfaces
✅ You're working with collections (especially Streams API)
✅ You want cleaner and more readable code
✅ You're replacing anonymous classes with only one method


⚠️ When NOT to use Lambdas
🚫 When the logic is complex and requires multiple methods or state
🚫 When the interface has more than one abstract method
🚫 When clarity and debugging are more important than conciseness

