// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class OemListMenuResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<OemListMenuResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static OemListMenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OemListMenuResponseBody self = new OemListMenuResponseBody();
        return TeaModel.build(map, self);
    }

    public OemListMenuResponseBody setData(java.util.List<OemListMenuResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OemListMenuResponseBodyData> getData() {
        return this.data;
    }

    public OemListMenuResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OemListMenuResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public OemListMenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OemListMenuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OemListMenuResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class OemListMenuResponseBodyData extends TeaModel {
        @NameInMap("Children")
        public java.util.List<java.util.Map<String, ?>> children;

        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("Order")
        public String order;

        @NameInMap("ParentKey")
        public String parentKey;

        @NameInMap("Permission")
        public Boolean permission;

        @NameInMap("PurchasePackage")
        public Boolean purchasePackage;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Url")
        public String url;

        public static OemListMenuResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OemListMenuResponseBodyData self = new OemListMenuResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OemListMenuResponseBodyData setChildren(java.util.List<java.util.Map<String, ?>> children) {
            this.children = children;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getChildren() {
            return this.children;
        }

        public OemListMenuResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public OemListMenuResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OemListMenuResponseBodyData setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public OemListMenuResponseBodyData setParentKey(String parentKey) {
            this.parentKey = parentKey;
            return this;
        }
        public String getParentKey() {
            return this.parentKey;
        }

        public OemListMenuResponseBodyData setPermission(Boolean permission) {
            this.permission = permission;
            return this;
        }
        public Boolean getPermission() {
            return this.permission;
        }

        public OemListMenuResponseBodyData setPurchasePackage(Boolean purchasePackage) {
            this.purchasePackage = purchasePackage;
            return this;
        }
        public Boolean getPurchasePackage() {
            return this.purchasePackage;
        }

        public OemListMenuResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public OemListMenuResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
