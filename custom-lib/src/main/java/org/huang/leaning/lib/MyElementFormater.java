package org.huang.leaning.lib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyElementFormater {
    private final SimpleDateFormat format;
    private boolean lenient;

    public MyElementFormater(String format) {
        this.format = new SimpleDateFormat(format);
    }

    public String sayHello() {
        return format.format(new Date());
    }

    public boolean isLenient() {
        return lenient;
    }

    public void setLenient(boolean lenient) {
        this.lenient = lenient;
    }
}