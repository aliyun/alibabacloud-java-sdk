// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SetGatewayDNSRequest extends TeaModel {
    @NameInMap("DnsServer")
    public String dnsServer;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetGatewayDNSRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGatewayDNSRequest self = new SetGatewayDNSRequest();
        return TeaModel.build(map, self);
    }

    public SetGatewayDNSRequest setDnsServer(String dnsServer) {
        this.dnsServer = dnsServer;
        return this;
    }
    public String getDnsServer() {
        return this.dnsServer;
    }

    public SetGatewayDNSRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public SetGatewayDNSRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
