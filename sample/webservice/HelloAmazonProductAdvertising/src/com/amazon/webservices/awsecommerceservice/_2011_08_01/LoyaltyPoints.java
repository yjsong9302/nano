// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;

@RootElement(name = "LoyaltyPoints", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class LoyaltyPoints implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Points")
	@Order(value=0)
	public BigInteger points;	
	
	@Element(name = "TypicalRedemptionValue")
	@Order(value=1)
	public Price typicalRedemptionValue;	
	
    
}