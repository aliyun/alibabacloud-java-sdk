// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacRoleRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("RoleId")
    public String roleId;

    public static QueryRbacRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRbacRoleRequest self = new QueryRbacRoleRequest();
        return TeaModel.build(map, self);
    }

    public QueryRbacRoleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryRbacRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
