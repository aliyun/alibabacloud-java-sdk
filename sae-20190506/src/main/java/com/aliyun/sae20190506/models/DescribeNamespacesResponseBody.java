// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespacesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeNamespacesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("NamespaceDescription")
        public String namespaceDescription;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NamespaceName")
        public String namespaceName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecretKey")
        public String secretKey;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Namespaces")
        public java.util.List<DescribeNamespacesResponseBodyDataNamespaces> namespaces;

        @NameInMap("PageSize")
        public Integer pageSize;

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
