// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ExpandGatewayNetworkBandwidthRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("NewNetworkBandwidth")
    public Integer newNetworkBandwidth;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ExpandGatewayNetworkBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpandGatewayNetworkBandwidthRequest self = new ExpandGatewayNetworkBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public ExpandGatewayNetworkBandwidthRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ExpandGatewayNetworkBandwidthRequest setNewNetworkBandwidth(Integer newNetworkBandwidth) {
        this.newNetworkBandwidth = newNetworkBandwidth;
        return this;
    }
    public Integer getNewNetworkBandwidth() {
        return this.newNetworkBandwidth;
    }

    public ExpandGatewayNetworkBandwidthRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
