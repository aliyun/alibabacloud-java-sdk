// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyGatewayFileShareRequest extends TeaModel {
    @NameInMap("CacheConfig")
    public String cacheConfig;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyGatewayFileShareRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayFileShareRequest self = new ModifyGatewayFileShareRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayFileShareRequest setCacheConfig(String cacheConfig) {
        this.cacheConfig = cacheConfig;
        return this;
    }
    public String getCacheConfig() {
        return this.cacheConfig;
    }

    public ModifyGatewayFileShareRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ModifyGatewayFileShareRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public ModifyGatewayFileShareRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
