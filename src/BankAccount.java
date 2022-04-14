public class BankAccount {
    // declare variables

    String accountOwner;
    int accountNumber;
    double accountBalance;

    //creator BankAccount

    public BankAccount(String owner, int number, double balance){
        accountOwner = owner;
        accountNumber = number;
        accountBalance = balance;
    }

    // Creating deposit & withdraw methods

    public void deposit (double depositeAmount) {
        double deposite = depositeAmount;
        accountBalance += depositeAmount;
        System.out.println("Hello " + accountOwner +", you have deposit " + deposite + "$ on your account numero " + accountNumber +". You're new balance is " + accountBalance + "$");
    }

    public void withdraw (double withdrawAmount) {
        double withdraw = withdrawAmount;

        if (withdrawAmount > accountBalance) {
            System.out.println("You don't have enough founds too withdraw this amount.");

        } else {
            accountBalance -= withdrawAmount;
            System.out.println("Hello " + accountOwner +", you have withdraw " + withdraw + "$ on your account numero " + accountNumber +". You're new balance is " + accountBalance + "$") ;
        }

    }

    public void warningBalance () {
        if (accountBalance <= 0) {
            System.out.println("Warning" + accountOwner + ", you're account balance is 0 or less, please refund as soon as possible.");
        }
    }



    //main method
    public static void main (String [] args){

        //create new objects of BankAccount Class
        BankAccount rogerAccount = new BankAccount("Roger", 12345, 0);
        BankAccount nadineAccount = new BankAccount("Nadine", 54321, 2000);

        //print new account status
        System.out.println(rogerAccount);
        System.out.println(nadineAccount);

        rogerAccount.warningBalance();
        nadineAccount.warningBalance();

        //call methods deposit & withdraw
        rogerAccount.deposit(80);
        nadineAccount.withdraw(2500);
    }

    public String toString(){
        return "Compte de " + accountOwner + ". Votre solde est de " + accountBalance +  ".";
    }
}
