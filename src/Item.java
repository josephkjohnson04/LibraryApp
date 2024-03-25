import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Item {

    private static int lastNumber = 0;
    private int id;
    private String title;
    private String desc;
    private LocalDate invDate;

    public Item(String title, String invDate) {
        this.id = ++Item.lastNumber;
        this.settitle(title);
        this.setInvDate(invDate);
    }

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    public String getDateString(){
        return this.invDate.format(Item.formatter);
    }

    public void setInvDate(String myDate) throws Exception {
        try {
            this.invDate = LocalDate.parse(myDate, Item.formatter);
        } catch (Exception e){
            throw new Exception("Invalid date! Must be MM-DD-YYYY");
        }
    }

}




