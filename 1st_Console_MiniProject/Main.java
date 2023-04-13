import java.util.Scanner;


// Cake_shop_class (inheritance)
class Cakeshop extends Cake{

    public void shop(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Please Enter your Name :- ");
        setName(sc.next());
        System.out.println("---------------------------------------------");
        System.out.println("Please Enter your Phone Number :- ");
        number = sc.nextInt();
        System.out.println("---------------------------------------------");
        System.out.println("Please Enter your E-mail :- ");
        email = sc.next();
        System.out.println("---------------------------------------------");
        System.out.println("Hello.....!! "+ getName());
        System.out.println("Welcome to our CakeShop");

        cakeS();   //method called

    }


}
//Cake shop class end

//Abstraction class
interface User{

    abstract public void cakeS();

}

// Cake_class (encapsulation & inheritance & abstraction)
class Cake implements User{

    private String name;      // Private 
    int number;
    String email;

    public void cakeS(){
        System.out.println("---------------------------------------------");
        System.out.println("We Have 4 different varites Cakes");
        System.out.println("---------------------------------------------");
        System.out.println("Click 1 for CHOCOLATE Flavour Cake");
        System.out.println("Click 2 for VANILLA Flavour Cake");
        System.out.println("Click 3 for BUTTER-SCOTCH Flavour Cake");
        System.out.println("Click 4 for ICE-CREAM Cake");
        System.out.println("Click 5 for Fruit Cake");
        System.out.println("---------------------------------------------");

        selectCake(); // method called
    }

    public void selectCake(){
        // Taking Number from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Cakevarities refvar = new Cakevarities();

        //Switch DMS
        switch (n) {
            case 1: refvar.chocolateCake();
                break;
            case 2: refvar.vanellaCake();
                break;
            case 3: refvar.butterScotchCake();
                break;
            case 4: refvar.iceCreamCake();
                break;
            case 5: refvar.fruitCake();
                break;      
            default: System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
                     cakeS();
                break;
        }
    }

    //getter method
    public String getName(){
        return name;
    }

    //setter method
    public void setName(String name){
        this.name=name;
    }


}

// Cake_Varities_class
class Cakevarities extends Cake{
    // Chocolate method
    public void chocolateCake(){
        System.out.println("---------------------------------------------");
        System.out.println("This is Chocolate Cake Section");
        System.out.println("We have 2 varities of Chocolate Cake");
        System.out.println("---------------------------------------------");
        System.out.println("Click 1 for Chocolate Truffle Cake");
        System.out.println("Click 2 for Chocolate Oreo Cake");
        System.out.println("Click 3 for go back");
        System.out.println("---------------------------------------------");

        // Create obj for CakeDetail class
        Cakedeatils cakedeatail = new Cakedeatils();

        // Taking Number from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Cakevarities refchoco = new Cakevarities();
        switch (n) {
            case 1: cakedeatail.cakeD("Chocolate","Chocolate Truffle Cake","1-Kg",600);
                break;
            case 2: cakedeatail.cakeD("Chocolate","Chocolate Oreo Cake","1-Kg",680);
                break;
            case 3: cakeS();
                break;
            default:System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
                    chocolateCake();
                break;
        }        
    }

    // Vanella method
    public void vanellaCake(){
        System.out.println("---------------------------------------------");
        System.out.println("This is Vanilla Cake Section");
        System.out.println("We have 2 varities of Vanilla Cake");
        System.out.println("---------------------------------------------");
        System.out.println("Click 1 for Italian Vanilla Cake");
        System.out.println("Click 2 for Cookies Cream Cake");
        System.out.println("Click 3 for go back");
        System.out.println("---------------------------------------------");

        // Create obj for CakeDetail class
        Cakedeatils cakedeatail = new Cakedeatils();

        // Taking Number from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       //  Cakevarities refchoco = new Cakevarities();
        switch (n) {
            case 1: cakedeatail.cakeD("Vanilla","Italian Vanilla Cake","1-Kg",650);
                break;
            case 2: cakedeatail.cakeD("Vanilla","Cookies Cream Cake","1-Kg",680);
                break;
            case 3: cakeS();
                break;
            default:System.out.println("Invaild Number, Please Enter vaild Number from the list");
                    System.out.println("---------------------------------------------");
                    vanellaCake();
                break;
        } 
    }

