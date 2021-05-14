// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleStatusResponseBody extends TeaModel {
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
