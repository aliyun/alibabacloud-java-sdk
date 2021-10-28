// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class RestartFileSharesRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ShareProtocol")
    public String shareProtocol;

    public static RestartFileSharesRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartFileSharesRequest self = new RestartFileSharesRequest();
        return TeaModel.build(map, self);
    }

    public RestartFileSharesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public RestartFileSharesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RestartFileSharesRequest setShareProtocol(String shareProtocol) {
        this.shareProtocol = shareProtocol;
        return this;
    }
    public String getShareProtocol() {
        return this.shareProtocol;
    }

}