    // Butterscotch method
    public void butterScotchCake(){
        System.out.println("---------------------------------------------");
        System.out.println("This is ButterScotch Cake Section");
        System.out.println("We have 2 varities of ButterScotch Cake");
        System.out.println("---------------------------------------------");
        System.out.println("Click 1 for Classic ButterScotch Cake");
        System.out.println("Click 2 for Golden Fantasy Cake");
        System.out.println("Click 3 for go back");
        System.out.println("---------------------------------------------");

        // Create obj for CakeDetail class
        Cakedeatils cakedeatail = new Cakedeatils();

        // Taking Number from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Cakevarities refchoco = new Cakevarities();
        switch (n) {
            case 1: cakedeatail.cakeD("Butter-Scotch","Classic ButterScotch Cake","1.5-Kg",1050);
                break;
            case 2: cakedeatail.cakeD("Butter-Scotch","Golden Fantasy Cake","1-Kg",700);
                break;
            case 3: cakeS();
                break;
            default:System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
                    butterScotchCake();
                break;
        } 
    }

    // Ice-Cream method
    public void iceCreamCake(){
        System.out.println("---------------------------------------------");
        System.out.println("This is Ice-Cream Cake Section");
        System.out.println("We have 2 varities of Ice-Cream Cake");
        System.out.println("---------------------------------------------");
        System.out.println("Click 1 for Ice-Cream Cake");
        System.out.println("Click 2 for Nutty Caramel Cake");
        System.out.println("Click 3 for go back");
        System.out.println("---------------------------------------------");

        // Create obj for CakeDetail class
        Cakedeatils cakedeatail = new Cakedeatils();

        // Taking Number from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Cakevarities refchoco = new Cakevarities();
        switch (n) {
            case 1: cakedeatail.cakeD("Ice-Cream","Ice-Cream Cake","1-Kg",650);
                break;
            case 2: cakedeatail.cakeD("Ice-Cream","Nutty Caramel Cake","0.5-Kg",450);
                break;
            case 3: cakeS();
                break;
            default:System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
                    iceCreamCake();
                break;
        }

    }

    // Fruit cake method
    public void fruitCake(){
        System.out.println("---------------------------------------------");
        System.out.println("This is Fruit Cake Section");
        System.out.println("We have 2 varities of Fruit Cake");
        System.out.println("---------------------------------------------");
        System.out.println("Click 1 for Strawberry Cake");
        System.out.println("Click 2 for Mix-Fruit Cake");
        System.out.println("Click 3 for go back");
        System.out.println("---------------------------------------------");

        // Create obj for CakeDetail class
        Cakedeatils cakedeatail = new Cakedeatils();

        // Taking Number from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 1: cakedeatail.cakeD("Fruit","Strawberry Cake","1-Kg",900);
                break;
            case 2: cakedeatail.cakeD("Fruit","Mix-Fruit Cake","1.5-Kg",1080);
                break;
            case 3: cakeS();
                break;
            default:System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
                    fruitCake();
                break;
        }        
    }
}


// Cake_detail class or final cake details
class Cakedeatils extends Cakevarities{
    static String ctype;
    static String cname;
    static String weight;
    static double price;

