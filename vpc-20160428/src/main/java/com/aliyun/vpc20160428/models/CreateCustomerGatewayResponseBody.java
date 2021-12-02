// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateCustomerGatewayResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    @NameInMap("Description")
    public String description;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomerGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerGatewayResponseBody self = new CreateCustomerGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomerGatewayResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateCustomerGatewayResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public CreateCustomerGatewayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomerGatewayResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public CreateCustomerGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomerGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
