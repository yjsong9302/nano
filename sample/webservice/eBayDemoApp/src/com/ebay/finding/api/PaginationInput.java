// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.finding.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Controls the pagination of the result set. Child elements specify the maximum
 * number of item listings to return per call and which page of data to return.
 * Controls which listings are returned in the response, but does not control
 * the details associated with the returned items.
 * 
 */
public class PaginationInput implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	@Order(value=0)
	public Integer pageNumber;	
	
	@Element
	@Order(value=1)
	public Integer entriesPerPage;	
	
	@Element
	@Order(value=2)
	public String delimiter;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}