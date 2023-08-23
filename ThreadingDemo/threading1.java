package ThreadingDemo;
 
public class threading1 {
    public static void main(String[] args) {
        /*  Multitasking - types(Process based Multitasking and Thread based Multitasking)
            program is run on a thread.
            by default 1 thread is given to program and name of thread is- main / priority of thread is-5
            we can change the name and priority of default thread
        
            */
        System.out.println("Before Changes");
        System.out.println("Default thread name Thread");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(name+" thread priority is :"+Thread.currentThread().getPriority());
        System.out.println("**********************************");

        System.out.println("After Changes");
        System.out.println("Default thread name after change is ");
        
        Thread t = Thread.currentThread();
        t.setName("main111");
        t.setPriority(4);
        String name1 = Thread.currentThread().getName();
        System.out.println(name1);
        System.out.println(name1+" thread priority is :"+Thread.currentThread().getPriority());
        System.out.println("**********************************");


    }
}
