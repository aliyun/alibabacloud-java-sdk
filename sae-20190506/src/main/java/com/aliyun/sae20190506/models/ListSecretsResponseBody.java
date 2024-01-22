// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSecretsResponseBody extends TeaModel {
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
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListSecretsResponseBodyData data;

    /**
     * <p>The error code returned. Take note of the following rules:</p>
     * <br>
     * <p>*   If the call is successful, the **ErrorCode** parameter is not returned.</p>
     * <p>*   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message. Take note of the following rules:</p>
     * <br>
     * <p>*   If the call is successful, **success** is returned.</p>
     * <p>*   If the call fails, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListSecretsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecretsResponseBody self = new ListSecretsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecretsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSecretsResponseBody setData(ListSecretsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSecretsResponseBodyData getData() {
        return this.data;
    }

    public ListSecretsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSecretsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecretsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecretsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSecretsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListSecretsResponseBodyDataSecretsRelateApps extends TeaModel {
        /**
         * <p>The application ID.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         */
        @NameInMap("AppName")
        public String appName;

        public static ListSecretsResponseBodyDataSecretsRelateApps build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseBodyDataSecretsRelateApps self = new ListSecretsResponseBodyDataSecretsRelateApps();
            return TeaModel.build(map, self);
        }

        public ListSecretsResponseBodyDataSecretsRelateApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListSecretsResponseBodyDataSecretsRelateApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class ListSecretsResponseBodyDataSecrets extends TeaModel {
        /**
         * <p>The time when the Secret was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The namespace ID.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The associated applications.</p>
         */
        @NameInMap("RelateApps")
        public java.util.List<ListSecretsResponseBodyDataSecretsRelateApps> relateApps;

        /**
         * <p>The Secret ID.</p>
         */
        @NameInMap("SecretId")
        public Long secretId;

        /**
         * <p>The Secret name.</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <p>The Secret type.</p>
         * <br>
         * <p>Set the value to **kubernetes.io/dockerconfigjson**. The value indicates the secret for the username and password of the image repository and is used for authentication when images are pulled during application deployment.</p>
         */
        @NameInMap("SecretType")
        public String secretType;

        /**
         * <p>The time when the Secret was updated.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListSecretsResponseBodyDataSecrets build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseBodyDataSecrets self = new ListSecretsResponseBodyDataSecrets();
            return TeaModel.build(map, self);
        }

        public ListSecretsResponseBodyDataSecrets setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListSecretsResponseBodyDataSecrets setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListSecretsResponseBodyDataSecrets setRelateApps(java.util.List<ListSecretsResponseBodyDataSecretsRelateApps> relateApps) {
            this.relateApps = relateApps;
            return this;
        }
        public java.util.List<ListSecretsResponseBodyDataSecretsRelateApps> getRelateApps() {
            return this.relateApps;
        }

        public ListSecretsResponseBodyDataSecrets setSecretId(Long secretId) {
            this.secretId = secretId;
            return this;
        }
        public Long getSecretId() {
            return this.secretId;
        }

        public ListSecretsResponseBodyDataSecrets setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

        public ListSecretsResponseBodyDataSecrets setSecretType(String secretType) {
            this.secretType = secretType;
            return this;
        }
        public String getSecretType() {
            return this.secretType;
        }

        public ListSecretsResponseBodyDataSecrets setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListSecretsResponseBodyData extends TeaModel {
        /**
         * <p>The Secrets.</p>
         */
        @NameInMap("Secrets")
        public java.util.List<ListSecretsResponseBodyDataSecrets> secrets;

        public static ListSecretsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseBodyData self = new ListSecretsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSecretsResponseBodyData setSecrets(java.util.List<ListSecretsResponseBodyDataSecrets> secrets) {
            this.secrets = secrets;
            return this;
        }
        public java.util.List<ListSecretsResponseBodyDataSecrets> getSecrets() {
            return this.secrets;
        }

    }

}
