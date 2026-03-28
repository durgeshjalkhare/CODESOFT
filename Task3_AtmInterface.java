
import java.util.*;
public class Task3_AtmInterface {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int balance=0;
        char reply;
        do {
            System.out.println("-------------------Welcome to ATM-----------------------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. exit");
            int n= sc.nextInt();
            switch (n){
                case 1:
                    System.out.println(balance);
                    break;

                case 2:
                    System.out.println("Enter deposit money");
                    int DepositMoney= sc.nextInt();
                    balance+=DepositMoney;
                    System.out.println("Deposit Successful");
                    break;
                case 3:
                    System.out.println("Enter the amount you withdrew: ");
                    int withdrewAmount= sc.nextInt();
                    if(balance>=withdrewAmount){
                        balance-=withdrewAmount;
                        System.out.println("Withdrawal successful");
                    }else {
                        System.out.println("insufficient Balance");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("invalid input");
            }
            System.out.println("if you use again please type y : ");
            reply=sc.next().charAt(0);
        }while (reply=='Y'|| reply=='y');
    }
}
