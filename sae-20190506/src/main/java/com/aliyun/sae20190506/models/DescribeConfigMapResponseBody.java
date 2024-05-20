// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigMapResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the details of the ConfigMap instance were obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: The details were obtained.</p>
     * <p>*   **false**: The details failed to be obtained.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the instance was last modified.</p>
     */
    @NameInMap("Data")
    public DescribeConfigMapResponseBodyData data;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the call was successful.</p>
     * <p>*   **3xx**: indicates that the call was redirected.</p>
     * <p>*   **4xx**: indicates that the call failed.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned information. Valid values:</p>
     * <br>
     * <p>*   If the call is successful, **success** is returned.</p>
     * <p>*   If the call fails, an error code is returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeConfigMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigMapResponseBody self = new DescribeConfigMapResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigMapResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeConfigMapResponseBody setData(DescribeConfigMapResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeConfigMapResponseBodyData getData() {
        return this.data;
    }

    public DescribeConfigMapResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeConfigMapResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeConfigMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigMapResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeConfigMapResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeConfigMapResponseBodyDataRelateApps extends TeaModel {
        /**
         * <p>The ID of the ConfigMap instance.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        public static DescribeConfigMapResponseBodyDataRelateApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigMapResponseBodyDataRelateApps self = new DescribeConfigMapResponseBodyDataRelateApps();
            return TeaModel.build(map, self);
        }

        public DescribeConfigMapResponseBodyDataRelateApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeConfigMapResponseBodyDataRelateApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class DescribeConfigMapResponseBodyData extends TeaModel {
        /**
         * <p>The name of the ConfigMap instance.</p>
         */
        @NameInMap("ConfigMapId")
        public Long configMapId;

        /**
         * <p>The application that is associated with the instance.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the namespace to which the instance belongs.</p>
         */
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The returned error code. Valid values:</p>
         * <br>
         * <p>*   If the call is successful, the **ErrorCode** parameter is not returned.</p>
         * <p>*   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("RelateApps")
        public java.util.List<DescribeConfigMapResponseBodyDataRelateApps> relateApps;

        /**
         * <p>The data of ConfigMap key-value pairs. Format:</p>
         * <br>
         * <p>{"k1":"v1", "k2":"v2"}</p>
         * <br>
         * <p>k specifies a key and v specifies a value. For more information, see [Manage and use configurations](https://help.aliyun.com/document_detail/171326.html).</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeConfigMapResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigMapResponseBodyData self = new DescribeConfigMapResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeConfigMapResponseBodyData setConfigMapId(Long configMapId) {
            this.configMapId = configMapId;
            return this;
        }
        public Long getConfigMapId() {
            return this.configMapId;
        }

        public DescribeConfigMapResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeConfigMapResponseBodyData setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public DescribeConfigMapResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConfigMapResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConfigMapResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeConfigMapResponseBodyData setRelateApps(java.util.List<DescribeConfigMapResponseBodyDataRelateApps> relateApps) {
            this.relateApps = relateApps;
            return this;
        }
        public java.util.List<DescribeConfigMapResponseBodyDataRelateApps> getRelateApps() {
            return this.relateApps;
        }

        public DescribeConfigMapResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
