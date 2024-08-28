

import java.util.Scanner;

class Costumer{
    String name;
    long account;
    int costumer_id;
    static String branch="Goel Banking System";
    double totalBalance=0;
    Costumer(){
//        constructor
    }
    Costumer(String name , long account, int costumer_id){
        this.name=name;
        this.account=account;
        this.costumer_id=costumer_id;
    }

    public void costumer_details(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Banking Branch: "+branch);
        System.out.println("Account Holder Name: "+name);
        System.out.println("Account Number: "+account);
        System.out.println("Costumer ID: "+costumer_id);
        System.out.println("Account Balance : "+totalBalance);
        System.out.println("-------------------------------------------------------------------------");
    }
    public void deposit(double cash){
        System.out.println("Rs. "+cash+" credited to account "+account );
        totalBalance+=cash;
        System.out.println("Account Balance : "+totalBalance);
        System.out.println("-------------------------------------------------------------------------");
    }
    public void withdraw(double cash){

        if(totalBalance>=cash){
            totalBalance-=cash;
            System.out.println("Rs. "+cash+" debited to account "+account );
            System.out.println("Account Balance : "+totalBalance);
        }
        else System.out.println("InSufficient Balance!");

        System.out.println("-------------------------------------------------------------------------");
    }
    public void checkBalance(){
        System.out.println("Account Balance : "+totalBalance);
        System.out.println("-------------------------------------------------------------------------");
    }

}
public class bankingSystem {

    public static void tasks(String name){
        System.out.println("What Would You Like To do "+name);
        System.out.println("press 1 : to view customer details ");
        System.out.println("press 2 : to view total balance ");
        System.out.println("press 3 : to credit cash ");
        System.out.println("press 4 : to debit cash ");
        System.out.println("press 5 : to leave Account");
    }

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        Costumer one=new Costumer("Mr. Akhand", 54543432,1001);
        Costumer two=new Costumer("Mr. Vikas", 64543433,1002);
        Costumer three=new Costumer("Mr. Raj"  ,74543434,1003);
        Costumer four=new Costumer("Ms. Supra ",34583435,1004);
        Costumer five=new Costumer("Ms. Luisa ",24343536,1005);

        System.out.println("--------------Welcome To Goel Banking System------------");
        System.out.println("User Can Access Their Account By Costumer_id ");
        System.out.println("Mr. Akhand Costumer ID:-"+one.costumer_id);
        System.out.println("Mr. Vikas Costumer ID:-"+two.costumer_id);
        System.out.println("Mr. Raj Costumer ID:-"+three.costumer_id);
        System.out.println("Ms. Supra Costumer ID:-"+four.costumer_id);
        System.out.println("Ms. Luisa Costumer ID:-"+five.costumer_id);



