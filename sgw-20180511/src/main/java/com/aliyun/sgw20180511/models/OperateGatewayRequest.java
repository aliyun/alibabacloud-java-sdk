// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class OperateGatewayRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("OperateAction")
    public String operateAction;

    @NameInMap("Params")
    public String params;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static OperateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateGatewayRequest self = new OperateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public OperateGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public OperateGatewayRequest setOperateAction(String operateAction) {
        this.operateAction = operateAction;
        return this;
    }
    public String getOperateAction() {
        return this.operateAction;
    }

    public OperateGatewayRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public OperateGatewayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
