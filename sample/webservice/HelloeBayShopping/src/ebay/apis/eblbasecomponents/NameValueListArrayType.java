// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A list of one or more valid names and corresponding values.
 * 
 */
public class NameValueListArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "NameValueList")
	@Order(value=0)
	public List<NameValueListType> nameValueList;	
	
    
}