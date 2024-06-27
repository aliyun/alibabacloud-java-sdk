// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationRoleConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111111111</p>
     */
    @NameInMap("RoleId")
    public Long roleId;

    public static QueryOrganizationRoleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationRoleConfigRequest self = new QueryOrganizationRoleConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrganizationRoleConfigRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

}
