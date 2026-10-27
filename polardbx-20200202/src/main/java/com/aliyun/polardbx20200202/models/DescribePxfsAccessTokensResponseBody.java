// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfsAccessTokensResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access was denied.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribePxfsAccessTokensResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribePxfsAccessTokensResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePxfsAccessTokensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfsAccessTokensResponseBody self = new DescribePxfsAccessTokensResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePxfsAccessTokensResponseBody setAccessDeniedDetail(DescribePxfsAccessTokensResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribePxfsAccessTokensResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePxfsAccessTokensResponseBody setData(DescribePxfsAccessTokensResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePxfsAccessTokensResponseBodyData getData() {
        return this.data;
    }

    public DescribePxfsAccessTokensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePxfsAccessTokensResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authorization action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The identity used for authorization in the request.</p>
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
         * <p>The diagnostic information.</p>
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

        public static DescribePxfsAccessTokensResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsAccessTokensResponseBodyAccessDeniedDetail self = new DescribePxfsAccessTokensResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribePxfsAccessTokensResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribePxfsAccessTokensResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribePxfsAccessTokensResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribePxfsAccessTokensResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribePxfsAccessTokensResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribePxfsAccessTokensResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribePxfsAccessTokensResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribePxfsAccessTokensResponseBodyDataAccessTokens extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-03T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-31T23:59:59Z</p>
         */
        @NameInMap("ExpiresAt")
        public String expiresAt;

        /**
         * <p>The identity name.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-runtime</p>
         */
        @NameInMap("IdentityName")
        public String identityName;

        /**
         * <p>The token label.</p>
         * 
         * <strong>example:</strong>
         * <p>production-agent</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Token ID</p>
         * 
         * <strong>example:</strong>
         * <p>token-001</p>
         */
        @NameInMap("TokenId")
        public String tokenId;

        public static DescribePxfsAccessTokensResponseBodyDataAccessTokens build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsAccessTokensResponseBodyDataAccessTokens self = new DescribePxfsAccessTokensResponseBodyDataAccessTokens();
            return TeaModel.build(map, self);
        }

        public DescribePxfsAccessTokensResponseBodyDataAccessTokens setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePxfsAccessTokensResponseBodyDataAccessTokens setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public DescribePxfsAccessTokensResponseBodyDataAccessTokens setIdentityName(String identityName) {
            this.identityName = identityName;
            return this;
        }
        public String getIdentityName() {
            return this.identityName;
        }

        public DescribePxfsAccessTokensResponseBodyDataAccessTokens setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribePxfsAccessTokensResponseBodyDataAccessTokens setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePxfsAccessTokensResponseBodyDataAccessTokens setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public String getTokenId() {
            return this.tokenId;
        }

    }

    public static class DescribePxfsAccessTokensResponseBodyData extends TeaModel {
        /**
         * <p>The list of access tokens.</p>
         */
        @NameInMap("AccessTokens")
        public java.util.List<DescribePxfsAccessTokensResponseBodyDataAccessTokens> accessTokens;

        public static DescribePxfsAccessTokensResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsAccessTokensResponseBodyData self = new DescribePxfsAccessTokensResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePxfsAccessTokensResponseBodyData setAccessTokens(java.util.List<DescribePxfsAccessTokensResponseBodyDataAccessTokens> accessTokens) {
            this.accessTokens = accessTokens;
            return this;
        }
        public java.util.List<DescribePxfsAccessTokensResponseBodyDataAccessTokens> getAccessTokens() {
            return this.accessTokens;
        }

    }

}
