// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeUserRolesResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 可授予的角色权限列表信息。
    @NameInMap("Role")
    public java.util.List<String> role;

    public static DescribeUserRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserRolesResponseBody self = new DescribeUserRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserRolesResponseBody setRole(java.util.List<String> role) {
        this.role = role;
        return this;
    }
    public java.util.List<String> getRole() {
        return this.role;
    }

}
