// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetCopySceneTaskStatusResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public GetCopySceneTaskStatusResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetCopySceneTaskStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A8CD0AD9-8A92-455A-A984-A7E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCopySceneTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCopySceneTaskStatusResponseBody self = new GetCopySceneTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCopySceneTaskStatusResponseBody setAccessDeniedDetail(GetCopySceneTaskStatusResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public GetCopySceneTaskStatusResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetCopySceneTaskStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetCopySceneTaskStatusResponseBody setData(GetCopySceneTaskStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCopySceneTaskStatusResponseBodyData getData() {
        return this.data;
    }

    public GetCopySceneTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCopySceneTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCopySceneTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCopySceneTaskStatusResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static GetCopySceneTaskStatusResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetCopySceneTaskStatusResponseBodyAccessDeniedDetail self = new GetCopySceneTaskStatusResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetCopySceneTaskStatusResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetCopySceneTaskStatusResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetCopySceneTaskStatusResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetCopySceneTaskStatusResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetCopySceneTaskStatusResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetCopySceneTaskStatusResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetCopySceneTaskStatusResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetCopySceneTaskStatusResponseBodyData extends TeaModel {
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

        public static GetCopySceneTaskStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCopySceneTaskStatusResponseBodyData self = new GetCopySceneTaskStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCopySceneTaskStatusResponseBodyData setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public GetCopySceneTaskStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
