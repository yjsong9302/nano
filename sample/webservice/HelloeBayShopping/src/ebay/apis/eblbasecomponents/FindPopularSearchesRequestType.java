// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Retrieves the words most frequently used by eBay users when searching for listings.
 * These keywords are generated weekly by eBay. Thus, calls retrieve static data.
 * FindPopularSearches is not available for the following sites: FR, HK, MY, PH, PL, SG, SE.
 * 
 */
@RootElement(name = "FindPopularSearchesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class FindPopularSearchesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryID")
	@Order(value=0)
	public List<String> categoryID;	
	
	@Element(name = "QueryKeywords")
	@Order(value=1)
	public List<String> queryKeywords;	
	
	@Element(name = "MaxKeywords")
	@Order(value=2)
	public Integer maxKeywords;	
	
	@Element(name = "MaxResultsPerPage")
	@Order(value=3)
	public Integer maxResultsPerPage;	
	
	@Element(name = "PageNumber")
	@Order(value=4)
	public Integer pageNumber;	
	
	@Element(name = "IncludeChildCategories")
	@Order(value=5)
	public Boolean includeChildCategories;	
	
    
}