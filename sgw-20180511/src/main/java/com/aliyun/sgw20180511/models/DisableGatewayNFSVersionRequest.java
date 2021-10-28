// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DisableGatewayNFSVersionRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("NFSVersion")
    public String NFSVersion;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DisableGatewayNFSVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableGatewayNFSVersionRequest self = new DisableGatewayNFSVersionRequest();
        return TeaModel.build(map, self);
    }

    public DisableGatewayNFSVersionRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DisableGatewayNFSVersionRequest setNFSVersion(String NFSVersion) {
        this.NFSVersion = NFSVersion;
        return this;
    }
    public String getNFSVersion() {
        return this.NFSVersion;
    }

    public DisableGatewayNFSVersionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
