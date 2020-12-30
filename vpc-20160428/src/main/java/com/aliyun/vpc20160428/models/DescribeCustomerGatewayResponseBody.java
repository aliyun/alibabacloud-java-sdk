// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCustomerGatewayResponseBody extends TeaModel {
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

    @NameInMap("Asn")
    public Integer asn;

    @NameInMap("Name")
    public String name;

    public static DescribeCustomerGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerGatewayResponseBody self = new DescribeCustomerGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerGatewayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeCustomerGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomerGatewayResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public DescribeCustomerGatewayResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeCustomerGatewayResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public DescribeCustomerGatewayResponseBody setAsn(Integer asn) {
        this.asn = asn;
        return this;
    }
    public Integer getAsn() {
        return this.asn;
    }

    public DescribeCustomerGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
