// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RoleGrantCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("authorizationResourceList")
    public java.util.List<AuthorizationResource> authorizationResourceList;

    @NameInMap("roleId")
    public Long roleId;

    public static RoleGrantCmd build(java.util.Map<String, ?> map) throws Exception {
        RoleGrantCmd self = new RoleGrantCmd();
        return TeaModel.build(map, self);
    }

    public RoleGrantCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public RoleGrantCmd setAuthorizationResourceList(java.util.List<AuthorizationResource> authorizationResourceList) {
        this.authorizationResourceList = authorizationResourceList;
        return this;
    }
    public java.util.List<AuthorizationResource> getAuthorizationResourceList() {
        return this.authorizationResourceList;
    }

    public RoleGrantCmd setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

}
