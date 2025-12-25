// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetPackSceneTaskStatusResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public GetPackSceneTaskStatusResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetPackSceneTaskStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A8CD0AD9-8A92-455A-A984-A7E4B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPackSceneTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPackSceneTaskStatusResponseBody self = new GetPackSceneTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPackSceneTaskStatusResponseBody setAccessDeniedDetail(GetPackSceneTaskStatusResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public GetPackSceneTaskStatusResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetPackSceneTaskStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetPackSceneTaskStatusResponseBody setData(GetPackSceneTaskStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPackSceneTaskStatusResponseBodyData getData() {
        return this.data;
    }

    public GetPackSceneTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPackSceneTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPackSceneTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPackSceneTaskStatusResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static GetPackSceneTaskStatusResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetPackSceneTaskStatusResponseBodyAccessDeniedDetail self = new GetPackSceneTaskStatusResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetPackSceneTaskStatusResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetPackSceneTaskStatusResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetPackSceneTaskStatusResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetPackSceneTaskStatusResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetPackSceneTaskStatusResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetPackSceneTaskStatusResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetPackSceneTaskStatusResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetPackSceneTaskStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Long progress;

        /**
         * <strong>example:</strong>
         * <p>succeed</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetPackSceneTaskStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPackSceneTaskStatusResponseBodyData self = new GetPackSceneTaskStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPackSceneTaskStatusResponseBodyData setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public GetPackSceneTaskStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
