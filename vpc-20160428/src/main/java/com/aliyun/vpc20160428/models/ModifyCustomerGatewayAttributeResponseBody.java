// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCustomerGatewayAttributeResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("Name")
    public String name;

    public static ModifyCustomerGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomerGatewayAttributeResponseBody self = new ModifyCustomerGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustomerGatewayAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCustomerGatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCustomerGatewayAttributeResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public ModifyCustomerGatewayAttributeResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ModifyCustomerGatewayAttributeResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public ModifyCustomerGatewayAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
