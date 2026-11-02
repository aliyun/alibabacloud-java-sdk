// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ListPxfsTenantsResponseBody extends TeaModel {
    /**
     * <p>The access denial details.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ListPxfsTenantsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public ListPxfsTenantsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPxfsTenantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPxfsTenantsResponseBody self = new ListPxfsTenantsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPxfsTenantsResponseBody setAccessDeniedDetail(ListPxfsTenantsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ListPxfsTenantsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListPxfsTenantsResponseBody setData(ListPxfsTenantsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPxfsTenantsResponseBodyData getData() {
        return this.data;
    }

    public ListPxfsTenantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPxfsTenantsResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The ID of the owner of the authentication principal.</p>
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
         * <p>The type of the access denial.</p>
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

        public static ListPxfsTenantsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ListPxfsTenantsResponseBodyAccessDeniedDetail self = new ListPxfsTenantsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ListPxfsTenantsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ListPxfsTenantsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ListPxfsTenantsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ListPxfsTenantsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ListPxfsTenantsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ListPxfsTenantsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ListPxfsTenantsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListPxfsTenantsResponseBodyDataTenants extends TeaModel {
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
         * <p>0</p>
         */
        @NameInMap("RateLimitRps")
        public Long rateLimitRps;

        /**
         * <p>The write bandwidth limit.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RateLimitWbps")
        public Long rateLimitWbps;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>zero-v1zhme7mtddrkfn40hrr9ifk</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The tenant name.</p>
         * 
         * <strong>example:</strong>
         * <p>zero-v1zhme7mtddrkfn40hrr9ifk</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        public static ListPxfsTenantsResponseBodyDataTenants build(java.util.Map<String, ?> map) throws Exception {
            ListPxfsTenantsResponseBodyDataTenants self = new ListPxfsTenantsResponseBodyDataTenants();
            return TeaModel.build(map, self);
        }

        public ListPxfsTenantsResponseBodyDataTenants setDedupBytes(Long dedupBytes) {
            this.dedupBytes = dedupBytes;
            return this;
        }
        public Long getDedupBytes() {
            return this.dedupBytes;
        }

        public ListPxfsTenantsResponseBodyDataTenants setLogicalBytes(Long logicalBytes) {
            this.logicalBytes = logicalBytes;
            return this;
        }
        public Long getLogicalBytes() {
            return this.logicalBytes;
        }

        public ListPxfsTenantsResponseBodyDataTenants setLogicalFiles(Long logicalFiles) {
            this.logicalFiles = logicalFiles;
            return this;
        }
        public Long getLogicalFiles() {
            return this.logicalFiles;
        }

        public ListPxfsTenantsResponseBodyDataTenants setPhysicalBytes(Long physicalBytes) {
            this.physicalBytes = physicalBytes;
            return this;
        }
        public Long getPhysicalBytes() {
            return this.physicalBytes;
        }

        public ListPxfsTenantsResponseBodyDataTenants setQuotaBytes(Long quotaBytes) {
            this.quotaBytes = quotaBytes;
            return this;
        }
        public Long getQuotaBytes() {
            return this.quotaBytes;
        }

        public ListPxfsTenantsResponseBodyDataTenants setQuotaFiles(Long quotaFiles) {
            this.quotaFiles = quotaFiles;
            return this;
        }
        public Long getQuotaFiles() {
            return this.quotaFiles;
        }

        public ListPxfsTenantsResponseBodyDataTenants setRateLimitRps(Long rateLimitRps) {
            this.rateLimitRps = rateLimitRps;
            return this;
        }
        public Long getRateLimitRps() {
            return this.rateLimitRps;
        }

        public ListPxfsTenantsResponseBodyDataTenants setRateLimitWbps(Long rateLimitWbps) {
            this.rateLimitWbps = rateLimitWbps;
            return this;
        }
        public Long getRateLimitWbps() {
            return this.rateLimitWbps;
        }

        public ListPxfsTenantsResponseBodyDataTenants setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPxfsTenantsResponseBodyDataTenants setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListPxfsTenantsResponseBodyDataTenants setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

    public static class ListPxfsTenantsResponseBodyData extends TeaModel {
        /**
         * <p>The list of PXFS tenants.</p>
         */
        @NameInMap("Tenants")
        public java.util.List<ListPxfsTenantsResponseBodyDataTenants> tenants;

        public static ListPxfsTenantsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPxfsTenantsResponseBodyData self = new ListPxfsTenantsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPxfsTenantsResponseBodyData setTenants(java.util.List<ListPxfsTenantsResponseBodyDataTenants> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<ListPxfsTenantsResponseBodyDataTenants> getTenants() {
            return this.tenants;
        }

    }

}
