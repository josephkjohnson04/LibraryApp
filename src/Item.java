

import java.util.Date;

public class Item {

    private static int lastNumber = 0;
    private int ItemID;
    private String title;
    private String desc;
    private Date invDate;

    public Item() {

        this.ItemID = ++Item.lastNumber;

    }

}




