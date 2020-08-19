package org.huang.leaning.element;

import org.huang.leaning.lib.ElementFormatter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class ElementFormatterTest {
    @Autowired
    private ElementFormatter elementFormatter;

    @Test
    void format() throws ParseException {
        String dateStr = "2020-12-31 23:59:58";
        Date date = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(dateStr);
        assertEquals(dateStr, elementFormatter.sayHello(date));
    }
}
