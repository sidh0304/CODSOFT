import java.util.Scanner;
interface AtmInterface {
    int operation(int bankBalance);
}
class withdrawMoneyOperation implements AtmInterface {

    @Override
    public int operation(int bankBalance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money to be withdrawn: ");
        int withdrawAmount = scanner.nextInt();
        scanner.nextLine();

        while (withdrawAmount >= bankBalance){
            bankBalance -= withdrawAmount;
            System.out.println("Please collect your money" + bankBalance);
        }
        if (withdrawAmount <= bankBalance) {
            System.out.println("Insufficient Balance");
        }
        return bankBalance  ;
    }
}

class depositMoneyOperation implements AtmInterface {


    public int operation(int bankBalance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money to be deposited: ");
        int depositAmount = scanner.nextInt();
        scanner.nextLine();

        if (depositAmount > 0) {
            bankBalance += depositAmount;
            System.out.println("Your money has sucessfully been deposited");
            System.out.println("Your bank balance is:" + bankBalance);
        }
        else {
            System.out.println("Invalid amount");
        }
        return bankBalance ;
    }
}

class checkBalanceOperation implements AtmInterface {
    public int operation(int bankBalance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your bank balance is:" + bankBalance);
        return bankBalance;
    }
}

public class AtmInterfaceBySid {
    public static void main(String[] args) {
        int bankBalance = 10000;
        int withdrawMoney = 0;
        int depositMoney = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hello and Welcome to ATM");
            System.out.println("Enter 1 for withdrawing money");
            System.out.println("Enter 2 for depositing money");
            System.out.println("Enter 3 for checking your balance");
            System.out.println("Enter 4 to Exit ATM");
            System.out.println("Select the operation you would like to perform");
            int preference = scanner.nextInt();
            scanner.nextLine();

            if (preference == 1) {
                System.out.println("Please enter the amount of money to be withdrawn: ");
                withdrawMoney = scanner.nextInt();

            }
            if (bankBalance >= withdrawMoney) {
                System.out.println("Please collect your money");
            } else {
                System.out.println("Sorry! Insufficient balance");
            }
            if (preference == 2) {
                System.out.println("PLease enter the amount you would like to deposit: ");
                depositMoney = scanner.nextInt();
                System.out.println("Your amount has successfully been deposited." + (bankBalance + depositMoney));
            } else if (preference == 3) {
                System.out.println("Bank Balance: " + bankBalance);
            } else if (preference == 4) {
                System.out.println("Thank You for using our ATM");
            }
        }
    }
}