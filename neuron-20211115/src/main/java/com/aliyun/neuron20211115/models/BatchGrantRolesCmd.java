// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class BatchGrantRolesCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("roleIds")
    public java.util.List<Long> roleIds;

    public static BatchGrantRolesCmd build(java.util.Map<String, ?> map) throws Exception {
        BatchGrantRolesCmd self = new BatchGrantRolesCmd();
        return TeaModel.build(map, self);
    }

    public BatchGrantRolesCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BatchGrantRolesCmd setRoleIds(java.util.List<Long> roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public java.util.List<Long> getRoleIds() {
        return this.roleIds;
    }

}
