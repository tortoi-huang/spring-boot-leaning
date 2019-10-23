package org.huang.leaning.lib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EnableDateFormater2 {
	private final SimpleDateFormat format;

	public EnableDateFormater2(String format) {
		this.format = new SimpleDateFormat(format);
	}

	public String sayHello() {
		return format.format(new Date());
	}
}
