import java.util.Scanner;

public class ATM {
    float Balance;
    int pin=123;

    public void checkPin(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if (enterPin==pin){
            menu();
        } else {
            System.out.println("Enter a valid pin");
        }
    }

    public void menu(){
        System.out.println("Enter your choose number");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdrawal Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int otp = sc.nextInt();
        if(otp==1){
            checkBalance();
        } else if (otp==2) {
            withdrawalMoney();
        } else if (otp==3) {
            depositMoney();
        } else if (otp==4) {
            return;
        } else {
            System.out.println("Please a valid Choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance is 0");
    }
    public void withdrawalMoney(){
        System.out.println("You can withdrawal with Rs,5000");
    }
    public void depositMoney(){
        System.out.println("rs,10000 have Deposit Money into your Accpunt");
    }
}
