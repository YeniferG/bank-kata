import java.io.PrintStream;

public class Account {

    private Statement statement = new Statement();
    private Transaction transaction = new Transaction();

    public Account() {
        
    }

    public String date(String dateString){
        return dateString;
    }

    public Account(Statement statement) {
        this.statement = statement;
    }

    void deposit(double amount, String date) {
        transaction.credit(amount, date);
    }

    void withdraw(double amount, String date){
        transaction.debit(amount, date);
    }

    void sendMoney(double amount, String date){
        transaction.debit(amount, date);
    }

    void printStatement(PrintStream printer) {
        printer.println("\n**** FILTER STATEMENT ALL ****\n");
        statement.statementTitle(printer);
        statement.printLines(printer);
    }

}
