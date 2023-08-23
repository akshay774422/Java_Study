package ThreadingDemo;

// we can create thread using 2 methods(extending thread class and implementing runnable interface)
class imp_threading extends Thread{
    //Access Modifiers visibility: 1.public, 2.protected, 3.default, 4.private 
    //run method is originated from runnable interface, thread implements runnable interface. 
    public void run(){
        System.out.println("This is new thread :"+ Thread.currentThread().getName());
    }
}


class threading2{
    public static void main(String[] args) {
        System.out.println("Defualt thread is running: "+ Thread.currentThread().getName());
        imp_threading t = new imp_threading();
        t.start(); //start is used to call threadSchedular which assign new task(which is written in run9() ) to new thread 
        
    }
}