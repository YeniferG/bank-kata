import java.io.PrintStream;
import java.util.List;

public class Filter {

    private Statement statement = new Statement();
    private List<String> statementList = statement.returnStatementList();

    public void printFilterByDate(PrintStream printer, String filter){
        System.out.println("\n**** FILTER BY DATE ****\n");
        statement.statementTitle(System.out);
        for(int i = 0; i < statementList.size(); i++){
            String stringAtIndex = statementList.get(i);
            String subStringLine = stringAtIndex.substring(1,11);
            if(subStringLine.equals(filter)) printer.println(statementList.get(i));
        }
    }

    public void printOnlyCredit(PrintStream printer){
        System.out.println("\n**** FILTER BY CREDIT ****\n");
        statement.statementTitle(System.out);
        for(int i = 0; i < statementList.size(); i++){
            String stringAtIndex = statementList.get(i);
            char subChar = stringAtIndex.charAt(13);
            if(subChar != ' ') printer.println(statement.statementList.get(i));
        }
    }

    public void printOnlyDebit(PrintStream printer){
        System.out.println("\n**** FILTER BY DEBIT ****\n");
        statement.statementTitle(System.out);
        for(int i = 0; i < statementList.size(); i++){
            String stringAtIndex = statementList.get(i);
            char subChar = stringAtIndex.charAt(26);
            if(subChar != ' ') printer.println(statement.statementList.get(i));
        }
    }

}
