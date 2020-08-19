package org.huang.leaning.element;

import org.huang.leaning.lib.ElementFormatter;
import org.huang.leaning.lib.EnableDateFormatter;
import org.huang.leaning.lib.EnableDateFormatter1;
import org.huang.leaning.lib.EnableDateFormatter2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class EnableFormatterTest {
    @Autowired
    private EnableDateFormatter enableDateFormatter;
    @Autowired(required = false)
    private EnableDateFormatter1 enableDateFormatter1;
    @Autowired(required = false)
    private EnableDateFormatter2 enableDateFormatter2;

    @Test
    void format() throws ParseException {
        String dateStr = "2020-12-31 23:59:58";
        Date date = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(dateStr);
        assertEquals("12-31 23:59:58", enableDateFormatter.sayHello(date));
    }

    @Test
    void format2() throws ParseException {
        String dateStr = "2020-12-31 23:59:58";
        Date date = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(dateStr);
        if(enableDateFormatter1 == null) {
            System.out.println("### enableDateFormatter1 is null");
        } else {
            assertEquals("31 23_59_58", enableDateFormatter1.sayHello(date));
        }
        if(enableDateFormatter2 == null) {
            System.out.println("### enableDateFormatter2 is null");
        } else {
            assertEquals("23:59:58", enableDateFormatter2.sayHello(date));
        }
    }
}
