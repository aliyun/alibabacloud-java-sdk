// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateRbacRoleRequest extends TeaModel {
    /**
     * <p>The business ID of the customer.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250731233102000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The role data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;customer&quot;,&quot;label&quot;:&quot;xx
     * &quot;,&quot;is_default&quot;:true,&quot;is_system&quot;:false}</p>
     */
    @NameInMap("RoleData")
    public String roleData;

    public static CreateRbacRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRbacRoleRequest self = new CreateRbacRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRbacRoleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateRbacRoleRequest setRoleData(String roleData) {
        this.roleData = roleData;
        return this;
    }
    public String getRoleData() {
        return this.roleData;
    }

}
