// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.finding.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Shows the pagination data for the item search. Child elements include the
 * page number returned, the maximum entries returned per page, the total number
 * of pages that can be returned, and the total number of items that match the
 * search criteria.
 * 
 */
public class PaginationOutput implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	@Order(value=0)
	public Integer pageNumber;	
	
	@Element
	@Order(value=1)
	public Integer entriesPerPage;	
	
	@Element
	@Order(value=2)
	public Integer totalPages;	
	
	@Element
	@Order(value=3)
	public Integer totalEntries;	
	
	@Element
	@Order(value=4)
	public String delimiter;	
	
	@AnyElement
	@Order(value=5)
	public List<Object> any;	
	
    
}