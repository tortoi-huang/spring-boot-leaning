package org.huang.leaning.lib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EnableDateFormater1 {
	private final SimpleDateFormat format;

	public EnableDateFormater1(String format) {
		this.format = new SimpleDateFormat(format);
	}

	public String sayHello() {
		return format.format(new Date());
	}
}
