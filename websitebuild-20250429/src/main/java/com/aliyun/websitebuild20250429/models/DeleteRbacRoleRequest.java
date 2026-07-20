// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteRbacRoleRequest extends TeaModel {
    /**
     * <p>The business ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The role ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75b2f16f-35a5-4e90-949f-295ea14a4dc8</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    public static DeleteRbacRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRbacRoleRequest self = new DeleteRbacRoleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRbacRoleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeleteRbacRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
