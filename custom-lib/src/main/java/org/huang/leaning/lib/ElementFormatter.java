package org.huang.leaning.lib;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这个类用于自定义元素实验
 */
public class ElementFormatter {
    /**
     * 实验构造函数参数
     */
    private final SimpleDateFormat format;

    /**
     * 实验 setter 属性参数
     */
    private boolean lenient;

    public ElementFormatter(String format) {
        this.format = new SimpleDateFormat(format);
    }

    public String sayHello(Date date) {
        return format.format(date);
    }

    public boolean isLenient() {
        return lenient;
    }

    public void setLenient(boolean lenient) {
        this.lenient = lenient;
    }
}