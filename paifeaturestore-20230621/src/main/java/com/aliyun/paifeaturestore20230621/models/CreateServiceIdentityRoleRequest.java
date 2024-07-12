// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateServiceIdentityRoleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForFeatureStore</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static CreateServiceIdentityRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceIdentityRoleRequest self = new CreateServiceIdentityRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceIdentityRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
