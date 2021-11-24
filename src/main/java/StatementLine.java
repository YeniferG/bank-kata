public class StatementLine {

    Statement statement = new Statement();

    public void saveCreditLine(String date, double credit, double balance){
        String line = ("|" + date + "| " + String.valueOf(credit) + " |       " + "  |  " + String.valueOf(balance) + "   |");
        statement.addStatementLine(line);
    }

    public void saveDebitLine(String date, double debit, double balance){
        String line = ("|" + date + "| " + "       |  " + String.valueOf(debit) + "  |  " + String.valueOf(balance) + "   |");
        statement.addStatementLine(line);
    }

}
