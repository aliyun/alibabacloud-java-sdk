// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigMapResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeConfigMapResponseBodyData data;

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
        @NameInMap("AppId")
        public String appId;

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
        @NameInMap("ConfigMapId")
        public Long configMapId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("RelateApps")
        public java.util.List<DescribeConfigMapResponseBodyDataRelateApps> relateApps;

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
