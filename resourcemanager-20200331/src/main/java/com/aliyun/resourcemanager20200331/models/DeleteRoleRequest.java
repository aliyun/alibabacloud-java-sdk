// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteRoleRequest extends TeaModel {
    /**
     * <p>The name of the RAM role.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static DeleteRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoleRequest self = new DeleteRoleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
