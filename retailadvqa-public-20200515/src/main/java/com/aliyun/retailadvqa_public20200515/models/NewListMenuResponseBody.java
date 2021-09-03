// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class NewListMenuResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("Data")
    public java.util.List<NewListMenuResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static NewListMenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NewListMenuResponseBody self = new NewListMenuResponseBody();
        return TeaModel.build(map, self);
    }

    public NewListMenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NewListMenuResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public NewListMenuResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public NewListMenuResponseBody setData(java.util.List<NewListMenuResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NewListMenuResponseBodyData> getData() {
        return this.data;
    }

    public NewListMenuResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public NewListMenuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class NewListMenuResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Url")
        public String url;

        @NameInMap("Name")
        public String name;

        @NameInMap("Order")
        public String order;

        @NameInMap("ParentKey")
        public String parentKey;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Children")
        public java.util.Map<String, ?> children;

        public static NewListMenuResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            NewListMenuResponseBodyData self = new NewListMenuResponseBodyData();
            return TeaModel.build(map, self);
        }

        public NewListMenuResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public NewListMenuResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public NewListMenuResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NewListMenuResponseBodyData setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public NewListMenuResponseBodyData setParentKey(String parentKey) {
            this.parentKey = parentKey;
            return this;
        }
        public String getParentKey() {
            return this.parentKey;
        }

        public NewListMenuResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public NewListMenuResponseBodyData setChildren(java.util.Map<String, ?> children) {
            this.children = children;
            return this;
        }
        public java.util.Map<String, ?> getChildren() {
            return this.children;
        }

    }

}
