// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePxfsTenantResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public CreatePxfsTenantResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public CreatePxfsTenantResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePxfsTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePxfsTenantResponseBody self = new CreatePxfsTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePxfsTenantResponseBody setAccessDeniedDetail(CreatePxfsTenantResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public CreatePxfsTenantResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreatePxfsTenantResponseBody setData(CreatePxfsTenantResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePxfsTenantResponseBodyData getData() {
        return this.data;
    }

    public CreatePxfsTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePxfsTenantResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static CreatePxfsTenantResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            CreatePxfsTenantResponseBodyAccessDeniedDetail self = new CreatePxfsTenantResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public CreatePxfsTenantResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public CreatePxfsTenantResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public CreatePxfsTenantResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public CreatePxfsTenantResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public CreatePxfsTenantResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public CreatePxfsTenantResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public CreatePxfsTenantResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class CreatePxfsTenantResponseBodyData extends TeaModel {
        /**
         * <p>The capacity quota.</p>
         * 
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        @NameInMap("QuotaBytes")
        public Long quotaBytes;

        /**
         * <p>The file count quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("QuotaFiles")
        public Long quotaFiles;

        /**
         * <p>The request rate limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RateLimitRps")
        public Long rateLimitRps;

        /**
         * <p>The write bandwidth limit.</p>
         * 
         * <strong>example:</strong>
         * <p>104857600</p>
         */
        @NameInMap("RateLimitWbps")
        public Long rateLimitWbps;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant-001</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The name of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-files</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        public static CreatePxfsTenantResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePxfsTenantResponseBodyData self = new CreatePxfsTenantResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePxfsTenantResponseBodyData setQuotaBytes(Long quotaBytes) {
            this.quotaBytes = quotaBytes;
            return this;
        }
        public Long getQuotaBytes() {
            return this.quotaBytes;
        }

        public CreatePxfsTenantResponseBodyData setQuotaFiles(Long quotaFiles) {
            this.quotaFiles = quotaFiles;
            return this;
        }
        public Long getQuotaFiles() {
            return this.quotaFiles;
        }

        public CreatePxfsTenantResponseBodyData setRateLimitRps(Long rateLimitRps) {
            this.rateLimitRps = rateLimitRps;
            return this;
        }
        public Long getRateLimitRps() {
            return this.rateLimitRps;
        }

        public CreatePxfsTenantResponseBodyData setRateLimitWbps(Long rateLimitWbps) {
            this.rateLimitWbps = rateLimitWbps;
            return this;
        }
        public Long getRateLimitWbps() {
            return this.rateLimitWbps;
        }

        public CreatePxfsTenantResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreatePxfsTenantResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreatePxfsTenantResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
