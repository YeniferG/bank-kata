package com.sofka.bank;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Statement {

    static List<String> statementList = new ArrayList<>();

    public void statementTitle(PrintStream printer){
        String title = "|   Date   | Credit |  Debit  |  Balance  |";
        printer.println(title);
    }

    public static void printLines(PrintStream printer){
        for(int i = statementList.size()-1; i>=0; i--) {
            printer.println(statementList.get(i));
        }
    }

    public List<String> returnStatementList(){
        return this.statementList;
    }

    public void addStatementLine(String line){
        statementList.add(line);
    }

}
