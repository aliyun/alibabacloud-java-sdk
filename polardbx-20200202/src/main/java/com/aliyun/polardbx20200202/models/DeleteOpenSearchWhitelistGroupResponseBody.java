// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteOpenSearchWhitelistGroupResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The monitoring data.</p>
     */
    @NameInMap("Data")
    public DeleteOpenSearchWhitelistGroupResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B87E2AB3-B7C9-4394-9160-7F639F732031</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOpenSearchWhitelistGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenSearchWhitelistGroupResponseBody self = new DeleteOpenSearchWhitelistGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOpenSearchWhitelistGroupResponseBody setAccessDeniedDetail(DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteOpenSearchWhitelistGroupResponseBody setData(DeleteOpenSearchWhitelistGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteOpenSearchWhitelistGroupResponseBodyData getData() {
        return this.data;
    }

    public DeleteOpenSearchWhitelistGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The diagnostic information.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of the permission denial.</p>
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
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail self = new DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DeleteOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DeleteOpenSearchWhitelistGroupResponseBodyData extends TeaModel {
        /**
         * <p>The response message. &quot;success&quot; is returned if the request is successful. Otherwise, the corresponding error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>get app list success</p>
         */
        @NameInMap("Message")
        public String message;

        public static DeleteOpenSearchWhitelistGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteOpenSearchWhitelistGroupResponseBodyData self = new DeleteOpenSearchWhitelistGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteOpenSearchWhitelistGroupResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
