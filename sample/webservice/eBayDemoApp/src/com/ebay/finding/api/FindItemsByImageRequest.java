// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.finding.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Find items based on the image similarity to the specified item.
 * 
 */
@RootElement(name = "findItemsByImageRequest", namespace = "http://www.ebay.com/marketplace/search/v1/services")
public class FindItemsByImageRequest extends BestMatchFindingServiceRequest implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	@Order(value=0)
	public String itemId;	
	
	@Element
	@Order(value=1)
	public List<String> categoryId;	
	
	@Element
	@Order(value=2)
	public List<ItemFilter> itemFilter;	
	
	@Element
	@Order(value=3)
	public List<AspectFilter> aspectFilter;	
	
	@Element
	@Order(value=4)
	public List<DomainFilter> domainFilter;	
	
	@Element
	@Order(value=5)
	public List<OutputSelectorType> outputSelector;	
	
    
}