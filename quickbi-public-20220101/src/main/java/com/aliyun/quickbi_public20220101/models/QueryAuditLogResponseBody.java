// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryAuditLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>78C1AA2D-9201-599E-A0BA-6FC462E57A95</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryAuditLogResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAuditLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuditLogResponseBody self = new QueryAuditLogResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuditLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuditLogResponseBody setResult(java.util.List<QueryAuditLogResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryAuditLogResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryAuditLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAuditLogResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-04-16 13:17:39</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>wukaibis</p>
         */
        @NameInMap("OperatorAccountName")
        public String operatorAccountName;

        /**
         * <strong>example:</strong>
         * <p>buc_344078</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        @NameInMap("TargetName")
        public String targetName;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <strong>example:</strong>
         * <p>87c6b145-090c-43e1-9426-8f93be23****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryAuditLogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryAuditLogResponseBodyResult self = new QueryAuditLogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryAuditLogResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryAuditLogResponseBodyResult setOperatorAccountName(String operatorAccountName) {
            this.operatorAccountName = operatorAccountName;
            return this;
        }
        public String getOperatorAccountName() {
            return this.operatorAccountName;
        }

        public QueryAuditLogResponseBodyResult setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public QueryAuditLogResponseBodyResult setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public QueryAuditLogResponseBodyResult setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public QueryAuditLogResponseBodyResult setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public QueryAuditLogResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
