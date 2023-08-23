package Java_funadamentals;

public class swithCaseDemo {
    public static void main(String[] args) {
        int num = 100;
        switch(num){
            case 100:System.out.println("Case1");
            break; // it breaks out of the switch block
            case 200:System.out.println("case2");
            break;
            case 300:System.out.println("case3");
            break;
            //The default keyword specifies some code to run if there is no case match
            default:System.out.println("Default"); //
            break;
            
        }
    }
}
