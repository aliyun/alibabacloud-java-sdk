// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeSubConnectionResponseBody extends TeaModel {
    @NameInMap("CustomerTunnelIp")
    public String customerTunnelIp;

    @NameInMap("Description")
    public String description;

    @NameInMap("LocalTunnelIp")
    public String localTunnelIp;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UisId")
    public String uisId;

    @NameInMap("CustomerIp")
    public String customerIp;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("UisNodeId")
    public String uisNodeId;

    @NameInMap("UisSubConnectionId")
    public String uisSubConnectionId;

    @NameInMap("CustomerSubnet")
    public String customerSubnet;

    @NameInMap("Name")
    public String name;

    public static DescribeSubConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubConnectionResponseBody self = new DescribeSubConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubConnectionResponseBody setCustomerTunnelIp(String customerTunnelIp) {
        this.customerTunnelIp = customerTunnelIp;
        return this;
    }
    public String getCustomerTunnelIp() {
        return this.customerTunnelIp;
    }

    public DescribeSubConnectionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeSubConnectionResponseBody setLocalTunnelIp(String localTunnelIp) {
        this.localTunnelIp = localTunnelIp;
        return this;
    }
    public String getLocalTunnelIp() {
        return this.localTunnelIp;
    }

    public DescribeSubConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubConnectionResponseBody setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public DescribeSubConnectionResponseBody setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
        return this;
    }
    public String getCustomerIp() {
        return this.customerIp;
    }

    public DescribeSubConnectionResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeSubConnectionResponseBody setUisNodeId(String uisNodeId) {
        this.uisNodeId = uisNodeId;
        return this;
    }
    public String getUisNodeId() {
        return this.uisNodeId;
    }

    public DescribeSubConnectionResponseBody setUisSubConnectionId(String uisSubConnectionId) {
        this.uisSubConnectionId = uisSubConnectionId;
        return this;
    }
    public String getUisSubConnectionId() {
        return this.uisSubConnectionId;
    }

    public DescribeSubConnectionResponseBody setCustomerSubnet(String customerSubnet) {
        this.customerSubnet = customerSubnet;
        return this;
    }
    public String getCustomerSubnet() {
        return this.customerSubnet;
    }

    public DescribeSubConnectionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
