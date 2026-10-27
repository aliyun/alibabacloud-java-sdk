// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfsTenantResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribePxfsTenantResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribePxfsTenantResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePxfsTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfsTenantResponseBody self = new DescribePxfsTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePxfsTenantResponseBody setAccessDeniedDetail(DescribePxfsTenantResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribePxfsTenantResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePxfsTenantResponseBody setData(DescribePxfsTenantResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePxfsTenantResponseBodyData getData() {
        return this.data;
    }

    public DescribePxfsTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePxfsTenantResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static DescribePxfsTenantResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsTenantResponseBodyAccessDeniedDetail self = new DescribePxfsTenantResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribePxfsTenantResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribePxfsTenantResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribePxfsTenantResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribePxfsTenantResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribePxfsTenantResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribePxfsTenantResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribePxfsTenantResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribePxfsTenantResponseBodyData extends TeaModel {
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

        /**
         * <p>The used capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("UsedBytes")
        public Long usedBytes;

        /**
         * <p>The used file count.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("UsedFiles")
        public Long usedFiles;

        public static DescribePxfsTenantResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsTenantResponseBodyData self = new DescribePxfsTenantResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePxfsTenantResponseBodyData setQuotaBytes(Long quotaBytes) {
            this.quotaBytes = quotaBytes;
            return this;
        }
        public Long getQuotaBytes() {
            return this.quotaBytes;
        }

        public DescribePxfsTenantResponseBodyData setQuotaFiles(Long quotaFiles) {
            this.quotaFiles = quotaFiles;
            return this;
        }
        public Long getQuotaFiles() {
            return this.quotaFiles;
        }

        public DescribePxfsTenantResponseBodyData setRateLimitRps(Long rateLimitRps) {
            this.rateLimitRps = rateLimitRps;
            return this;
        }
        public Long getRateLimitRps() {
            return this.rateLimitRps;
        }

        public DescribePxfsTenantResponseBodyData setRateLimitWbps(Long rateLimitWbps) {
            this.rateLimitWbps = rateLimitWbps;
            return this;
        }
        public Long getRateLimitWbps() {
            return this.rateLimitWbps;
        }

        public DescribePxfsTenantResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePxfsTenantResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribePxfsTenantResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribePxfsTenantResponseBodyData setUsedBytes(Long usedBytes) {
            this.usedBytes = usedBytes;
            return this;
        }
        public Long getUsedBytes() {
            return this.usedBytes;
        }

        public DescribePxfsTenantResponseBodyData setUsedFiles(Long usedFiles) {
            this.usedFiles = usedFiles;
            return this;
        }
        public Long getUsedFiles() {
            return this.usedFiles;
        }

    }

}
