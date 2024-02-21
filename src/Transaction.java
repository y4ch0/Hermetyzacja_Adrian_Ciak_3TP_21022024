public class Transaction {
    int senderAccount;
    int receiverAccount;
    String title;
    String transactionDate;
    double ammount;

    public Transaction(String name, String secondName, String surname, int age, String dateOfBirth, int senderAccount, int receiverAccount, String title, String transactionDate, double ammount) {
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.title = title;
        this.transactionDate = transactionDate;
        this.ammount = ammount;
    }
}
