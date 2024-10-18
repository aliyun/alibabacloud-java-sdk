// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateWorkflowResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public UpdateWorkflowResponseBodyAccessDeniedDetail accessDeniedDetail;

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
     * <p>timetype is invalid</p>
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

    public static UpdateWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowResponseBody self = new UpdateWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowResponseBody setAccessDeniedDetail(UpdateWorkflowResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public UpdateWorkflowResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateWorkflowResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateWorkflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateWorkflowResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static UpdateWorkflowResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowResponseBodyAccessDeniedDetail self = new UpdateWorkflowResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public UpdateWorkflowResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public UpdateWorkflowResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public UpdateWorkflowResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public UpdateWorkflowResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public UpdateWorkflowResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public UpdateWorkflowResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
