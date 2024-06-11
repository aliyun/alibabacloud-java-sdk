// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForRoleRequest extends TeaModel {
    /**
     * <p>The name of the RAM role.</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static ListPoliciesForRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForRoleRequest self = new ListPoliciesForRoleRequest();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
