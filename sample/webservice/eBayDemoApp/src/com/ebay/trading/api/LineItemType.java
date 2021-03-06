// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *          This type provides information about one order line item in a Global Shipping package. The package can contain multiple units of a given order line item.
 * 
 */
public class LineItemType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Quantity")
	@Order(value=0)
	public Integer quantity;	
	
	@Element(name = "CountryOfOrigin")
	@Order(value=1)
	public String countryOfOrigin;	
	
	@Element(name = "Description")
	@Order(value=2)
	public String description;	
	
	@Element(name = "ItemID")
	@Order(value=3)
	public String itemID;	
	
	@Element(name = "TransactionID")
	@Order(value=4)
	public String transactionID;	
	
	@AnyElement
	@Order(value=5)
	public List<Object> any;	
	
    
}