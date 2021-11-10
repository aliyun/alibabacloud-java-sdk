// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListMenuResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListMenuResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static ListMenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMenuResponseBody self = new ListMenuResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMenuResponseBody setData(java.util.List<ListMenuResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMenuResponseBodyData> getData() {
        return this.data;
    }

    public ListMenuResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMenuResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ListMenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMenuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMenuResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListMenuResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("Url")
        public String url;

        public static ListMenuResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMenuResponseBodyData self = new ListMenuResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMenuResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListMenuResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMenuResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class NewListMenuResponseBodyData extends TeaModel {
        @NameInMap("Children")
        public java.util.Map<String, ?> children;

        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("Order")
        public String order;

        @NameInMap("ParentKey")
        public String parentKey;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Url")
        public String url;

        public static NewListMenuResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            NewListMenuResponseBodyData self = new NewListMenuResponseBodyData();
            return TeaModel.build(map, self);
        }

        public NewListMenuResponseBodyData setChildren(java.util.Map<String, ?> children) {
            this.children = children;
            return this;
        }
        public java.util.Map<String, ?> getChildren() {
            return this.children;
        }

        public NewListMenuResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
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

        public NewListMenuResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

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
