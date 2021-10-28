// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class RemoveTagsFromGatewayRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Tags")
    public String tags;

    public static RemoveTagsFromGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsFromGatewayRequest self = new RemoveTagsFromGatewayRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTagsFromGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public RemoveTagsFromGatewayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RemoveTagsFromGatewayRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
