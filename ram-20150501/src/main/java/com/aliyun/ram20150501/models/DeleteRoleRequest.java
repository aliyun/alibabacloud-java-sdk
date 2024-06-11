// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteRoleRequest extends TeaModel {
    /**
     * <p>The name of the RAM role.</p>
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
