// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ReportFileSharesRequest extends TeaModel {
    @NameInMap("ClientUUID")
    public String clientUUID;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Info")
    public String info;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ReportFileSharesRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportFileSharesRequest self = new ReportFileSharesRequest();
        return TeaModel.build(map, self);
    }

    public ReportFileSharesRequest setClientUUID(String clientUUID) {
        this.clientUUID = clientUUID;
        return this;
    }
    public String getClientUUID() {
        return this.clientUUID;
    }

    public ReportFileSharesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportFileSharesRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public ReportFileSharesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