    public void cakeD(String ctype,String cname, String weight, double price){
        Cakedeatils.ctype=ctype;
        Cakedeatils.cname=cname;
        Cakedeatils.weight=weight;
        Cakedeatils.price=price;
       
        System.out.println("---------------------------------------------");
        System.out.println("Cake Variety :- "+ctype);
        System.out.println("Cake Name :- "+cname);
        System.out.println("Cake Weight :- "+weight);
        System.out.println("Cake Price :- Rs "+price);
        System.out.println("---------------------------------------------");

        //object creation for reference
        PayChoco refPC = new PayChoco();
        PayVanilla refPV = new PayVanilla();
        PayButter refPB = new PayButter();
        PayIce refPI = new PayIce();
        PayFruit refPF = new PayFruit();
        
        //ledder if else
        if (ctype=="Chocolate") {
            refPC.takeOrderC();
        } 
        else if (ctype=="Vanilla"){
            refPV.takeOrderV();
        }
        else if (ctype=="Butter-Scotch"){
            refPB.takeOrderB();
        }
        else if (ctype=="Ice-Cream"){
            refPI.takeOrderI();
        }
        else {
            refPF.takeOrderF();
        }
    }
}

//Payment for choclate cake class Start
class PayChoco extends Cakedeatils{
    
    //For Cash Payment
    public void cashPay() {
        System.out.println("---------------------------------------------");
        System.out.println("Your order has been placed..!");
        System.out.println("Cake Name :-  " + cname);
        System.out.println("Be ready with Rs "+ price +" Cash");
        System.out.println("---------------------------------------------");
    }

    //For UPI
    public void upiPay() {

        System.out.println("---------------------------------------------");
        System.out.println("Enter your UPI ID :-");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        String upi = sc.next();

        System.out.println("---------------------------------------------");
        System.out.println("Cake Name :-  " + cname);
        System.out.println("You have to pay Rs " + price);
        System.out.println("Please check ypur UPI ID :- " + upi);
        System.out.println("Press 1 if UPI ID is correct for payment.");
        System.out.println("Press 2 if UPI ID is incorrect..!");
        System.out.println("---------------------------------------------");

        //taking input from user
        int n = sc.nextInt();

        // ledder if else
        if (n==1) {
            System.out.println("---------------------------------------------");
            System.out.println("Confirming your payment please wait.........");
            System.out.println("Payment done successfully, Order has Been placed.");
            System.out.println("Thank you for Ordering from CakeShop......!");
            System.out.println("---------------------------------------------");
        } 
        else if(n==2){
            upiPay();
        }
        else {
            System.out.println("---------------------------------------------");
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            upiPay();
        }

    }
    //Confirm Order method
    public void confirmOrder() {
        
        System.out.println("---------------------------------------------");
        System.out.println("Click 1 for Cash on Delivery");
        System.out.println("Click 2 for UPI Payment");
        System.out.println("Click 3 for Chocolate Cake Section");
        System.out.println("CLick 4 for go to Main Menu");
        System.out.println("---------------------------------------------");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Ladder if esle
        if (n==1){
            cashPay();    //For Cash Payment
        }
        else if (n==2){
            upiPay();      //For UPI
        }
        else if(n==3){
            chocolateCake();    //For Chocolate cake section
        }
        else if(n==4){
            cakeS();      // For Main Menu
        }
        else{
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
            confirmOrder();
        }
    }
    
    //Taking Order method
    public void takeOrderC(){
        
        System.out.println("Click 1 for order cake");
        System.out.println("Click 2 for go back");
        System.out.println("CLick 3 for go to Main Menu");
        System.out.println("---------------------------------------------");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //object creating for cake class
        //Cake refcake = new Cake();   (because i inherite cake class)
        //Cakevarities refCV = new Cakevarities();    (because i inherited cakevarities class)

        // Ladder if esle
        if (n==1){
            confirmOrder();    //For Confirm Order method
        }
        else if (n==2){
            chocolateCake();  //For Choclate cake section
        }
        else if (n==3){
            cakeS();      //For Main Menu
        }
        else{
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
            takeOrderC();
        }

    }

}

//Payment for choclate cake class End

//Payment for vanilla cake class Start
class PayVanilla extends Cakedeatils{
    
    //For Cash Payment
    public void cashPay() {
        System.out.println("---------------------------------------------");
        System.out.println("Your order has been placed..!");
        System.out.println("Cake Name :-  " + cname);
        System.out.println("Be ready with Rs "+ price +" Cash");
        System.out.println("Thank you for Ordering from CakeShop......!");
    }

