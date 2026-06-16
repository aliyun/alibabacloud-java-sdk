// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeServiceLinkedRoleStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeServiceLinkedRoleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLinkedRoleStatusResponseBody self = new DescribeServiceLinkedRoleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLinkedRoleStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeServiceLinkedRoleStatusResponseBody setData(DescribeServiceLinkedRoleStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeServiceLinkedRoleStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeServiceLinkedRoleStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeServiceLinkedRoleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceLinkedRoleStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeServiceLinkedRoleStatusResponseBodyDataBodyRoleStatus extends TeaModel {
        @NameInMap("Status")
        public Boolean status;

        public static DescribeServiceLinkedRoleStatusResponseBodyDataBodyRoleStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceLinkedRoleStatusResponseBodyDataBodyRoleStatus self = new DescribeServiceLinkedRoleStatusResponseBodyDataBodyRoleStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceLinkedRoleStatusResponseBodyDataBodyRoleStatus setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

    public static class DescribeServiceLinkedRoleStatusResponseBodyDataBody extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("RoleStatus")
        public DescribeServiceLinkedRoleStatusResponseBodyDataBodyRoleStatus roleStatus;

        public static DescribeServiceLinkedRoleStatusResponseBodyDataBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceLinkedRoleStatusResponseBodyDataBody self = new DescribeServiceLinkedRoleStatusResponseBodyDataBody();
            return TeaModel.build(map, self);
        }

        public DescribeServiceLinkedRoleStatusResponseBodyDataBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeServiceLinkedRoleStatusResponseBodyDataBody setRoleStatus(DescribeServiceLinkedRoleStatusResponseBodyDataBodyRoleStatus roleStatus) {
            this.roleStatus = roleStatus;
            return this;
        }
        public DescribeServiceLinkedRoleStatusResponseBodyDataBodyRoleStatus getRoleStatus() {
            return this.roleStatus;
        }

    }

    public static class DescribeServiceLinkedRoleStatusResponseBodyData extends TeaModel {
        @NameInMap("Body")
        public DescribeServiceLinkedRoleStatusResponseBodyDataBody body;

        public static DescribeServiceLinkedRoleStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceLinkedRoleStatusResponseBodyData self = new DescribeServiceLinkedRoleStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeServiceLinkedRoleStatusResponseBodyData setBody(DescribeServiceLinkedRoleStatusResponseBodyDataBody body) {
            this.body = body;
            return this;
        }
        public DescribeServiceLinkedRoleStatusResponseBodyDataBody getBody() {
            return this.body;
        }

    }

}
