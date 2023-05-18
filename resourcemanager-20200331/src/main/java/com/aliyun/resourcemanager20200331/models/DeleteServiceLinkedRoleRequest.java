// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteServiceLinkedRoleRequest extends TeaModel {
    /**
     * <p>The name of the role.</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static DeleteServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceLinkedRoleRequest self = new DeleteServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceLinkedRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