    //For UPI
    public void upiPay() {

        System.out.println("---------------------------------------------");
        System.out.println("Enter your UPI ID :-");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        String upi = sc.next();

        System.out.println("---------------------------------------------");
        System.out.println("Cake Name :-  " + cname);
        System.out.println("You have to pay Rs " + price);
        System.out.println("Please check ypur UPI ID :- " + upi);
        System.out.println("Press 1 if UPI ID is correct..!");
        System.out.println("Press 2 if UPI ID is incorrect..!");
        System.out.println("---------------------------------------------");

        //taking input from user
        int n = sc.nextInt();

        // ledder if else
        if (n==1) {
            System.out.println("---------------------------------------------");
            System.out.println("Confirming your payment please wait.........");
            System.out.println("Payment done successfully, Order has Been placed.");
            System.out.println("Thank you for Ordering from CakeShop......!");
            System.out.println("---------------------------------------------");
        } 
        else if(n==2){
            upiPay();
        }
        else {
            System.out.println("---------------------------------------------");
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            upiPay();
        }

    }
    //Confirm Order method
    public void confirmOrder() {
        
        System.out.println("---------------------------------------------");
        System.out.println("Click 1 for Cash on Delivery");
        System.out.println("Click 2 for UPI Payment");
        System.out.println("Click 3 for Vanilla Cake Section");
        System.out.println("CLick 4 for go to Main Menu");
        System.out.println("---------------------------------------------");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Ladder if esle
        if (n==1){
            cashPay();    //For Cash Payment
        }
        else if (n==2){
            upiPay();      //For UPI
        }
        else if(n==3){
            vanellaCake();;    //For vanilla cake section
        }
        else if(n==4){
            cakeS();      // For Main Menu
        }
        else{
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
            confirmOrder();
        }
    }
    
    //Taking Order method
    public void takeOrderV(){
        
        System.out.println("Click 1 for order cake");
        System.out.println("Click 2 for go back");
        System.out.println("CLick 3 for go to Main Menu");
        System.out.println("---------------------------------------------");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //object creating for cake class
        //Cake refcake = new Cake();   (because i inherite cake class)
        //Cakevarities refCV = new Cakevarities();    (because i inherited cakevarities class)

        // Ladder if esle
        if (n==1){
            confirmOrder();    //For Confirm Order method
        }
        else if (n==2){
            vanellaCake();;  //For vanilla cake section
        }
        else if (n==3){
            cakeS();      //For Main Menu
        }
        else{
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
            takeOrderV();
        }

    }

}

//Payment for vanilla cake class End

//Payment for ButterScotch cake class Start
class PayButter extends Cakedeatils{
    
    //For Cash Payment
    public void cashPay() {
        System.out.println("---------------------------------------------");
        System.out.println("Your order has been placed..!");
        System.out.println("Cake Name :-  " + cname);
        System.out.println("Be ready with Rs "+ price +" Cash");
        System.out.println("Thank you for Ordering from CakeShop......!");
    }

