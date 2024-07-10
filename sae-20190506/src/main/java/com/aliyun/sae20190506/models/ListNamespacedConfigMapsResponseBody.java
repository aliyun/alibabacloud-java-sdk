// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespacedConfigMapsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: indicates that the call was successful.</li>
     * <li><strong>3xx</strong>: indicates that the call was redirected.</li>
     * <li><strong>4xx</strong>: indicates that the call failed.</li>
     * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ListNamespacedConfigMapsResponseBodyData data;

    /**
     * <p>The returned error code. Valid values:</p>
     * <ul>
     * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information. Valid values:</p>
     * <ul>
     * <li>If the call is successful, <strong>success</strong> is returned.</li>
     * <li>If the call fails, an error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the ConfigMap instances were obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The instances were obtained.</li>
     * <li><strong>false</strong>: The instances failed to be obtained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
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
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>f16b4000-9058-4c22-a49d-49a28f0b****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
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
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1593760185111</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data of ConfigMap key-value pairs. Format:</p>
         * <p>{&quot;k1&quot;:&quot;v1&quot;, &quot;k2&quot;:&quot;v2&quot;}</p>
         * <p>k specifies a key and v specifies a value. For more information, see <a href="https://help.aliyun.com/document_detail/171326.html">Manage and use configurations</a>.</p>
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
         * <p>The name of the ConfigMap instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The application that is associated with the instance.</p>
         */
        @NameInMap("RelateApps")
        public java.util.List<ListNamespacedConfigMapsResponseBodyDataConfigMapsRelateApps> relateApps;

        /**
         * <p>The time when the instance was last modified.</p>
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
         * <p>The ConfigMap instances.</p>
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
