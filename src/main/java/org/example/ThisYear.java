package org.example;

import java.time.Year;

public class ThisYear {
    public static void main(String[] args) {
        // get current year - Object type?
/*        Year thisYear = Year.now();
        System.out.println(thisYear);*/

        // another way - but this is in Integer data type!
        int currentYear = Year.now().getValue();
        System.out.println(currentYear);
    }
}
