package Java_funadamentals;

public class Operators {
    public static void main(String[] args) {
        /* There are 6 types of Operators in java
         * 1. Arithmetic Operator
         * 2. Relational Operator
         * 3. Logical Operator
         * 4. Assignment Operator
         * 5. Bitwise Operator
         * 6. Unary Operator
        */

    // 1. Arithmetic Operators(+,-,*,/,++,--(pre/post-incrementf/decrement))
        // int a = 10 + 10;
        // int c = 5;
        // int d = c++; //post increment (at first value will be assign then value of c will increse)
        // System.out.println(d);
        // System.out.println(c);

        // int d = ++c; //pre increment (at first value will be increase by one then value of c will assign) 
        // System.out.println(d);
        // System.out.println(c);

    // 2. Assignment Operators(= (from right to left i.e right value is always pass to left variable))
        // int d = 10;
        // int m1, m2, m3, m4;
        // m1=m2=m3=m4 = 5; 
        // System.out.println(m1 +" "+m2+" "+m3+" "+m4);
        // Below are Compound Assignment Operators
        // d += 5;
        // d *= 5;
        // d /= 5;
        // d %= 5;
    
    // 3. Relational Operators(<,>,<=,>=,==,!=) returns boolean values
        // int a = 10;
        // int b = 20;
        // System.out.println(a<b);
        // System.out.println(a>b);
        // System.out.println(a<=b);
        // System.out.println(a>=b);
        // System.out.println(a==b);
        // System.out.println(a!=b);

    // 4. Logical Operators(logical and(return true if all expressions are true), logical or, NOT)
        // int a = 10;
        // int b = 20;
        // int c = 30;
        // if(a<b && b>a && c>=b){
        //     System.out.println("All expressions are true");
        // }
        // else System.out.println("Some conditions are false");
        
        
        // if(a<b || b==c || c==b){
        //     System.out.println("All expressions are true");
        // }
        // else System.out.println("Some conditions are false");
        


    // Conditional Statement (if else -- nested if else(if else in if else))
    // if(Conditon){
    //     //if body -- Excecute if condition is true
    // }
    // else if(Condition){
    //     //else if body
    // }
    // else {
    //     //else body -- Excecute if condition is false
    // }

    // Ternary Operator -- Conditino ? True : False;
        // int age = 18;
        
        // String res = (age==18) ? "He is an Adult Now": "False";
        // System.out.println(res);

        // Nested Ternary Operator -- Syn- condition ? (Condition ? T : F;) : false;

        // boolean res = (age == 18) ? (age>17?true:false) : false;
        // System.out.println(res);
    }
}
