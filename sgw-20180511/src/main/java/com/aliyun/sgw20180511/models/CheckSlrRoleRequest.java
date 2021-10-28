// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckSlrRoleRequest extends TeaModel {
    @NameInMap("CreateIfNotExist")
    public Boolean createIfNotExist;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckSlrRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSlrRoleRequest self = new CheckSlrRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckSlrRoleRequest setCreateIfNotExist(Boolean createIfNotExist) {
        this.createIfNotExist = createIfNotExist;
        return this;
    }
    public Boolean getCreateIfNotExist() {
        return this.createIfNotExist;
    }

    public CheckSlrRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public CheckSlrRoleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
