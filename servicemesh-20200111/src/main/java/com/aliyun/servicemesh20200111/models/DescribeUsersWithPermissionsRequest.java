// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUsersWithPermissionsRequest extends TeaModel {
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
