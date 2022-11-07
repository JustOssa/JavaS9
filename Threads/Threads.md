# Threads

### Create and run a thread by extending the **Thread** class

```java
class ThreadExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        threadExample.start();
    }
}
```

### Create and run a thread by implementing the **Runnable** interface

```java
class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        RunnableExample runnableExample = new RunnableExample();
        Thread thread = new Thread(runnableExample);
        thread.start();
    }
}
```


### Create and run a thread using the **Anonymous Runnable interface**

```java
class AnonymousRunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running...");
            }
        });
        thread.start();
    }
}
```