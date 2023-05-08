// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUsersWithPermissionsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDs of the RAM users or RAM roles to which an RBAC role is assigned.</p>
     */
    @NameInMap("UIDs")
    public java.util.List<String> UIDs;

    public static DescribeUsersWithPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersWithPermissionsResponseBody self = new DescribeUsersWithPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsersWithPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUsersWithPermissionsResponseBody setUIDs(java.util.List<String> UIDs) {
        this.UIDs = UIDs;
        return this;
    }
    public java.util.List<String> getUIDs() {
        return this.UIDs;
    }

}
