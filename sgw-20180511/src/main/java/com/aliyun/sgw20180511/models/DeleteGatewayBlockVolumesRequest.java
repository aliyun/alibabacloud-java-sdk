// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteGatewayBlockVolumesRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("IsSourceDeletion")
    public Boolean isSourceDeletion;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteGatewayBlockVolumesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayBlockVolumesRequest self = new DeleteGatewayBlockVolumesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayBlockVolumesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DeleteGatewayBlockVolumesRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public DeleteGatewayBlockVolumesRequest setIsSourceDeletion(Boolean isSourceDeletion) {
        this.isSourceDeletion = isSourceDeletion;
        return this;
    }
    public Boolean getIsSourceDeletion() {
        return this.isSourceDeletion;
    }

    public DeleteGatewayBlockVolumesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