    //For UPI
    public void upiPay() {

        System.out.println("---------------------------------------------");
        System.out.println("Enter your UPI ID :-");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        String upi = sc.next();

        System.out.println("---------------------------------------------");
        System.out.println("Cake Name :-  " + cname);
        System.out.println("You have to pay Rs " + price);
        System.out.println("Please check ypur UPI ID :- " + upi);
        System.out.println("Press 1 if UPI ID is correct..!");
        System.out.println("Press 2 if UPI ID is incorrect..!");
        System.out.println("---------------------------------------------");

        //taking input from user
        int n = sc.nextInt();

        // ledder if else
        if (n==1) {
            System.out.println("---------------------------------------------");
            System.out.println("Confirming your payment please wait.........");
            System.out.println("Payment done successfully, Order has Been placed.");
            System.out.println("Thank you for Ordering from CakeShop......!");
            System.out.println("---------------------------------------------");
        } 
        else if(n==2){
            upiPay();
        }
        else {
            System.out.println("---------------------------------------------");
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            upiPay();
        }

    }
    //Confirm Order method
    public void confirmOrder() {
        
        System.out.println("---------------------------------------------");
        System.out.println("Click 1 for Cash on Delivery");
        System.out.println("Click 2 for UPI Payment");
        System.out.println("Click 3 for Butter-Scotch Cake Section");
        System.out.println("CLick 4 for go to Main Menu");
        System.out.println("---------------------------------------------");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Ladder if esle
        if (n==1){
            cashPay();    //For Cash Payment
        }
        else if (n==2){
            upiPay();      //For UPI
        }
        else if(n==3){
            butterScotchCake();    //For ButterScotch cake section
        }
        else if(n==4){
            cakeS();      // For Main Menu
        }
        else{
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
            confirmOrder();
        }
    }
    
    //Taking Order method
    public void takeOrderB(){
        
        System.out.println("Click 1 for order cake");
        System.out.println("Click 2 for go back");
        System.out.println("CLick 3 for go to Main Menu");
        System.out.println("---------------------------------------------");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //object creating for cake class
        //Cake refcake = new Cake();   (because i inherite cake class)
        //Cakevarities refCV = new Cakevarities();    (because i inherited cakevarities class)

        // Ladder if esle
        if (n==1){
            confirmOrder();    //For Confirm Order method
        }
        else if (n==2){
            butterScotchCake();  //For ButterScotch cake section
        }
        else if (n==3){
            cakeS();      //For Main Menu
        }
        else{
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
            takeOrderB();
        }

    }

}

//Payment for ButterScotch cake class End

//Payment for ice cream cake class Start
class PayIce extends Cakedeatils{
    
    //For Cash Payment
    public void cashPay() {
        System.out.println("---------------------------------------------");
        System.out.println("Your order has been placed..!");
        System.out.println("Cake Name :-  " + cname);
        System.out.println("Be ready with Rs "+ price +" Cash");
        System.out.println("Thank you for Ordering from CakeShop......!");
    }

    //For UPI
    public void upiPay() {

        System.out.println("---------------------------------------------");
        System.out.println("Enter your UPI ID :-");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        String upi = sc.next();

        System.out.println("---------------------------------------------");
        System.out.println("Cake Name :-  " + cname);
        System.out.println("You have to pay Rs " + price);
        System.out.println("Please check ypur UPI ID :- " + upi);
        System.out.println("Press 1 if UPI ID is correct..!");
        System.out.println("Press 2 if UPI ID is incorrect..!");
        System.out.println("---------------------------------------------");

        //taking input from user
        int n = sc.nextInt();

        // ledder if else
        if (n==1) {
            System.out.println("---------------------------------------------");
            System.out.println("Confirming your payment please wait.........");
            System.out.println("Payment done successfully, Order has Been placed.");
            System.out.println("Thank you for Ordering from CakeShop......!");
            System.out.println("---------------------------------------------");
        } 
        else if(n==2){
            upiPay();
        }
        else {
            System.out.println("---------------------------------------------");
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            upiPay();
        }

    }
    //Confirm Order method
    public void confirmOrder() {
        
        System.out.println("---------------------------------------------");
        System.out.println("Click 1 for Cash on Delivery");
        System.out.println("Click 2 for UPI Payment");
        System.out.println("Click 3 for Ice-Cream Cake Section");
        System.out.println("CLick 4 for go to Main Menu");
        System.out.println("---------------------------------------------");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Ladder if esle
        if (n==1){
            cashPay();    //For Cash Payment
        }
        else if (n==2){
            upiPay();      //For UPI
        }
        else if(n==3){
            iceCreamCake();    //For Ice Cream cake section
        }
        else if(n==4){
            cakeS();      // For Main Menu
        }
        else{
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
            confirmOrder();
        }
    }
    
