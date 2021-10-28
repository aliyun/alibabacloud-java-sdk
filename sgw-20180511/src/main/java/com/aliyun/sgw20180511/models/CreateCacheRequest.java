// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateCacheRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SizeInGB")
    public Long sizeInGB;

    public static CreateCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCacheRequest self = new CreateCacheRequest();
        return TeaModel.build(map, self);
    }

    public CreateCacheRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateCacheRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateCacheRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateCacheRequest setSizeInGB(Long sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }
    public Long getSizeInGB() {
        return this.sizeInGB;
    }

}
