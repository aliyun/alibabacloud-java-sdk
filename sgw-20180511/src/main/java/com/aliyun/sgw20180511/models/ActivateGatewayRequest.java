// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ActivateGatewayRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("ClientUUID")
    public String clientUUID;

    @NameInMap("Model")
    public String model;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("Token")
    public String token;

    @NameInMap("Type")
    public String type;

    public static ActivateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateGatewayRequest self = new ActivateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ActivateGatewayRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ActivateGatewayRequest setClientUUID(String clientUUID) {
        this.clientUUID = clientUUID;
        return this;
    }
    public String getClientUUID() {
        return this.clientUUID;
    }

    public ActivateGatewayRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ActivateGatewayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ActivateGatewayRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ActivateGatewayRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ActivateGatewayRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
