public class BankATM1 implements ATM {
    private int balance;

    public BankATM(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void getMyBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    @Override
    public void getCash(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankATM1 myATM = new BankATM1(5000); // Initial balance is 5000
        myATM.getMyBalance();
        myATM.getCash(1000);
        myATM.getMyBalance();
    }
}
