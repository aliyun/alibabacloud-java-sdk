// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckUpgradeVersionRequest extends TeaModel {
    @NameInMap("ClientUUID")
    public String clientUUID;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("GatewayVersion")
    public String gatewayVersion;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckUpgradeVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUpgradeVersionRequest self = new CheckUpgradeVersionRequest();
        return TeaModel.build(map, self);
    }

    public CheckUpgradeVersionRequest setClientUUID(String clientUUID) {
        this.clientUUID = clientUUID;
        return this;
    }
    public String getClientUUID() {
        return this.clientUUID;
    }

    public CheckUpgradeVersionRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CheckUpgradeVersionRequest setGatewayVersion(String gatewayVersion) {
        this.gatewayVersion = gatewayVersion;
        return this;
    }
    public String getGatewayVersion() {
        return this.gatewayVersion;
    }

    public CheckUpgradeVersionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
