// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Calculated Shipping Charge Options
 * 
 */
public enum CalculatedShippingChargeOptionCodeType {

    /**
     * 
   * Charge the actual shipping cost and my full packaging and handling
   * fee for each item.
   * 
     */
    CHARGE_EACH_ITEM("ChargeEachItem"),
  

    /**
     * 
   * Charge the actual shipping cost and a packaging and handling fee of
   * X amount for the entire order.
   * 
     */
    CHARGE_ENTIRE_ORDER("ChargeEntireOrder"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    CalculatedShippingChargeOptionCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static CalculatedShippingChargeOptionCodeType fromValue(String v) {
        if (v != null) {
            for (CalculatedShippingChargeOptionCodeType c: CalculatedShippingChargeOptionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}