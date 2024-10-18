// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class SetJobInstanceSuccessResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public SetJobInstanceSuccessResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned error message.</p>
     * 
     * <strong>example:</strong>
     * <p>jobId=xxx is not existed</p>
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

    public static SetJobInstanceSuccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetJobInstanceSuccessResponseBody self = new SetJobInstanceSuccessResponseBody();
        return TeaModel.build(map, self);
    }

    public SetJobInstanceSuccessResponseBody setAccessDeniedDetail(SetJobInstanceSuccessResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public SetJobInstanceSuccessResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SetJobInstanceSuccessResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SetJobInstanceSuccessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetJobInstanceSuccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetJobInstanceSuccessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetJobInstanceSuccessResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static SetJobInstanceSuccessResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            SetJobInstanceSuccessResponseBodyAccessDeniedDetail self = new SetJobInstanceSuccessResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public SetJobInstanceSuccessResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public SetJobInstanceSuccessResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public SetJobInstanceSuccessResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public SetJobInstanceSuccessResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public SetJobInstanceSuccessResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public SetJobInstanceSuccessResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public SetJobInstanceSuccessResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
