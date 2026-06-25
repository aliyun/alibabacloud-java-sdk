// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigMapResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: success</p>
     * </li>
     * <li><p><strong>3xx</strong>: redirection</p>
     * </li>
     * <li><p><strong>4xx</strong>: client error</p>
     * </li>
     * <li><p><strong>5xx</strong>: server error</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeConfigMapResponseBodyData data;

    /**
     * <p>The error code returned if the request fails.</p>
     * <ul>
     * <li><p>This parameter is empty if the request succeeds.</p>
     * </li>
     * <li><p>This parameter contains an error code if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li><p>The value is <strong>success</strong> if the request succeeds.</p>
     * </li>
     * <li><p>The value is an error code if the request fails.</p>
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
     * <p>The trace ID. You can use it to locate the call details.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
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
         * <p>1593746835111</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The key-value pairs of the ConfigMap. The data is in the following format:</p>
         * <p>{&quot;k1&quot;:&quot;v1&quot;, &quot;k2&quot;:&quot;v2&quot;}</p>
         * <p>For more information about configuration items, see <a href="https://help.aliyun.com/document_detail/171326.html">Manage and use configuration items</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        /**
         * <p>The description of the ConfigMap instance.</p>
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
         * <p>test-configmap</p>
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
        public java.util.List<DescribeConfigMapResponseBodyDataRelateApps> relateApps;

        /**
         * <p>The time when the instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1593747274195</p>
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
