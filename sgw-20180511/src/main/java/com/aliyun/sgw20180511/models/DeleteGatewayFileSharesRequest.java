// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteGatewayFileSharesRequest extends TeaModel {
    @NameInMap("Force")
    public Boolean force;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteGatewayFileSharesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayFileSharesRequest self = new DeleteGatewayFileSharesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayFileSharesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteGatewayFileSharesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DeleteGatewayFileSharesRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public DeleteGatewayFileSharesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
