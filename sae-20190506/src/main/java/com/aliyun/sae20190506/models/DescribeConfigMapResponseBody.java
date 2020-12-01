// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigMapResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeConfigMapResponseBodyData data;

    public static DescribeConfigMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigMapResponseBody self = new DescribeConfigMapResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigMapResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeConfigMapResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeConfigMapResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeConfigMapResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DescribeConfigMapResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeConfigMapResponseBody setData(DescribeConfigMapResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeConfigMapResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeConfigMapResponseBodyDataRelateApps extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppName")
        @Validation(required = true)
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
        @NameInMap("ConfigMapId")
        @Validation(required = true)
        public Long configMapId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("NamespaceId")
        @Validation(required = true)
        public String namespaceId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Data")
        @Validation(required = true)
        public java.util.Map<String, ?> data;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("RelateApps")
        @Validation(required = true)
        public java.util.List<DescribeConfigMapResponseBodyDataRelateApps> relateApps;

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

        public DescribeConfigMapResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConfigMapResponseBodyData setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public DescribeConfigMapResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeConfigMapResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeConfigMapResponseBodyData setRelateApps(java.util.List<DescribeConfigMapResponseBodyDataRelateApps> relateApps) {
            this.relateApps = relateApps;
            return this;
        }
        public java.util.List<DescribeConfigMapResponseBodyDataRelateApps> getRelateApps() {
            return this.relateApps;
        }

    }

}
