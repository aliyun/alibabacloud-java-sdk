// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteRouteStrategyResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public DeleteRouteStrategyResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>strategy is already deleted.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>71BCC0E3-64B2-4B63-A870-AFB64EBCB5A7</p>
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

    public static DeleteRouteStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteStrategyResponseBody self = new DeleteRouteStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRouteStrategyResponseBody setAccessDeniedDetail(DeleteRouteStrategyResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DeleteRouteStrategyResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteRouteStrategyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteRouteStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteRouteStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRouteStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteRouteStrategyResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static DeleteRouteStrategyResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DeleteRouteStrategyResponseBodyAccessDeniedDetail self = new DeleteRouteStrategyResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DeleteRouteStrategyResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DeleteRouteStrategyResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DeleteRouteStrategyResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DeleteRouteStrategyResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DeleteRouteStrategyResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DeleteRouteStrategyResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DeleteRouteStrategyResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
