import java.util.ArrayList;
import java.util.List;

public class HistoryTransfers {
    private static List<Transfer> historyOfTransfers = new ArrayList<Transfer>();

    public static void makeATransfer(double amount, String title, String dataOfSender){
        historyOfTransfers.add(new Transfer(title, amount, dataOfSender));
    }

    public static void printHistory(){
        for (Transfer x : historyOfTransfers){
            System.out.println(x);
        }
    }
}
