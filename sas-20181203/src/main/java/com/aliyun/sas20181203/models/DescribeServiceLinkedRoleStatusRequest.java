// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleStatusRequest extends TeaModel {
    // The service-linked role. Default value: **AliyunServiceRoleForSas**. Valid values:
    // 
    // *   **AliyunServiceRoleForSas**: the service-linked role of Security Center. Security Center assumes this role to access the resources of other cloud services within your account.
    // *   **AliyunServiceRoleForSasCspm**: the service-linked role of Security Center-CSPM. Security Center-CSPM assumes this role to access the resources of other cloud services within your account.
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
