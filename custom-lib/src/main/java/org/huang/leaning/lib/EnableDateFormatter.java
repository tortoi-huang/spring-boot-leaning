package org.huang.leaning.lib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EnableDateFormatter {
	private final SimpleDateFormat format;

	public EnableDateFormatter(String format) {
		this.format = new SimpleDateFormat(format);
	}

	public String sayHello(Date date) {
		return format.format(date);
	}
}
