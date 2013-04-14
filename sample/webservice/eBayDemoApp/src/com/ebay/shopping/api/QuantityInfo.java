// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>QuantityInfo</b> container, which consists of the 
 * <b>MinimumRemnantSet</b> field, which sets the minimum amount of event tickets that can
 * remain in the fixed-price listing's inventory after a buyer purchases one or more tickets (but
 * not all) from the listing.
 * 
 */
public class QuantityInfo implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MinimumRemnantSet")
	@Order(value=0)
	public Integer minimumRemnantSet;	
	
	@AnyElement
	@Order(value=1)
	public List<Object> any;	
	
    
}