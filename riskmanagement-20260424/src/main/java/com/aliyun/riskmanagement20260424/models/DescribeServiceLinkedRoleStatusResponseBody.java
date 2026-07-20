// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeServiceLinkedRoleStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EF972A16-95FB-5EF2-9CED-208A74DEF040</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>7F14E3C8-A6AA-5D3C-B7E0-ABA2AC171EFC</p>
         */
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
