// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUsersWithPermissionsRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the IDs of all RAM users or RAM roles to which an RBAC role is assigned. Valid values:</p>
     * <br>
     * <p>*   `SubUser`: Query the IDs of all RAM users to which an RBAC role is assigned.</p>
     * <p>*   `RamRole`: Query the IDs of all RAM roles to which an RBAC role is assigned.</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static DescribeUsersWithPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersWithPermissionsRequest self = new DescribeUsersWithPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsersWithPermissionsRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
