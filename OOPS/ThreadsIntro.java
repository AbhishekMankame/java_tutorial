/*
## Thread
A Thread in Java is the smallest unit of execution within a process. It allows a program to perform multiple tasks concurrently, improving performance and responsiveness.

### Why use Threads?
- Execute multiple tasks simultaneously
- Improve CPU utilization
- Handle background tasks (e.g., file downloads, database operations)
- Build responsive GUI application

### Ways to create Thread
Method 1: Extending the 'Thread' Class
In this approach, you create a class that inherits from the 'Thread' class and override its 'run()' method.

class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("Thread is Running...");
  }
}

public class Main {
  public static void main(String[] args) {
    MyThread t = new MyThread();
    t.start();
  }
}

Method 2: Implementing the 'Runnable' Interface
Instead of become a thread, your class only defines the work to be done.

class MyTask implements Runnable {
  @Override
  public void run() {
    System.out.println("Task is Running...");
  }
}

public ciass Main {
  public static void main(String[] args) {
    MyTask task = new MyTask();
    Thread t = new Thread(task);
  }
}

Method 3: Using Lambda Expression
Since 'Runnable' has only one abstract method (run()), it is a functional interface.
Therefore, instead of creating a seperate class, you can write:

pubilc class Main() {
  public static void main(String[] args) {
    Thread t = new Thread(() -> {
      System.out.println("Thread using Lambda");
    });
    t.start();
  }
}

*/
