// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUserPermissionsRequest extends TeaModel {
    /**
     * <p>The ID of a RAM user or RAM role.</p>
     */
    @NameInMap("SubAccountUserId")
    public String subAccountUserId;

    public static DescribeUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserPermissionsRequest self = new DescribeUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserPermissionsRequest setSubAccountUserId(String subAccountUserId) {
        this.subAccountUserId = subAccountUserId;
        return this;
    }
    public String getSubAccountUserId() {
        return this.subAccountUserId;
    }

}
