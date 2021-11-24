import java.text.DecimalFormat;

public class Amount {

    private double amount;
    private double balance = 0;

    private Amount(double amount){
        this.amount = amount;
    }



    public String decomalFormatter(double number) {
        DecimalFormat df = new DecimalFormat("######.##");
        return df.format(number);
    }
}
