public class Transfer {
    private String titleOfTransfer;
    private double amount;
    private String dataOfSender;

    public String getTitleOfTransfer(){
        return titleOfTransfer;
    }
    public void setTitleOfTransfer(String titleOfTransfer){
        this.titleOfTransfer = titleOfTransfer;
    }
    public double getAmount(){
        return  amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public String getDataOfSender(){
        return dataOfSender;
    }
    public void setDataOfSender(String dataOfSender){
        this.dataOfSender = dataOfSender;
    }

    Transfer(String titleOfTransfer, double amount, String dataOfSender){
        this.titleOfTransfer = titleOfTransfer;
        this.amount = amount;
        this.dataOfSender = dataOfSender;
    }

    @Override
    public String toString() {
        return "| Tytuł Przelewu: " + titleOfTransfer + " | Kwota: " + amount + " | Dane nadawcy: " + dataOfSender + "|";
    }
}
