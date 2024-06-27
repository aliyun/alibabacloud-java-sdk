// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorkspaceRoleConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("RoleId")
    public Long roleId;

    public static QueryWorkspaceRoleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkspaceRoleConfigRequest self = new QueryWorkspaceRoleConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorkspaceRoleConfigRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

}
