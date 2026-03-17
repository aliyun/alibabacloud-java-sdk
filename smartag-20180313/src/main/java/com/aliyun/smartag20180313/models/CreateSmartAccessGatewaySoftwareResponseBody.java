// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewaySoftwareResponseBody extends TeaModel {
    /**
     * <p>The ID of the order that you placed to purchase the SAG app instance.</p>
     * 
     * <strong>example:</strong>
     * <p>203000000000000</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>24675405-74DF-4C94-82C6-B749580C498E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the SAG app instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2iu4fnc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the SAG app instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-gnhe6sywtare5******</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    public static CreateSmartAccessGatewaySoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartAccessGatewaySoftwareResponseBody self = new CreateSmartAccessGatewaySoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmartAccessGatewaySoftwareResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSmartAccessGatewaySoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSmartAccessGatewaySoftwareResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSmartAccessGatewaySoftwareResponseBody setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

}
