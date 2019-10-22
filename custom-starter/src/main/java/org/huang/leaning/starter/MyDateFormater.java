package org.huang.leaning.starter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormater {
    private final SimpleDateFormat format;

    public MyDateFormater(String format) {
        this.format = new SimpleDateFormat(format);
    }

    public String sayHello() {
        return format.format(new Date());
    }
}