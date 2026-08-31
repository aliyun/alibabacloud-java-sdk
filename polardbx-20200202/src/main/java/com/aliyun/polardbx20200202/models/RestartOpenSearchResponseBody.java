// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RestartOpenSearchResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public RestartOpenSearchResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public RestartOpenSearchResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AE4F6C34-065F-45AA-B5DC-4B8D816F6305</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartOpenSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartOpenSearchResponseBody self = new RestartOpenSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartOpenSearchResponseBody setAccessDeniedDetail(RestartOpenSearchResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public RestartOpenSearchResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public RestartOpenSearchResponseBody setData(RestartOpenSearchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RestartOpenSearchResponseBodyData getData() {
        return this.data;
    }

    public RestartOpenSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RestartOpenSearchResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The type of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
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
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static RestartOpenSearchResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            RestartOpenSearchResponseBodyAccessDeniedDetail self = new RestartOpenSearchResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public RestartOpenSearchResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public RestartOpenSearchResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public RestartOpenSearchResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public RestartOpenSearchResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public RestartOpenSearchResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public RestartOpenSearchResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public RestartOpenSearchResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class RestartOpenSearchResponseBodyData extends TeaModel {
        /**
         * <p>The backend task ID.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static RestartOpenSearchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RestartOpenSearchResponseBodyData self = new RestartOpenSearchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RestartOpenSearchResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
