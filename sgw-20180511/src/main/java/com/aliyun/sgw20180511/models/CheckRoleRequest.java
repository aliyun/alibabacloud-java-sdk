// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckRoleRequest extends TeaModel {
    @NameInMap("RoleType")
    public String roleType;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRoleRequest self = new CheckRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckRoleRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public CheckRoleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
