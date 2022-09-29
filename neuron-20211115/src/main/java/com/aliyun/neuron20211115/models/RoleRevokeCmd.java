// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RoleRevokeCmd extends TeaModel {
    @NameInMap("authorizerId")
    public String authorizerId;

    @NameInMap("authorizerType")
    public String authorizerType;

    @NameInMap("roleId")
    public Long roleId;

    public static RoleRevokeCmd build(java.util.Map<String, ?> map) throws Exception {
        RoleRevokeCmd self = new RoleRevokeCmd();
        return TeaModel.build(map, self);
    }

    public RoleRevokeCmd setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    public RoleRevokeCmd setAuthorizerType(String authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }
    public String getAuthorizerType() {
        return this.authorizerType;
    }

    public RoleRevokeCmd setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

}
