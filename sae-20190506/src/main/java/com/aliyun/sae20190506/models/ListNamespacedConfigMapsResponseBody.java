// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespacedConfigMapsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A client error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned by the request.</p>
     */
    @NameInMap("Data")
    public ListNamespacedConfigMapsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li></li>
     * <li><p>This parameter is returned only if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The response message. Valid values:</p>
     * <ul>
     * <li><p>Returns <strong>success</strong> if the request is successful.</p>
     * </li>
     * <li><p>Returns an error message if the request fails.</p>
     * </li>
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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID. You can use this ID to trace the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
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
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f16b4000-9058-4c22-a49d-49a28f0b****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
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
        /**
         * <p>The ID of the ConfigMap instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigMapId")
        public Long configMapId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1593760185111</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The key-value pairs of the ConfigMap instance.</p>
         * <p>For more information about the ConfigMap, see <a href="https://help.aliyun.com/document_detail/171326.html">Manage and use configuration items</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The associated applications.</p>
         */
        @NameInMap("RelateApps")
        public java.util.List<ListNamespacedConfigMapsResponseBodyDataConfigMapsRelateApps> relateApps;

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1593760185111</p>
         */
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
        /**
         * <p>The list of ConfigMap instances.</p>
         */
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
