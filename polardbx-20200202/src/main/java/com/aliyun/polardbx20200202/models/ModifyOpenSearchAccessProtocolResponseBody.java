// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyOpenSearchAccessProtocolResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response message. &quot;success&quot; is returned for a successful request. An error code is returned for a failed request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The backend protocol. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP</strong> (default): supports association with HTTPS, HTTP, and QUIC listeners.</p>
     * </li>
     * <li><p><strong>HTTPS</strong>: supports association with HTTPS listeners.</p>
     * </li>
     * <li><p><strong>gRPC</strong>: supports association with HTTPS and QUIC listeners.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If <strong>ServerGroupType</strong> is set to <strong>Fc</strong>, you do not need to configure the backend protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>icmp</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOpenSearchAccessProtocolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOpenSearchAccessProtocolResponseBody self = new ModifyOpenSearchAccessProtocolResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOpenSearchAccessProtocolResponseBody setAccessDeniedDetail(ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyOpenSearchAccessProtocolResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyOpenSearchAccessProtocolResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ModifyOpenSearchAccessProtocolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The identity type used for authentication in the request. Valid values:</p>
         * <ul>
         * <li>SubUser: RAM user</li>
         * <li>AssumedRoleUser: RAM role</li>
         * <li>Federated: SSO federated identity</li>
         * </ul>
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

        public static ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail self = new ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ModifyOpenSearchAccessProtocolResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
