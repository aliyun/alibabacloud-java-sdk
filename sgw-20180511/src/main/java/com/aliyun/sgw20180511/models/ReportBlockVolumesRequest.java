// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ReportBlockVolumesRequest extends TeaModel {
    @NameInMap("ClientUUID")
    public String clientUUID;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Info")
    public String info;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ReportBlockVolumesRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportBlockVolumesRequest self = new ReportBlockVolumesRequest();
        return TeaModel.build(map, self);
    }

    public ReportBlockVolumesRequest setClientUUID(String clientUUID) {
        this.clientUUID = clientUUID;
        return this;
    }
    public String getClientUUID() {
        return this.clientUUID;
    }

    public ReportBlockVolumesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportBlockVolumesRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public ReportBlockVolumesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
