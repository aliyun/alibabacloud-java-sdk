// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>39CE98F4-88C0-4539-B906-6B542E5C07B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status information about the service-linked role.</p>
     */
    @NameInMap("RoleStatus")
    public DescribeServiceLinkedRoleStatusResponseBodyRoleStatus roleStatus;

    public static DescribeServiceLinkedRoleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLinkedRoleStatusResponseBody self = new DescribeServiceLinkedRoleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLinkedRoleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceLinkedRoleStatusResponseBody setRoleStatus(DescribeServiceLinkedRoleStatusResponseBodyRoleStatus roleStatus) {
        this.roleStatus = roleStatus;
        return this;
    }
    public DescribeServiceLinkedRoleStatusResponseBodyRoleStatus getRoleStatus() {
        return this.roleStatus;
    }

    public static class DescribeServiceLinkedRoleStatusResponseBodyRoleStatus extends TeaModel {
        /**
         * <p>Indicates whether the service-linked role is created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        public static DescribeServiceLinkedRoleStatusResponseBodyRoleStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceLinkedRoleStatusResponseBodyRoleStatus self = new DescribeServiceLinkedRoleStatusResponseBodyRoleStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceLinkedRoleStatusResponseBodyRoleStatus setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
