// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeNamespaceResponseBodyData data;

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

    public static DescribeNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResponseBody self = new DescribeNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNamespaceResponseBody setData(DescribeNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeNamespaceResponseBodyData getData() {
        return this.data;
    }

    public DescribeNamespaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeNamespaceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeNamespaceResponseBodyData extends TeaModel {
        @NameInMap("NamespaceDescription")
        public String namespaceDescription;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NamespaceName")
        public String namespaceName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceResponseBodyData self = new DescribeNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceResponseBodyData setNamespaceDescription(String namespaceDescription) {
            this.namespaceDescription = namespaceDescription;
            return this;
        }
        public String getNamespaceDescription() {
            return this.namespaceDescription;
        }

        public DescribeNamespaceResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeNamespaceResponseBodyData setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public DescribeNamespaceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
