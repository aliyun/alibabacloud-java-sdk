// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeSecretResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response.</p>
     */
    @NameInMap("Data")
    public DescribeSecretResponseBodyData data;

    /**
     * <p>The error code returned. Valid values:</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned if the request succeeds.</p>
     * <p>*   If the call fails, the **ErrorCode** parameter is returned. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information that is returned. Valid values:</p>
     * <br>
     * <p>*   success: If the call is successful, **success** is returned.</p>
     * <p>*   An error code: If the call fails, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the details of the Secret instance are successfully queried. Valid values:</p>
     * <br>
     * <p>*   **true**: The information was queried.</p>
     * <p>*   **false**: The image failed to be found.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretResponseBody self = new DescribeSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecretResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSecretResponseBody setData(DescribeSecretResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSecretResponseBodyData getData() {
        return this.data;
    }

    public DescribeSecretResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeSecretResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecretResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSecretResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeSecretResponseBodyDataRelateApps extends TeaModel {
        /**
         * <p>The application ID.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        public static DescribeSecretResponseBodyDataRelateApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecretResponseBodyDataRelateApps self = new DescribeSecretResponseBodyDataRelateApps();
            return TeaModel.build(map, self);
        }

        public DescribeSecretResponseBodyDataRelateApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeSecretResponseBodyDataRelateApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class DescribeSecretResponseBodyData extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The associated application.</p>
         */
        @NameInMap("RelateApps")
        public java.util.List<DescribeSecretResponseBodyDataRelateApps> relateApps;

        /**
         * <p>Secret key-value pair data.</p>
         */
        @NameInMap("SecretData")
        public java.util.Map<String, String> secretData;

        /**
         * <p>The ID of the Secret instance.</p>
         */
        @NameInMap("SecretId")
        public Long secretId;

        /**
         * <p>The name of the Secret instance.</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <p>The type of the Secret instance.</p>
         */
        @NameInMap("SecretType")
        public String secretType;

        /**
         * <p>The time when the task was updated.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeSecretResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecretResponseBodyData self = new DescribeSecretResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSecretResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSecretResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeSecretResponseBodyData setRelateApps(java.util.List<DescribeSecretResponseBodyDataRelateApps> relateApps) {
            this.relateApps = relateApps;
            return this;
        }
        public java.util.List<DescribeSecretResponseBodyDataRelateApps> getRelateApps() {
            return this.relateApps;
        }

        public DescribeSecretResponseBodyData setSecretData(java.util.Map<String, String> secretData) {
            this.secretData = secretData;
            return this;
        }
        public java.util.Map<String, String> getSecretData() {
            return this.secretData;
        }

        public DescribeSecretResponseBodyData setSecretId(Long secretId) {
            this.secretId = secretId;
            return this;
        }
        public Long getSecretId() {
            return this.secretId;
        }

        public DescribeSecretResponseBodyData setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

        public DescribeSecretResponseBodyData setSecretType(String secretType) {
            this.secretType = secretType;
            return this;
        }
        public String getSecretType() {
            return this.secretType;
        }

        public DescribeSecretResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
