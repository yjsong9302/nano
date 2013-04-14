// Generated by wsdl compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services.client;


import com.leansoft.nano.ws.XMLServiceCallback;
import com.leansoft.nano.ws.NanoXMLClient;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsResponse;
import com.ebay.marketplace.search.v1.services.FindItemsByImageResponse;
import com.ebay.marketplace.search.v1.services.FindItemsByCategoryRequest;
import com.ebay.marketplace.search.v1.services.FindCompletedItemsRequest;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsRequest;
import com.ebay.marketplace.search.v1.services.FindItemsByProductResponse;
import com.ebay.marketplace.search.v1.services.FindItemsForFavoriteSearchResponse;
import com.ebay.marketplace.search.v1.services.FindItemsIneBayStoresRequest;
import com.ebay.marketplace.search.v1.services.GetHistogramsRequest;
import com.ebay.marketplace.search.v1.services.FindItemsIneBayStoresResponse;
import com.ebay.marketplace.search.v1.services.FindItemsByImageRequest;
import com.ebay.marketplace.search.v1.services.FindCompletedItemsResponse;
import com.ebay.marketplace.search.v1.services.GetVersionResponse;
import com.ebay.marketplace.search.v1.services.GetSearchKeywordsRecommendationRequest;
import com.ebay.marketplace.search.v1.services.FindItemsByCategoryResponse;
import com.ebay.marketplace.search.v1.services.GetHistogramsResponse;
import com.ebay.marketplace.search.v1.services.GetVersionRequest;
import com.ebay.marketplace.search.v1.services.FindItemsAdvancedRequest;
import com.ebay.marketplace.search.v1.services.FindItemsAdvancedResponse;
import com.ebay.marketplace.search.v1.services.FindItemsForFavoriteSearchRequest;
import com.ebay.marketplace.search.v1.services.GetSearchKeywordsRecommendationResponse;
import com.ebay.marketplace.search.v1.services.FindItemsByProductRequest;


/**
 This class is the XML client to the FindingServicePortType Web Service.
*/ 
public class FindingServicePortType_XMLClient extends NanoXMLClient {


    /**
     public method
    */
    public void getSearchKeywordsRecommendation(GetSearchKeywordsRecommendationRequest requestObject, XMLServiceCallback<GetSearchKeywordsRecommendationResponse> serviceCallback) {
       
        
        super.invoke(requestObject, serviceCallback, GetSearchKeywordsRecommendationResponse.class);
    }

    /**
     public method
    */
    public void findItemsByKeywords(FindItemsByKeywordsRequest requestObject, XMLServiceCallback<FindItemsByKeywordsResponse> serviceCallback) {
       
        
        super.invoke(requestObject, serviceCallback, FindItemsByKeywordsResponse.class);
    }

    /**
     public method
    */
    public void findItemsByCategory(FindItemsByCategoryRequest requestObject, XMLServiceCallback<FindItemsByCategoryResponse> serviceCallback) {
       
        
        super.invoke(requestObject, serviceCallback, FindItemsByCategoryResponse.class);
    }

    /**
     public method
    */
    public void findItemsAdvanced(FindItemsAdvancedRequest requestObject, XMLServiceCallback<FindItemsAdvancedResponse> serviceCallback) {
       
        
        super.invoke(requestObject, serviceCallback, FindItemsAdvancedResponse.class);
    }

    /**
     public method
    */
    public void findItemsByProduct(FindItemsByProductRequest requestObject, XMLServiceCallback<FindItemsByProductResponse> serviceCallback) {
       
        
        super.invoke(requestObject, serviceCallback, FindItemsByProductResponse.class);
    }

    /**
     public method
    */
    public void findItemsIneBayStores(FindItemsIneBayStoresRequest requestObject, XMLServiceCallback<FindItemsIneBayStoresResponse> serviceCallback) {
       
        
        super.invoke(requestObject, serviceCallback, FindItemsIneBayStoresResponse.class);
    }

    /**
     public method
    */
    public void findItemsByImage(FindItemsByImageRequest requestObject, XMLServiceCallback<FindItemsByImageResponse> serviceCallback) {
       
        
        super.invoke(requestObject, serviceCallback, FindItemsByImageResponse.class);
    }

    /**
     public method
    */
    public void getHistograms(GetHistogramsRequest requestObject, XMLServiceCallback<GetHistogramsResponse> serviceCallback) {
       
        
        super.invoke(requestObject, serviceCallback, GetHistogramsResponse.class);
    }

    /**
     public method
    */
    public void findCompletedItems(FindCompletedItemsRequest requestObject, XMLServiceCallback<FindCompletedItemsResponse> serviceCallback) {
       
        
        super.invoke(requestObject, serviceCallback, FindCompletedItemsResponse.class);
    }

    /**
     public method
    */
    public void getVersion(GetVersionRequest requestObject, XMLServiceCallback<GetVersionResponse> serviceCallback) {
       
        
        super.invoke(requestObject, serviceCallback, GetVersionResponse.class);
    }

    /**
     public method
    */
    public void findItemsForFavoriteSearch(FindItemsForFavoriteSearchRequest requestObject, XMLServiceCallback<FindItemsForFavoriteSearchResponse> serviceCallback) {
       
        
        super.invoke(requestObject, serviceCallback, FindItemsForFavoriteSearchResponse.class);
    }


}