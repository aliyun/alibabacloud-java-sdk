// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUserRolesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
