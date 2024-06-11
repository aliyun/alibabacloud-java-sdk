// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetRoleRequest extends TeaModel {
    /**
     * <p>The name of the RAM role.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static GetRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoleRequest self = new GetRoleRequest();
        return TeaModel.build(map, self);
    }

    public GetRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
