public class StartApp {

    public static void main(String[] args) {
        Account account = new Account(new Statement());
        Transaction transaction = new Transaction();

        account.deposit(transaction.amountOf(1000), account.date("10/01/2021"));
        account.deposit(transaction.amountOf(2000), account.date("13/01/2021"));
        account.withdraw(transaction.amountOf(500), account.date("14/01/2021"));

        account.printStatement(System.out);
    }
}
