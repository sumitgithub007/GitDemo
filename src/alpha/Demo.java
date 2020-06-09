package alpha;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());
	
	public static void main(String args [])
	{
	 log.debug("hi debug");
	 log.info("hi info");
	 log.error("hi error");
	 log.fatal("hi fatal");
	}
	
}
