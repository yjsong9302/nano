// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains search word information, as it is related to a category.
 * 
 */
public class PopularSearchesType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryID")
	@Order(value=0)
	public String categoryID;	
	
	@Element(name = "CategoryParentID")
	@Order(value=1)
	public String categoryParentID;	
	
	@Element(name = "QueryKeywords")
	@Order(value=2)
	public String queryKeywords;	
	
	@Element(name = "AlternativeSearches")
	@Order(value=3)
	public String alternativeSearches;	
	
	@Element(name = "RelatedSearches")
	@Order(value=4)
	public String relatedSearches;	
	
	@Element(name = "CategoryName")
	@Order(value=5)
	public String categoryName;	
	
	@Element(name = "CategoryParentName")
	@Order(value=6)
	public String categoryParentName;	
	
	@AnyElement
	@Order(value=7)
	public List<Object> any;	
	
    
}