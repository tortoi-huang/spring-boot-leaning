package org.huang.leaning.lib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EnableDateFormatter1 {
	private final SimpleDateFormat format;

	public EnableDateFormatter1(String format) {
		this.format = new SimpleDateFormat(format);
	}

	public String sayHello(Date date) {
		return format.format(date);
	}
}