    //Taking Order method
    public void takeOrderI(){
        
        System.out.println("Click 1 for order cake");
        System.out.println("Click 2 for go back");
        System.out.println("CLick 3 for go to Main Menu");
        System.out.println("---------------------------------------------");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //object creating for cake class
        //Cake refcake = new Cake();   (because i inherite cake class)
        //Cakevarities refCV = new Cakevarities();    (because i inherited cakevarities class)

        // Ladder if esle
        if (n==1){
            confirmOrder();    //For Confirm Order method
        }
        else if (n==2){
            iceCreamCake();  //For Ice cream cake section
        }
        else if (n==3){
            cakeS();      //For Main Menu
        }
        else{
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
            takeOrderI();
        }

    }

}

//Payment for ice cream cake class End

//Payment for fruit cake class Start
class PayFruit extends Cakedeatils{
    
    //For Cash Payment
    public void cashPay() {
        System.out.println("---------------------------------------------");
        System.out.println("Your order has been placed..!");
        System.out.println("Cake Name :-  " + cname);
        System.out.println("Be ready with Rs "+ price +" Cash");
        System.out.println("---------------------------------------------");
    }

    //For UPI
    public void upiPay() {

        System.out.println("---------------------------------------------");
        System.out.println("Enter your UPI ID :-");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        String upi = sc.next();

        System.out.println("---------------------------------------------");
        System.out.println("Cake Name :-  " + cname);
        System.out.println("You have to pay Rs " + price);
        System.out.println("Please check ypur UPI ID :- " + upi);
        System.out.println("Press 1 if UPI ID is correct for payment.");
        System.out.println("Press 2 if UPI ID is incorrect..!");
        System.out.println("---------------------------------------------");

        //taking input from user
        int n = sc.nextInt();

        // ledder if else
        if (n==1) {
            System.out.println("---------------------------------------------");
            System.out.println("Confirming your payment please wait.........");
            System.out.println("Payment done successfully, Order has Been placed.");
            System.out.println("Thank you for Ordering from CakeShop......!");
            System.out.println("---------------------------------------------");
        } 
        else if(n==2){
            upiPay();
        }
        else {
            System.out.println("---------------------------------------------");
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            upiPay();
        }

    }
    //Confirm Order method
    public void confirmOrder() {
        
        System.out.println("---------------------------------------------");
        System.out.println("Click 1 for Cash on Delivery");
        System.out.println("Click 2 for UPI Payment");
        System.out.println("Click 3 for Fruit Cake Section");
        System.out.println("CLick 4 for go to Main Menu");
        System.out.println("---------------------------------------------");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Ladder if esle
        if (n==1){
            cashPay();    //For Cash Payment
        }
        else if (n==2){
            upiPay();      //For UPI
        }
        else if(n==3){
            fruitCake();    //For Fruit cake section
        }
        else if(n==4){
            cakeS();      // For Main Menu
        }
        else{
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
            confirmOrder();
        }
    }
    
    //Taking Order method
    public void takeOrderF(){
        
        System.out.println("Click 1 for order cake");
        System.out.println("Click 2 for go back");
        System.out.println("CLick 3 for go to Main Menu");
        System.out.println("---------------------------------------------");

        //taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //object creating for cake class
        //Cake refcake = new Cake();   (because i inherite cake class)
        //Cakevarities refCV = new Cakevarities();    (because i inherited cakevarities class)

        // Ladder if esle
        if (n==1){
            confirmOrder();    //For Confirm Order method
        }
        else if (n==2){
            fruitCake();  //For fruit cake section
        }
        else if (n==3){
            cakeS();      //For Main Menu
        }
        else{
            System.out.println("Invaild Number, Please Enter vaild Number from the list");
            System.out.println("---------------------------------------------");
            takeOrderF();
        }

    }

}

//Payment for fruit cake class End

// Driver Class start
public class Main{

    // Main method
    public static void main(String[] args) {

        Cakeshop ref = new Cakeshop();
        ref.shop();

        
    }

}
// Driver class end