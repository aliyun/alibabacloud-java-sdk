// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleExistsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the service-linked role has been authorized for the current account. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Authorized.</p>
     * </li>
     * <li><p><strong>false</strong>: Not authorized.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExistsServiceLinkedRole")
    public Boolean existsServiceLinkedRole;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90B82DB7-FB28-4CC2-ADBF-1F8659F3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceLinkedRoleExistsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLinkedRoleExistsResponseBody self = new DescribeServiceLinkedRoleExistsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLinkedRoleExistsResponseBody setExistsServiceLinkedRole(Boolean existsServiceLinkedRole) {
        this.existsServiceLinkedRole = existsServiceLinkedRole;
        return this;
    }
    public Boolean getExistsServiceLinkedRole() {
        return this.existsServiceLinkedRole;
    }

    public DescribeServiceLinkedRoleExistsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
