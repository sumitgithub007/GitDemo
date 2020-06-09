package beta;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());
	
	public static void main(String args [])
	{
	 log.debug("hi debug demo1");
	 log.info("hi info demo1");
	 log.error("hi error demo1");
	 log.fatal("hi fatal demo1");
	}
	
}
