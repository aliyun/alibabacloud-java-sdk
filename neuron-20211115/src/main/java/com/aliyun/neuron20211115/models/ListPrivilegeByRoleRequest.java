// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPrivilegeByRoleRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    public static ListPrivilegeByRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivilegeByRoleRequest self = new ListPrivilegeByRoleRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivilegeByRoleRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
