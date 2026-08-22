// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchResourceUsageResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeOpenSearchResourceUsageResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C457B28E-9CAB-4B77-B5C6-5D71B7870B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenSearchResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchResourceUsageResponseBody self = new DescribeOpenSearchResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchResourceUsageResponseBody setAccessDeniedDetail(DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeOpenSearchResourceUsageResponseBody setData(DescribeOpenSearchResourceUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOpenSearchResourceUsageResponseBodyData getData() {
        return this.data;
    }

    public DescribeOpenSearchResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail self = new DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeOpenSearchResourceUsageResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeOpenSearchResourceUsageResponseBodyData extends TeaModel {
        /**
         * <p>The total number of documents in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("DocCount")
        public Long docCount;

        /**
         * <p>The number of indexes. This is a filter condition for the number of indexes that the missing index table currently has. The input format is <code>operator + separator &quot;&quot; + index count</code>, for example, <code>&gt;=100</code>.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=</p>
         * </blockquote>
         */
        @NameInMap("IndexCount")
        public Integer indexCount;

        /**
         * <p>The used storage space, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        @NameInMap("StorageSizeInBytes")
        public Long storageSizeInBytes;

        /**
         * <p>The total storage capacity, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>536870912000</p>
         */
        @NameInMap("StorageTotalInBytes")
        public Long storageTotalInBytes;

        /**
         * <p>The storage space usage.</p>
         * 
         * <strong>example:</strong>
         * <p>20.0</p>
         */
        @NameInMap("StorageUsagePercent")
        public Double storageUsagePercent;

        public static DescribeOpenSearchResourceUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchResourceUsageResponseBodyData self = new DescribeOpenSearchResourceUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchResourceUsageResponseBodyData setDocCount(Long docCount) {
            this.docCount = docCount;
            return this;
        }
        public Long getDocCount() {
            return this.docCount;
        }

        public DescribeOpenSearchResourceUsageResponseBodyData setIndexCount(Integer indexCount) {
            this.indexCount = indexCount;
            return this;
        }
        public Integer getIndexCount() {
            return this.indexCount;
        }

        public DescribeOpenSearchResourceUsageResponseBodyData setStorageSizeInBytes(Long storageSizeInBytes) {
            this.storageSizeInBytes = storageSizeInBytes;
            return this;
        }
        public Long getStorageSizeInBytes() {
            return this.storageSizeInBytes;
        }

        public DescribeOpenSearchResourceUsageResponseBodyData setStorageTotalInBytes(Long storageTotalInBytes) {
            this.storageTotalInBytes = storageTotalInBytes;
            return this;
        }
        public Long getStorageTotalInBytes() {
            return this.storageTotalInBytes;
        }

        public DescribeOpenSearchResourceUsageResponseBodyData setStorageUsagePercent(Double storageUsagePercent) {
            this.storageUsagePercent = storageUsagePercent;
            return this;
        }
        public Double getStorageUsagePercent() {
            return this.storageUsagePercent;
        }

    }

}
