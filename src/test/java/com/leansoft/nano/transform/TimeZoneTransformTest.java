package com.leansoft.nano.transform;

import java.util.TimeZone;

import com.leansoft.nano.transform.TimeZoneTransform;

import junit.framework.TestCase;

public class TimeZoneTransformTest extends TestCase {
	public void testTimeZone() throws Exception {
		TimeZone zone = TimeZone.getTimeZone("GMT");
	    TimeZoneTransform format = new TimeZoneTransform();
	    String value = format.write(zone);
	    TimeZone copy = format.read(value);
	      
	    assertEquals(zone, copy);
	}
}
