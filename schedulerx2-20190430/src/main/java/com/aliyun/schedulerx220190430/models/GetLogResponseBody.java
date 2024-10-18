// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetLogResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public GetLogResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetLogResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     * 
     * <strong>example:</strong>
     * <p>jobid=xxx is not existed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39090022-1F3B-4797-8518-6B61095F1AF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogResponseBody self = new GetLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogResponseBody setAccessDeniedDetail(GetLogResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public GetLogResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetLogResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetLogResponseBody setData(GetLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLogResponseBodyData getData() {
        return this.data;
    }

    public GetLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLogResponseBodyAccessDeniedDetail extends TeaModel {
        @NameInMap("AuthAction")
        public String authAction;

        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        @NameInMap("NoPermissionType")
        public String noPermissionType;

        @NameInMap("PolicyType")
        public String policyType;

        public static GetLogResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetLogResponseBodyAccessDeniedDetail self = new GetLogResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetLogResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetLogResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetLogResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetLogResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetLogResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetLogResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetLogResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetLogResponseBodyData extends TeaModel {
        /**
         * <p>The logs. The value is an array of strings.</p>
         */
        @NameInMap("Logs")
        public java.util.List<String> logs;

        public static GetLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLogResponseBodyData self = new GetLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLogResponseBodyData setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

    }

}
