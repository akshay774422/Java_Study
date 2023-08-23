// creating thread using Thread class
package ThreadingDemo;

import java.util.Scanner;

class calce extends Thread{
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("first task - addition of two numbers :");
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter Second number: ");
        int y = sc.nextInt();

        int res = x + y;
        System.out.println("Addition is: "+res);
        System.out.println("End of task 1.");
    }
}

class msg extends Thread{
    public void run(){
        System.out.println("Second task - printing imp message");
        try{
        for (int i = 0; i < 3; i++) {
            System.out.println("Focus on Your skills");
            Thread.sleep(2000);
        }
        System.out.println("End of task 2.");
    }
        catch(Exception e){
            System.out.println("some problem");
        }

    }
}

public class threading3 {
    public static void main(String[] args) {
        
        /* 1.There are 2 task to perform first is addition and second is printin msg .
        if the inpute for 1st task is not given then it will stop other task to execute, 
        so to run thise 2 task independently(on seperate thread) we write thise tasks into run() in 
        seperate classes(not in main method) which extends thread, Now seperate threads are assing to tasks
        2. NOw to run the task seperatly create objects of the class and call the start method.
        */
        // System.out.println("first task - addition of two numbers :");
        // System.out.println("Enter first number: ");
        // int x = sc.nextInt();
        // System.out.println("Enter Second number: ");
        // int y = sc.nextInt();

        // int res = x + y;
        // System.out.println("Addition is: "+res);
        // System.out.println("End of task 1.");
        // System.out.println("************************************************");
        // System.out.println("Second task - printing imp message");
        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Focus on Your skills");
        // }
        // System.out.println("End of task 2.");

        calce t1 = new calce();
        msg t2 = new msg();

        t1.start();
        t2.start();
        
         
    }
    
}