    while(true){
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("\nEnter Customer_id:-");
        int id=sc.nextInt();
        if(id==one.costumer_id) {
            while(true)
            {
                tasks(one.name);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        one.costumer_details();
                        break;
                    case 2:
                        one.checkBalance();
                        break;
                    case 3:
                        System.out.println("Enter Cash To Deposit: ");
                        double cash = sc.nextDouble();
                        one.deposit(cash);
                        break;
                    case 4:
                        System.out.println("Enter Cash To Withdraw: ");
                        cash = sc.nextDouble();
                        one.withdraw(cash);
                        break;
                    case 5:
                        System.out.println("Thanks " + one.name + " For visiting.");
                        break;
                    default:
                        System.out.println("Invalid Task!");
                }
                System.out.println("Would you like to perform Any Other Task!");
                System.out.println("Enter yes/no ");
                String otherTasks=sc.next();
                if((otherTasks.equals("no"))){
                    System.out.println("Leaving Account "+one.costumer_id);
                    break;
                }
            }
        }
        else if(id==two.costumer_id){
            while(true)
            {
                tasks(two.name);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        two.costumer_details();
                        break;
                    case 2:
                        two.checkBalance();
                        break;
                    case 3:
                        System.out.println("Enter Cash To Deposit: ");
                        double cash = sc.nextDouble();
                        two.deposit(cash);
                        break;
                    case 4:
                        System.out.println("Enter Cash To Withdraw: ");
                        cash = sc.nextDouble();
                        two.withdraw(cash);
                        break;
                    case 5:
                        System.out.println("Thanks " + two.name + " For visiting.");
                        break;
                    default:
                        System.out.println("Invalid Task!");
                }
                System.out.println("Would you like to perform Any Other Task!");
                System.out.println("Enter yes/no ");
                String otherTasks=sc.next();
                if((otherTasks.equals("no"))){
                    System.out.println("Leaving Account "+two.costumer_id);
                    break;
                }
            }
        }
        else if(id==three.costumer_id){
            while(true)
            {
                tasks(three.name);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        three.costumer_details();
                        break;
                    case 2:
                        three.checkBalance();
                        break;
                    case 3:
                        System.out.println("Enter Cash To Deposit: ");
                        double cash = sc.nextDouble();
                        three.deposit(cash);
                        break;
                    case 4:
                        System.out.println("Enter Cash To Withdraw: ");
                        cash = sc.nextDouble();
                        three.withdraw(cash);
                        break;
                    case 5:
                        System.out.println("Thanks " + three.name + " For visiting.");
                        break;
                    default:
                        System.out.println("Invalid Task!");
                }
                System.out.println("Would you like to perform Any Other Task!");
                System.out.println("Enter yes/no ");
                String otherTasks=sc.next();
                if((otherTasks.equals("no"))){
                    System.out.println("Leaving Account "+three.costumer_id);
                    break;
                }
            }

        }
        else if(id==four.costumer_id){
            while(true)
            {
                tasks(four.name);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        four.costumer_details();
                        break;
                    case 2:
                        four.checkBalance();
                        break;
                    case 3:
                        System.out.println("Enter Cash To Deposit: ");
                        double cash = sc.nextDouble();
                        four.deposit(cash);
                        break;
                    case 4:
                        System.out.println("Enter Cash To Withdraw: ");
                        cash = sc.nextDouble();
                        four.withdraw(cash);
                        break;
                    case 5:
                        System.out.println("Thanks " + four.name + " For visiting.");
                        break;
                    default:
                        System.out.println("Invalid Task!");
                }
                System.out.println("Would you like to perform Any Other Task!");
                System.out.println("Enter yes/no ");
                String otherTasks=sc.next();
                if((otherTasks.equals("no"))){
                    System.out.println("Leaving Account "+four.costumer_id);
                    break;
                }
            }
        }
        else if(id==five.costumer_id){

            while(true)
            {
              tasks(five.name);
               int choice = sc.nextInt();

               switch (choice)
                {
                    case 1:
                        five.costumer_details();
                        break;
                    case 2:
                        five.checkBalance();
                        break;
                    case 3:
                        System.out.println("Enter Cash To Deposit: ");
                        double cash = sc.nextDouble();
                        five.deposit(cash);
                        break;
                    case 4:
                        System.out.println("Enter Cash To Withdraw: ");
                        cash = sc.nextDouble();
                        five.withdraw(cash);
                        break;
                    case 5:
                        System.out.println("Thanks " + five.name + " For visiting.");
                        break;
                    default:
                        System.out.println("Invalid Task!"); break;
                }
                System.out.println("Would you like to perform Any Other Task!");
                System.out.println("Enter yes/no ");
                String otherTasks=sc.next();
                if((otherTasks.equals("no"))){
                    System.out.println("Leaving Account "+five.costumer_id);
                    break;
                }
            }
        }
        else{
            System.out.println("Please Enter the Correct Costumer_id!");
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Do you want to Close Bank!");
        System.out.println("Enter yes/no ");
        String moreTasks=sc.next();
        if(moreTasks.equals("yes")){
            System.out.println("Exit bank! ");
            break;
        }

    }

    }
}