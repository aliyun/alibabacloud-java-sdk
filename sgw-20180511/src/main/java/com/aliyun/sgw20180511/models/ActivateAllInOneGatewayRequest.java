// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ActivateAllInOneGatewayRequest extends TeaModel {
    @NameInMap("ClientUUID")
    public String clientUUID;

    @NameInMap("DeviceNumber")
    public String deviceNumber;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Model")
    public String model;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SerialNumber")
    public String serialNumber;

    public static ActivateAllInOneGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateAllInOneGatewayRequest self = new ActivateAllInOneGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ActivateAllInOneGatewayRequest setClientUUID(String clientUUID) {
        this.clientUUID = clientUUID;
        return this;
    }
    public String getClientUUID() {
        return this.clientUUID;
    }

    public ActivateAllInOneGatewayRequest setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
        return this;
    }
    public String getDeviceNumber() {
        return this.deviceNumber;
    }

    public ActivateAllInOneGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ActivateAllInOneGatewayRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ActivateAllInOneGatewayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ActivateAllInOneGatewayRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
