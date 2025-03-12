// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUserRolesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of roles of the user.<br>Valid values: </p>
     * <p>ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES.
     * ReadOnly: a role that has only the read-only privilege SELECT.
     * DDL: a role that has DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW.
     * DML: a role that has DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.</p>
     */
    @NameInMap("Role")
    public java.util.List<String> role;

    public static DescribeTenantUserRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantUserRolesResponseBody self = new DescribeTenantUserRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantUserRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantUserRolesResponseBody setRole(java.util.List<String> role) {
        this.role = role;
        return this;
    }
    public java.util.List<String> getRole() {
        return this.role;
    }

}
