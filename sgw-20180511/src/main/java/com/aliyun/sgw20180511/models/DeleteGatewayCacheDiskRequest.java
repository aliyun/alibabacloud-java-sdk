// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteGatewayCacheDiskRequest extends TeaModel {
    @NameInMap("CacheId")
    public String cacheId;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("LocalFilePath")
    public String localFilePath;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteGatewayCacheDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayCacheDiskRequest self = new DeleteGatewayCacheDiskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayCacheDiskRequest setCacheId(String cacheId) {
        this.cacheId = cacheId;
        return this;
    }
    public String getCacheId() {
        return this.cacheId;
    }

    public DeleteGatewayCacheDiskRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DeleteGatewayCacheDiskRequest setLocalFilePath(String localFilePath) {
        this.localFilePath = localFilePath;
        return this;
    }
    public String getLocalFilePath() {
        return this.localFilePath;
    }

    public DeleteGatewayCacheDiskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
