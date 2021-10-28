// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ReportGatewayInfoRequest extends TeaModel {
    @NameInMap("ClientUUID")
    public String clientUUID;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("GatewayStatus")
    public String gatewayStatus;

    @NameInMap("Info")
    public String info;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Time")
    public Long time;

    public static ReportGatewayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportGatewayInfoRequest self = new ReportGatewayInfoRequest();
        return TeaModel.build(map, self);
    }

    public ReportGatewayInfoRequest setClientUUID(String clientUUID) {
        this.clientUUID = clientUUID;
        return this;
    }
    public String getClientUUID() {
        return this.clientUUID;
    }

    public ReportGatewayInfoRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportGatewayInfoRequest setGatewayStatus(String gatewayStatus) {
        this.gatewayStatus = gatewayStatus;
        return this;
    }
    public String getGatewayStatus() {
        return this.gatewayStatus;
    }

    public ReportGatewayInfoRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public ReportGatewayInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportGatewayInfoRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}
