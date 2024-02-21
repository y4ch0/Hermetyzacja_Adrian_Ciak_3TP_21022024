public class Account extends Client {
    protected double balance;
    protected int accountNumber;
    protected String accountType;
    protected int cardPin;

    public Account(String name, String secondName, String surname, int age, String dateOfBirth, int accountNumber,double balance,String accountType,int cardPin) {
        super(name,secondName,surname,age,dateOfBirth);
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.cardPin = cardPin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getCardPin() {
        return cardPin;
    }

    public void setCardPin(int cardPin) {
        this.cardPin = cardPin;
    }

    public void updtAccBal(int givPin,double balToRemove) {
        updateAccountBalance(givPin,balToRemove);
    }

    public void updtPin(int givPin,int newPin) {
        updatePin(givPin,newPin);
    }

    private void updateAccountBalance(int givenPin, double balanceToRemove) {
        if(givenPin == this.cardPin) {
            this.balance -= balanceToRemove;
            System.out.println("Balance updated");
            System.out.println(this.balance);
        } else {
            System.out.println("Wrong pin!");
        }
    }

    private void updatePin(int actualPin, int newPin) {
        if(actualPin == this.cardPin) {
            this.cardPin = newPin;
            System.out.println("Updated pin");
            System.out.println("Old pin: "+ actualPin + " | New pin: " + this.cardPin);
        } else {
            System.out.println("Wrong pin!");
        }
    }
}
