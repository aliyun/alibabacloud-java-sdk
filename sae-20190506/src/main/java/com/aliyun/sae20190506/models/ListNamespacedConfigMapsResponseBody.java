// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespacedConfigMapsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the call was successful.</p>
     * <p>*   **3xx**: indicates that the call was redirected.</p>
     * <p>*   **4xx**: indicates that the call failed.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
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
     * <br>
     * <p>- If the call is successful, the **ErrorCode** parameter is not returned.</p>
     * <p>- If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information. Valid values:</p>
     * <br>
     * <p>*   If the call is successful, **success** is returned.</p>
     * <p>*   If the call fails, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the ConfigMap instances were obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: The instances were obtained.</p>
     * <p>*   **false**: The instances failed to be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
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
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
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
         */
        @NameInMap("ConfigMapId")
        public Long configMapId;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data of ConfigMap key-value pairs. Format:</p>
         * <br>
         * <p>{"k1":"v1", "k2":"v2"}</p>
         * <br>
         * <p>k specifies a key and v specifies a value. For more information, see [Manage and use configurations](~~171326~~).</p>
         */
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the ConfigMap instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the namespace.</p>
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
