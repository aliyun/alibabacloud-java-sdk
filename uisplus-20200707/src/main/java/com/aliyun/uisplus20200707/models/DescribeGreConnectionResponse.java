// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DescribeGreConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("UisName")
    @Validation(required = true)
    public String uisName;

    @NameInMap("GreConnectionId")
    @Validation(required = true)
    public String greConnectionId;

    @NameInMap("State")
    @Validation(required = true)
    public String state;

    @NameInMap("Cidrs")
    @Validation(required = true)
    public String cidrs;

    @NameInMap("LocalIp")
    @Validation(required = true)
    public String localIp;

    @NameInMap("LocalTunnelIp")
    @Validation(required = true)
    public String localTunnelIp;

    @NameInMap("CustomerIp")
    @Validation(required = true)
    public String customerIp;

    @NameInMap("CustomerTunnelIp")
    @Validation(required = true)
    public String customerTunnelIp;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    public static DescribeGreConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGreConnectionResponse self = new DescribeGreConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGreConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGreConnectionResponse setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public DescribeGreConnectionResponse setUisName(String uisName) {
        this.uisName = uisName;
        return this;
    }
    public String getUisName() {
        return this.uisName;
    }

    public DescribeGreConnectionResponse setGreConnectionId(String greConnectionId) {
        this.greConnectionId = greConnectionId;
        return this;
    }
    public String getGreConnectionId() {
        return this.greConnectionId;
    }

    public DescribeGreConnectionResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeGreConnectionResponse setCidrs(String cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public String getCidrs() {
        return this.cidrs;
    }

    public DescribeGreConnectionResponse setLocalIp(String localIp) {
        this.localIp = localIp;
        return this;
    }
    public String getLocalIp() {
        return this.localIp;
    }

    public DescribeGreConnectionResponse setLocalTunnelIp(String localTunnelIp) {
        this.localTunnelIp = localTunnelIp;
        return this;
    }
    public String getLocalTunnelIp() {
        return this.localTunnelIp;
    }

    public DescribeGreConnectionResponse setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
        return this;
    }
    public String getCustomerIp() {
        return this.customerIp;
    }

    public DescribeGreConnectionResponse setCustomerTunnelIp(String customerTunnelIp) {
        this.customerTunnelIp = customerTunnelIp;
        return this;
    }
    public String getCustomerTunnelIp() {
        return this.customerTunnelIp;
    }

    public DescribeGreConnectionResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeGreConnectionResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeGreConnectionResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

}
