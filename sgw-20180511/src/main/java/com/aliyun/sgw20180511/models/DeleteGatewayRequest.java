// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteGatewayRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("ReasonDetail")
    public String reasonDetail;

    @NameInMap("ReasonType")
    public String reasonType;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayRequest self = new DeleteGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DeleteGatewayRequest setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
        return this;
    }
    public String getReasonDetail() {
        return this.reasonDetail;
    }

    public DeleteGatewayRequest setReasonType(String reasonType) {
        this.reasonType = reasonType;
        return this;
    }
    public String getReasonType() {
        return this.reasonType;
    }

    public DeleteGatewayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
