// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeployCacheDiskRequest extends TeaModel {
    @NameInMap("CacheConfig")
    public String cacheConfig;

    @NameInMap("DiskCategory")
    public String diskCategory;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SizeInGB")
    public Integer sizeInGB;

    public static DeployCacheDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployCacheDiskRequest self = new DeployCacheDiskRequest();
        return TeaModel.build(map, self);
    }

    public DeployCacheDiskRequest setCacheConfig(String cacheConfig) {
        this.cacheConfig = cacheConfig;
        return this;
    }
    public String getCacheConfig() {
        return this.cacheConfig;
    }

    public DeployCacheDiskRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public DeployCacheDiskRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DeployCacheDiskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeployCacheDiskRequest setSizeInGB(Integer sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }
    public Integer getSizeInGB() {
        return this.sizeInGB;
    }

}
