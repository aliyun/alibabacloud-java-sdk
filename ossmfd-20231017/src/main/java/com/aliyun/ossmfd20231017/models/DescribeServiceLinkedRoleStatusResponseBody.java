// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E99D386F-5546-5BCD-BADD-F4EF4B******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
