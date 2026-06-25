// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSecretsResponseBody extends TeaModel {
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
     * <p>The response object.</p>
     */
    @NameInMap("Data")
    public ListSecretsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>This parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request fails, an error message is returned.</p>
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
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID. You can use this ID to query the details of a call.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
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
         * <p>The time when the Secret instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1593760185111</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The associated applications.</p>
         */
        @NameInMap("RelateApps")
        public java.util.List<ListSecretsResponseBodyDataSecretsRelateApps> relateApps;

        /**
         * <p>The Secret instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("SecretId")
        public Long secretId;

        /**
         * <p>The Secret instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-auth</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <p>The type of the Secret instance. The only valid value is:</p>
         * <p><strong>kubernetes.io/dockerconfigjson</strong>: a Secret that stores credentials for a container image registry and is used to authenticate image pulls during deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>kubernetes.io/dockerconfigjson</p>
         */
        @NameInMap("SecretType")
        public String secretType;

        /**
         * <p>The time when the Secret instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1593760185111</p>
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
         * <p>A list of Secret instances.</p>
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
