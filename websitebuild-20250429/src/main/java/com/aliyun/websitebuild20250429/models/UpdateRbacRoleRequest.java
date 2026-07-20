// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateRbacRoleRequest extends TeaModel {
    /**
     * <p>The application instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The role data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;customer&quot;,&quot;label&quot;:&quot;xx1
     * &quot;,&quot;is_default&quot;:true,&quot;is_system&quot;:false}</p>
     */
    @NameInMap("RoleData")
    public String roleData;

    /**
     * <p>The role ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ly-online</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    public static UpdateRbacRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRbacRoleRequest self = new UpdateRbacRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRbacRoleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateRbacRoleRequest setRoleData(String roleData) {
        this.roleData = roleData;
        return this;
    }
    public String getRoleData() {
        return this.roleData;
    }

    public UpdateRbacRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
