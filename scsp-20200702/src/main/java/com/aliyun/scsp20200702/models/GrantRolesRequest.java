// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GrantRolesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("RoleId")
    public java.util.List<Long> roleId;

    public static GrantRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantRolesRequest self = new GrantRolesRequest();
        return TeaModel.build(map, self);
    }

    public GrantRolesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GrantRolesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GrantRolesRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GrantRolesRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public GrantRolesRequest setRoleId(java.util.List<Long> roleId) {
        this.roleId = roleId;
        return this;
    }
    public java.util.List<Long> getRoleId() {
        return this.roleId;
    }

}
