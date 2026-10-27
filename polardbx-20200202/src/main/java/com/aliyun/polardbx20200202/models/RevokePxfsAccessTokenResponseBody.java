// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RevokePxfsAccessTokenResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public RevokePxfsAccessTokenResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public RevokePxfsAccessTokenResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokePxfsAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokePxfsAccessTokenResponseBody self = new RevokePxfsAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokePxfsAccessTokenResponseBody setAccessDeniedDetail(RevokePxfsAccessTokenResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public RevokePxfsAccessTokenResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public RevokePxfsAccessTokenResponseBody setData(RevokePxfsAccessTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RevokePxfsAccessTokenResponseBodyData getData() {
        return this.data;
    }

    public RevokePxfsAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RevokePxfsAccessTokenResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authorization action. See the description above.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The type of the authorization principal.</p>
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
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static RevokePxfsAccessTokenResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            RevokePxfsAccessTokenResponseBodyAccessDeniedDetail self = new RevokePxfsAccessTokenResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public RevokePxfsAccessTokenResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public RevokePxfsAccessTokenResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public RevokePxfsAccessTokenResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public RevokePxfsAccessTokenResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public RevokePxfsAccessTokenResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public RevokePxfsAccessTokenResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public RevokePxfsAccessTokenResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class RevokePxfsAccessTokenResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the token has been revoked.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Revoked")
        public Boolean revoked;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant-001</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Token ID</p>
         * 
         * <strong>example:</strong>
         * <p>token-001</p>
         */
        @NameInMap("TokenId")
        public String tokenId;

        public static RevokePxfsAccessTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RevokePxfsAccessTokenResponseBodyData self = new RevokePxfsAccessTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RevokePxfsAccessTokenResponseBodyData setRevoked(Boolean revoked) {
            this.revoked = revoked;
            return this;
        }
        public Boolean getRevoked() {
            return this.revoked;
        }

        public RevokePxfsAccessTokenResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public RevokePxfsAccessTokenResponseBodyData setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public String getTokenId() {
            return this.tokenId;
        }

    }

}
