// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSecretsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListSecretsResponseBodyData data;

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
        @NameInMap("AppId")
        public String appId;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("RelateApps")
        public java.util.List<ListSecretsResponseBodyDataSecretsRelateApps> relateApps;

        @NameInMap("SecretId")
        public Long secretId;

        @NameInMap("SecretName")
        public String secretName;

        @NameInMap("SecretType")
        public String secretType;

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
