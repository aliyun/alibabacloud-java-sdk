// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CheckDeveloperRoleRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("roleName")
    public String roleName;

    public static CheckDeveloperRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDeveloperRoleRequest self = new CheckDeveloperRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckDeveloperRoleRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CheckDeveloperRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
