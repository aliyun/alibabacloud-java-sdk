// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateCustomerGatewayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CustomerGatewayId")
    @Validation(required = true)
    public String customerGatewayId;

    @NameInMap("IpAddress")
    @Validation(required = true)
    public String ipAddress;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    public static CreateCustomerGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerGatewayResponse self = new CreateCustomerGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomerGatewayResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomerGatewayResponse setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public CreateCustomerGatewayResponse setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public CreateCustomerGatewayResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomerGatewayResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomerGatewayResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

}
