// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyGatewayBlockVolumeRequest extends TeaModel {
    @NameInMap("CacheConfig")
    public String cacheConfig;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyGatewayBlockVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayBlockVolumeRequest self = new ModifyGatewayBlockVolumeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayBlockVolumeRequest setCacheConfig(String cacheConfig) {
        this.cacheConfig = cacheConfig;
        return this;
    }
    public String getCacheConfig() {
        return this.cacheConfig;
    }

    public ModifyGatewayBlockVolumeRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ModifyGatewayBlockVolumeRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public ModifyGatewayBlockVolumeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
