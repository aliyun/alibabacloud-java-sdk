// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeSecretResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSecretResponseBodyData data;

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
        @NameInMap("AppId")
        public String appId;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("RelateApps")
        public java.util.List<DescribeSecretResponseBodyDataRelateApps> relateApps;

        @NameInMap("SecretData")
        public java.util.Map<String, String> secretData;

        @NameInMap("SecretId")
        public Long secretId;

        @NameInMap("SecretName")
        public String secretName;

        @NameInMap("SecretType")
        public String secretType;

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
