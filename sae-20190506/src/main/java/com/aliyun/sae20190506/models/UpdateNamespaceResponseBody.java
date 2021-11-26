// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateNamespaceResponseBodyData data;

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

    public static UpdateNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceResponseBody self = new UpdateNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateNamespaceResponseBody setData(UpdateNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateNamespaceResponseBodyData getData() {
        return this.data;
    }

    public UpdateNamespaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateNamespaceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UpdateNamespaceResponseBodyData extends TeaModel {
        @NameInMap("NamespaceDescription")
        public String namespaceDescription;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NamespaceName")
        public String namespaceName;

        @NameInMap("RegionId")
        public String regionId;

        public static UpdateNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateNamespaceResponseBodyData self = new UpdateNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateNamespaceResponseBodyData setNamespaceDescription(String namespaceDescription) {
            this.namespaceDescription = namespaceDescription;
            return this;
        }
        public String getNamespaceDescription() {
            return this.namespaceDescription;
        }

        public UpdateNamespaceResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public UpdateNamespaceResponseBodyData setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public UpdateNamespaceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
