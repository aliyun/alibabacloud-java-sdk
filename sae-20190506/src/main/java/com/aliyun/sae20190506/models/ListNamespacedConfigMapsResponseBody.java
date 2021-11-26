// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespacedConfigMapsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListNamespacedConfigMapsResponseBodyData data;

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

    public static ListNamespacedConfigMapsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacedConfigMapsResponseBody self = new ListNamespacedConfigMapsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespacedConfigMapsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNamespacedConfigMapsResponseBody setData(ListNamespacedConfigMapsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNamespacedConfigMapsResponseBodyData getData() {
        return this.data;
    }

    public ListNamespacedConfigMapsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNamespacedConfigMapsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNamespacedConfigMapsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNamespacedConfigMapsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNamespacedConfigMapsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListNamespacedConfigMapsResponseBodyDataConfigMapsRelateApps extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        public static ListNamespacedConfigMapsResponseBodyDataConfigMapsRelateApps build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacedConfigMapsResponseBodyDataConfigMapsRelateApps self = new ListNamespacedConfigMapsResponseBodyDataConfigMapsRelateApps();
            return TeaModel.build(map, self);
        }

        public ListNamespacedConfigMapsResponseBodyDataConfigMapsRelateApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListNamespacedConfigMapsResponseBodyDataConfigMapsRelateApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class ListNamespacedConfigMapsResponseBodyDataConfigMaps extends TeaModel {
        @NameInMap("ConfigMapId")
        public Long configMapId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("RelateApps")
        public java.util.List<ListNamespacedConfigMapsResponseBodyDataConfigMapsRelateApps> relateApps;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListNamespacedConfigMapsResponseBodyDataConfigMaps build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacedConfigMapsResponseBodyDataConfigMaps self = new ListNamespacedConfigMapsResponseBodyDataConfigMaps();
            return TeaModel.build(map, self);
        }

        public ListNamespacedConfigMapsResponseBodyDataConfigMaps setConfigMapId(Long configMapId) {
            this.configMapId = configMapId;
            return this;
        }
        public Long getConfigMapId() {
            return this.configMapId;
        }

        public ListNamespacedConfigMapsResponseBodyDataConfigMaps setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNamespacedConfigMapsResponseBodyDataConfigMaps setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public ListNamespacedConfigMapsResponseBodyDataConfigMaps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNamespacedConfigMapsResponseBodyDataConfigMaps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNamespacedConfigMapsResponseBodyDataConfigMaps setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListNamespacedConfigMapsResponseBodyDataConfigMaps setRelateApps(java.util.List<ListNamespacedConfigMapsResponseBodyDataConfigMapsRelateApps> relateApps) {
            this.relateApps = relateApps;
            return this;
        }
        public java.util.List<ListNamespacedConfigMapsResponseBodyDataConfigMapsRelateApps> getRelateApps() {
            return this.relateApps;
        }

        public ListNamespacedConfigMapsResponseBodyDataConfigMaps setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListNamespacedConfigMapsResponseBodyData extends TeaModel {
        @NameInMap("ConfigMaps")
        public java.util.List<ListNamespacedConfigMapsResponseBodyDataConfigMaps> configMaps;

        public static ListNamespacedConfigMapsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacedConfigMapsResponseBodyData self = new ListNamespacedConfigMapsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNamespacedConfigMapsResponseBodyData setConfigMaps(java.util.List<ListNamespacedConfigMapsResponseBodyDataConfigMaps> configMaps) {
            this.configMaps = configMaps;
            return this;
        }
        public java.util.List<ListNamespacedConfigMapsResponseBodyDataConfigMaps> getConfigMaps() {
            return this.configMaps;
        }

    }

}
