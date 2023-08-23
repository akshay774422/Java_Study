class Product{
    
    //Attributes
    private int pid;
    String pname;
    int price;

    //Constructor
    Product(){
        System.out.println("Product object consturcted");
    }

    // to write data in product object
    void setProductDetails(int pid, String pname, int price){
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    // To read data from Product Object
    void showProductDetails(){
        System.out.println("--------Product ID:"+pid+"-----------");
        System.out.println("Name:\t"+pname+"-----------");
        System.out.println("Price:\t"+price);
        System.out.println("-----------------------------------");
    }

    // setter
    void setpid(int pid){
        this.pid = pid;
    }

    // getter
    int getpid(){
        return pid;
    }
}

class Mobile extends Product{ // IS-A Relationship, Mobile is a product(chile-parent)

    Mobile(){
        System.out.println("Mobile constructed");

    }
}

class InheritanceDemo{
    public static void main(String[] args) {

        // //create an Object : Product
        // Product pro = new Product(); //product is not object but it is reference varialbe which holdes hash code of object in hexadecimal notation
        // // writing data in object
        // pro.setProductDetails(100, "realme 6i", 20000);       
        // // reading data in object
        // pro.showProductDetails();

        // System.out.println("\n");
        // // writing data directly
        // Product pro1 = new Product();
        // // pro1.pid = 101; //giving erro as direct access of private attribute
        // //using indirect way to access private int 
        // pro1.setpid(101);
        // pro1.pname = "iphone";
        // pro1.price = 10000;

        // pro1.showProductDetails();

        // Product object will be first constructed then mobile object is constructed
        Mobile mob = new Mobile();
        mob.setProductDetails(200, "vivo", 30000);
        mob.showProductDetails();
       
    }
}