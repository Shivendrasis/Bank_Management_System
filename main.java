import java.util.Scanner;

class BankAccount {

    private int accountnumber;
    private double balance;

    BankAccount(int accountnumber, double balance) {

        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    void setdata(int accountnumber, double balance) {

        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public void depositefund(double depositeAmount) {

        balance += depositeAmount;
        System.out.println("Your amount is deposited $ " + depositeAmount);
    }

    public void withdrawalfunds(double withdrawalAmount) {

        if (balance >= withdrawalAmount) {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal amount successful $ " + withdrawalAmount);
        } else {
            System.out.println(" You have Insufficient balance ");
        }
    }

    public void displayBalance() {

        System.out.println("Your current balance $ " + balance);
    }
}

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account number :");
        int accountnumber = sc.nextInt();

        System.out.println("Enter your initial balance :");
        double initialsbalance = sc.nextDouble();

        BankAccount myAccount = new BankAccount(accountnumber, initialsbalance);

        while (true) {

            System.out.println("1. Deposite mony ");
            System.out.println("2. Withdrawal mony ");
            System.out.println("3. Check balance ");
            System.out.println("4. Exit");
            System.out.println("Enter your choise: ");

            int choise = sc.nextInt();
            double withdrawalAmount;

            int flag = 0;

            switch (choise) {

                case 1:
                    System.out.println("Enter your amount $ ");
                    double depositeAmount = sc.nextDouble();
                    myAccount.depositefund(depositeAmount);
                    break;

                case 2:
                    System.out.println("Enter your amount to withdrawal $ ");
                    withdrawalAmount = sc.nextDouble();
                    myAccount.withdrawalfunds(withdrawalAmount);

                case 3:
                    myAccount.displayBalance();

                case 4:
                    System.out.println("Thanks For Using");
                    flag = 1;
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

            if (flag == 1) {
                break;
            }
        }

    }
}
