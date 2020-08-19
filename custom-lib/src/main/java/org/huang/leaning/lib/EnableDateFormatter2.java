package org.huang.leaning.lib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EnableDateFormatter2 {
	private final SimpleDateFormat format;

	public EnableDateFormatter2(String format) {
		this.format = new SimpleDateFormat(format);
	}

	public String sayHello(Date date) {
		return format.format(date);
	}
}
