// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyPxfsTenantQuotaResponseBody extends TeaModel {
    /**
     * <p>The details of the access denied error.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The new connection string information.</p>
     */
    @NameInMap("Data")
    public ModifyPxfsTenantQuotaResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPxfsTenantQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPxfsTenantQuotaResponseBody self = new ModifyPxfsTenantQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPxfsTenantQuotaResponseBody setAccessDeniedDetail(ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyPxfsTenantQuotaResponseBody setData(ModifyPxfsTenantQuotaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyPxfsTenantQuotaResponseBodyData getData() {
        return this.data;
    }

    public ModifyPxfsTenantQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The name of the API operation.</p>
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
         * <p>The type of identity used for authentication in the request. Valid values:</p>
         * <ul>
         * <li>SubUser: RAM user.</li>
         * <li>AssumedRoleUser: RAM role.</li>
         * <li>Federated: SSO federated identity.</li>
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
         * <p>The type of access denial.</p>
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

        public static ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail self = new ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ModifyPxfsTenantQuotaResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ModifyPxfsTenantQuotaResponseBodyData extends TeaModel {
        /**
         * <p>The number of bytes saved for the tenant after data deduplication.</p>
         * 
         * <strong>example:</strong>
         * <p>268435456</p>
         */
        @NameInMap("DedupBytes")
        public Long dedupBytes;

        /**
         * <p>The current logical usage of the tenant, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1073741824</p>
         */
        @NameInMap("LogicalBytes")
        public Long logicalBytes;

        /**
         * <p>The current number of logical files for the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LogicalFiles")
        public Long logicalFiles;

        /**
         * <p>The actual physical storage space occupied by the tenant, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>805306368</p>
         */
        @NameInMap("PhysicalBytes")
        public Long physicalBytes;

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
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant-001</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The tenant name.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-files</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        public static ModifyPxfsTenantQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyPxfsTenantQuotaResponseBodyData self = new ModifyPxfsTenantQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyPxfsTenantQuotaResponseBodyData setDedupBytes(Long dedupBytes) {
            this.dedupBytes = dedupBytes;
            return this;
        }
        public Long getDedupBytes() {
            return this.dedupBytes;
        }

        public ModifyPxfsTenantQuotaResponseBodyData setLogicalBytes(Long logicalBytes) {
            this.logicalBytes = logicalBytes;
            return this;
        }
        public Long getLogicalBytes() {
            return this.logicalBytes;
        }

        public ModifyPxfsTenantQuotaResponseBodyData setLogicalFiles(Long logicalFiles) {
            this.logicalFiles = logicalFiles;
            return this;
        }
        public Long getLogicalFiles() {
            return this.logicalFiles;
        }

        public ModifyPxfsTenantQuotaResponseBodyData setPhysicalBytes(Long physicalBytes) {
            this.physicalBytes = physicalBytes;
            return this;
        }
        public Long getPhysicalBytes() {
            return this.physicalBytes;
        }

        public ModifyPxfsTenantQuotaResponseBodyData setQuotaBytes(Long quotaBytes) {
            this.quotaBytes = quotaBytes;
            return this;
        }
        public Long getQuotaBytes() {
            return this.quotaBytes;
        }

        public ModifyPxfsTenantQuotaResponseBodyData setQuotaFiles(Long quotaFiles) {
            this.quotaFiles = quotaFiles;
            return this;
        }
        public Long getQuotaFiles() {
            return this.quotaFiles;
        }

        public ModifyPxfsTenantQuotaResponseBodyData setRateLimitRps(Long rateLimitRps) {
            this.rateLimitRps = rateLimitRps;
            return this;
        }
        public Long getRateLimitRps() {
            return this.rateLimitRps;
        }

        public ModifyPxfsTenantQuotaResponseBodyData setRateLimitWbps(Long rateLimitWbps) {
            this.rateLimitWbps = rateLimitWbps;
            return this;
        }
        public Long getRateLimitWbps() {
            return this.rateLimitWbps;
        }

        public ModifyPxfsTenantQuotaResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyPxfsTenantQuotaResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ModifyPxfsTenantQuotaResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
