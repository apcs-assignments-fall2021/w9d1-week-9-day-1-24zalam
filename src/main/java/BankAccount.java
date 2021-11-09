public class BankAccount {

    // Instance variables
    private int balance;
    private int accountNumber;
    private String preferredName;

    public BankAccount(int balance, int accountNumber, String preferredName) {
        balance = 0;
        accountNumber = 13331;
        preferredName = "Zara";

    }

    public void withdraw(int w) {
        balance = balance - w;

    }

    public void deposit(int d) {
        balance = balance + d;

    }

    public void getAccountNumber() {
        System.out.println(accountNumber);

    }

    public void getBalance() {

        System.out.println(balance);
    }

    public void getPreferredName() {
        System.out.println(preferredName);
    }

    public void setPreferredName(String name) {
        preferredName = name;
    }

    public String toString() {
return ("HI" + preferredName+ "Your balance is" + balance + "Your account number is" + accountNumber);

    }

}





