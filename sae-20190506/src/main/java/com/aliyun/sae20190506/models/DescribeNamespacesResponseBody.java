// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespacesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information of namespaces.</p>
     */
    @NameInMap("Data")
    public DescribeNamespacesResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>success: If the call is successful, <strong>success</strong> is returned.</li>
     * <li>An error code: If the call fails, an error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the list of namespaces was queried. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The list was queried.</li>
     * <li><strong>false</strong>: The list failed to be queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a981dd515966966104121683d****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesResponseBody self = new DescribeNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNamespacesResponseBody setData(DescribeNamespacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeNamespacesResponseBodyData getData() {
        return this.data;
    }

    public DescribeNamespacesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeNamespacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNamespacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeNamespacesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeNamespacesResponseBodyDataNamespaces extends TeaModel {
        /**
         * <p>The ACM-specific AccessKey ID. It can be used to manage data in an Application Configuration Management (ACM) namespace. For more information, see <a href="https://help.aliyun.com/document_detail/68941.html">Differences between Alibaba Cloud AccessKey and ACM-specific AccessKey</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>b34dbe3315c64f9f99b58ea447ec****</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The endpoint of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>addr-bj-internal.edas.aliyun.com</p>
         */
        @NameInMap("AddressServerHost")
        public String addressServerHost;

        /**
         * <p>The short ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NameSpaceShortId")
        public String nameSpaceShortId;

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("NamespaceDescription")
        public String namespaceDescription;

        /**
         * <p>The ID of the namespace. You cannot query, modify, or delete the default namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ACM-specific AccessKey secret. It can be used to manage data in an ACM namespace. For more information, see <a href="https://help.aliyun.com/document_detail/68941.html">Differences between Alibaba Cloud AccessKey and ACM-specific AccessKey</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>G/w6sseK7+nb3S6HBmANDBMD****</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>838cad95-973f-48fe-830b-2a8546d7****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static DescribeNamespacesResponseBodyDataNamespaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesResponseBodyDataNamespaces self = new DescribeNamespacesResponseBodyDataNamespaces();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesResponseBodyDataNamespaces setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public DescribeNamespacesResponseBodyDataNamespaces setAddressServerHost(String addressServerHost) {
            this.addressServerHost = addressServerHost;
            return this;
        }
        public String getAddressServerHost() {
            return this.addressServerHost;
        }

        public DescribeNamespacesResponseBodyDataNamespaces setNameSpaceShortId(String nameSpaceShortId) {
            this.nameSpaceShortId = nameSpaceShortId;
            return this;
        }
        public String getNameSpaceShortId() {
            return this.nameSpaceShortId;
        }

        public DescribeNamespacesResponseBodyDataNamespaces setNamespaceDescription(String namespaceDescription) {
            this.namespaceDescription = namespaceDescription;
            return this;
        }
        public String getNamespaceDescription() {
            return this.namespaceDescription;
        }

        public DescribeNamespacesResponseBodyDataNamespaces setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeNamespacesResponseBodyDataNamespaces setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public DescribeNamespacesResponseBodyDataNamespaces setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNamespacesResponseBodyDataNamespaces setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public DescribeNamespacesResponseBodyDataNamespaces setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class DescribeNamespacesResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The namespaces.</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<DescribeNamespacesResponseBodyDataNamespaces> namespaces;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of namespaces.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static DescribeNamespacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesResponseBodyData self = new DescribeNamespacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeNamespacesResponseBodyData setNamespaces(java.util.List<DescribeNamespacesResponseBodyDataNamespaces> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<DescribeNamespacesResponseBodyDataNamespaces> getNamespaces() {
            return this.namespaces;
        }

        public DescribeNamespacesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeNamespacesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
