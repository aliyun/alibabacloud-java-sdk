// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ExecuteMetaQueryResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ExecuteMetaQueryResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The instance details.</p>
     */
    @NameInMap("Data")
    public ExecuteMetaQueryResponseBodyData data;

    /**
     * <p>The additional information returned. If the request is successful, success is returned. If the request fails, the corresponding error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ExecuteMetaQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteMetaQueryResponseBody self = new ExecuteMetaQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteMetaQueryResponseBody setAccessDeniedDetail(ExecuteMetaQueryResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ExecuteMetaQueryResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ExecuteMetaQueryResponseBody setData(ExecuteMetaQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteMetaQueryResponseBodyData getData() {
        return this.data;
    }

    public ExecuteMetaQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteMetaQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteMetaQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteMetaQueryResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The description is the same as above.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The description is the same as above.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The diagnostic information.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>NoPermissionType</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>PolicyType</p>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ExecuteMetaQueryResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ExecuteMetaQueryResponseBodyAccessDeniedDetail self = new ExecuteMetaQueryResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ExecuteMetaQueryResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ExecuteMetaQueryResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ExecuteMetaQueryResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ExecuteMetaQueryResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ExecuteMetaQueryResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ExecuteMetaQueryResponseBodyData extends TeaModel {
        /**
         * <p>The column names.</p>
         */
        @NameInMap("Columns")
        public java.util.List<String> columns;

        /**
         * <p>The total number of data rows.</p>
         * 
         * <strong>example:</strong>
         * <p>97901</p>
         */
        @NameInMap("RowCount")
        public Integer rowCount;

        /**
         * <p>The number of affected or returned rows. This field is available only for compute nodes (CNs).</p>
         */
        @NameInMap("Rows")
        public java.util.List<java.util.Map<String, ?>> rows;

        public static ExecuteMetaQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteMetaQueryResponseBodyData self = new ExecuteMetaQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteMetaQueryResponseBodyData setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public ExecuteMetaQueryResponseBodyData setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public ExecuteMetaQueryResponseBodyData setRows(java.util.List<java.util.Map<String, ?>> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getRows() {
            return this.rows;
        }

    }

}
