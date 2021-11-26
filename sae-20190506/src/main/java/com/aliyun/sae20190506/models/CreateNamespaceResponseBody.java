// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateNamespaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateNamespaceResponseBodyData data;

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

    public static CreateNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceResponseBody self = new CreateNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateNamespaceResponseBody setData(CreateNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateNamespaceResponseBodyData getData() {
        return this.data;
    }

    public CreateNamespaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateNamespaceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateNamespaceResponseBodyData extends TeaModel {
        @NameInMap("NamespaceDescription")
        public String namespaceDescription;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NamespaceName")
        public String namespaceName;

        @NameInMap("RegionId")
        public String regionId;

        public static CreateNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateNamespaceResponseBodyData self = new CreateNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateNamespaceResponseBodyData setNamespaceDescription(String namespaceDescription) {
            this.namespaceDescription = namespaceDescription;
            return this;
        }
        public String getNamespaceDescription() {
            return this.namespaceDescription;
        }

        public CreateNamespaceResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public CreateNamespaceResponseBodyData setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public CreateNamespaceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
