// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01.cartmodifyrequest;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import com.amazon.webservices.awsecommerceservice._2011_08_01.cartmodifyrequest.items.Item;

public class Items implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Item")
	@Order(value=0)
	public List<Item> item;	
	
    
}