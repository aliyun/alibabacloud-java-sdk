// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyGatewayRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Name")
    public String name;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayRequest self = new ModifyGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ModifyGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyGatewayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
