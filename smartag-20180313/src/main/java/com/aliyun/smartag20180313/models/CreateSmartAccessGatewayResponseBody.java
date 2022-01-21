// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewayResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
