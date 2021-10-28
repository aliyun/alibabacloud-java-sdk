// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewayCacheDiskRequest extends TeaModel {
    @NameInMap("CacheDiskCategory")
    public String cacheDiskCategory;

    @NameInMap("CacheDiskSizeInGB")
    public Long cacheDiskSizeInGB;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateGatewayCacheDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayCacheDiskRequest self = new CreateGatewayCacheDiskRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayCacheDiskRequest setCacheDiskCategory(String cacheDiskCategory) {
        this.cacheDiskCategory = cacheDiskCategory;
        return this;
    }
    public String getCacheDiskCategory() {
        return this.cacheDiskCategory;
    }

    public CreateGatewayCacheDiskRequest setCacheDiskSizeInGB(Long cacheDiskSizeInGB) {
        this.cacheDiskSizeInGB = cacheDiskSizeInGB;
        return this;
    }
    public Long getCacheDiskSizeInGB() {
        return this.cacheDiskSizeInGB;
    }

    public CreateGatewayCacheDiskRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateGatewayCacheDiskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
