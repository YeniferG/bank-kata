package com.sofka.bank;

import java.text.DecimalFormat;

public class StatementLine {

    private Statement statement = new Statement();

    public String decimalFormatter(double number) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(number);
    }

    public void saveCreditLine(String date, double credit, double balance){
        String line = ("|" + date + "| " + decimalFormatter(credit) + "|      " + "   | " + decimalFormatter(balance) + "   |");
        statement.addStatementLine(line);
    }

    public void saveDebitLine(String date, double debit, double balance){
        String line = ("|" + date + "| " + "       |  " + decimalFormatter(debit) + " | " + decimalFormatter(balance) + "   |");
        statement.addStatementLine(line);
    }

}
