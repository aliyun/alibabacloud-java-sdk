// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ReportGatewayUsageRequest extends TeaModel {
    @NameInMap("ClientUUID")
    public String clientUUID;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Usage")
    public String usage;

    public static ReportGatewayUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportGatewayUsageRequest self = new ReportGatewayUsageRequest();
        return TeaModel.build(map, self);
    }

    public ReportGatewayUsageRequest setClientUUID(String clientUUID) {
        this.clientUUID = clientUUID;
        return this;
    }
    public String getClientUUID() {
        return this.clientUUID;
    }

    public ReportGatewayUsageRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportGatewayUsageRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportGatewayUsageRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
