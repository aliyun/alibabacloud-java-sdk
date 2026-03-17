// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewayResponseBody extends TeaModel {
    /**
     * <p>The description of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>20337777****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A6B9EB0F-57DB-4843-A372-04678ABF490E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the SAG instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2iu4fnc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-nylv14tghsk26c*****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    public static CreateSmartAccessGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartAccessGatewayResponseBody self = new CreateSmartAccessGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmartAccessGatewayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSmartAccessGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSmartAccessGatewayResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSmartAccessGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSmartAccessGatewayResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSmartAccessGatewayResponseBody setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

}
