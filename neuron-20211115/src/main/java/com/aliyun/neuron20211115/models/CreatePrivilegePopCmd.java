// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePrivilegePopCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("actions")
    public String actions;

    @NameInMap("resource")
    public String resource;

    @NameInMap("roleId")
    public Long roleId;

    public static CreatePrivilegePopCmd build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivilegePopCmd self = new CreatePrivilegePopCmd();
        return TeaModel.build(map, self);
    }

    public CreatePrivilegePopCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreatePrivilegePopCmd setActions(String actions) {
        this.actions = actions;
        return this;
    }
    public String getActions() {
        return this.actions;
    }

    public CreatePrivilegePopCmd setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreatePrivilegePopCmd setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

}
