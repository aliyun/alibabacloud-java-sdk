// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class TriggerGatewayRemoteSyncRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("Path")
    public String path;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static TriggerGatewayRemoteSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerGatewayRemoteSyncRequest self = new TriggerGatewayRemoteSyncRequest();
        return TeaModel.build(map, self);
    }

    public TriggerGatewayRemoteSyncRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public TriggerGatewayRemoteSyncRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public TriggerGatewayRemoteSyncRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public TriggerGatewayRemoteSyncRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
