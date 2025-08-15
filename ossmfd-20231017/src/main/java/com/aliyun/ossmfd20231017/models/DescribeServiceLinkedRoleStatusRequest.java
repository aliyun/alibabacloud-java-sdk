// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForOssMfd</p>
     */
    @NameInMap("ServiceLinkedRole")
    public String serviceLinkedRole;

    public static DescribeServiceLinkedRoleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLinkedRoleStatusRequest self = new DescribeServiceLinkedRoleStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLinkedRoleStatusRequest setServiceLinkedRole(String serviceLinkedRole) {
        this.serviceLinkedRole = serviceLinkedRole;
        return this;
    }
    public String getServiceLinkedRole() {
        return this.serviceLinkedRole;
    }

}
