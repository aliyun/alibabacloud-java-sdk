// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePxfsAccessTokenResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public CreatePxfsAccessTokenResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public CreatePxfsAccessTokenResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePxfsAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePxfsAccessTokenResponseBody self = new CreatePxfsAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePxfsAccessTokenResponseBody setAccessDeniedDetail(CreatePxfsAccessTokenResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public CreatePxfsAccessTokenResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreatePxfsAccessTokenResponseBody setData(CreatePxfsAccessTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePxfsAccessTokenResponseBodyData getData() {
        return this.data;
    }

    public CreatePxfsAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePxfsAccessTokenResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>polardbx:QueryColumnarLog</p>
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
         * <p>The diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of the missing permission.</p>
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

        public static CreatePxfsAccessTokenResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            CreatePxfsAccessTokenResponseBodyAccessDeniedDetail self = new CreatePxfsAccessTokenResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public CreatePxfsAccessTokenResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public CreatePxfsAccessTokenResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public CreatePxfsAccessTokenResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public CreatePxfsAccessTokenResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public CreatePxfsAccessTokenResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public CreatePxfsAccessTokenResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public CreatePxfsAccessTokenResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class CreatePxfsAccessTokenResponseBodyData extends TeaModel {
        /**
         * <p>The access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-files.example.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-31T23:59:59Z</p>
         */
        @NameInMap("ExpiresAt")
        public String expiresAt;

        /**
         * <p>The name of the identity.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-runtime</p>
         */
        @NameInMap("IdentityName")
        public String identityName;

        /**
         * <p>The label of the token.</p>
         * 
         * <strong>example:</strong>
         * <p>production-agent</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>12049</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant-001</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The plaintext of the token.</p>
         * 
         * <strong>example:</strong>
         * <p>pxfs_tenant-001.token-001.******</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>Token ID</p>
         * 
         * <strong>example:</strong>
         * <p>token-001</p>
         */
        @NameInMap("TokenId")
        public String tokenId;

        public static CreatePxfsAccessTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePxfsAccessTokenResponseBodyData self = new CreatePxfsAccessTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePxfsAccessTokenResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreatePxfsAccessTokenResponseBodyData setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreatePxfsAccessTokenResponseBodyData setIdentityName(String identityName) {
            this.identityName = identityName;
            return this;
        }
        public String getIdentityName() {
            return this.identityName;
        }

        public CreatePxfsAccessTokenResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CreatePxfsAccessTokenResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreatePxfsAccessTokenResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreatePxfsAccessTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public CreatePxfsAccessTokenResponseBodyData setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public String getTokenId() {
            return this.tokenId;
        }

    }

}
