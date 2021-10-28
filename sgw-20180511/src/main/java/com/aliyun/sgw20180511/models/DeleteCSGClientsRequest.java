// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteCSGClientsRequest extends TeaModel {
    @NameInMap("ClientIds")
    public java.util.List<String> clientIds;

    @NameInMap("ClientRegionId")
    public String clientRegionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteCSGClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCSGClientsRequest self = new DeleteCSGClientsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCSGClientsRequest setClientIds(java.util.List<String> clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public java.util.List<String> getClientIds() {
        return this.clientIds;
    }

    public DeleteCSGClientsRequest setClientRegionId(String clientRegionId) {
        this.clientRegionId = clientRegionId;
        return this;
    }
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    public DeleteCSGClientsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
