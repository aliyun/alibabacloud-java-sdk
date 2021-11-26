// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListConsumedServicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListConsumedServicesResponseBodyData> data;

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

    public static ListConsumedServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumedServicesResponseBody self = new ListConsumedServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumedServicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsumedServicesResponseBody setData(java.util.List<ListConsumedServicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListConsumedServicesResponseBodyData> getData() {
        return this.data;
    }

    public ListConsumedServicesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListConsumedServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConsumedServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConsumedServicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListConsumedServicesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListConsumedServicesResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Group2Ip")
        public String group2Ip;

        @NameInMap("Groups")
        public java.util.List<String> groups;

        @NameInMap("Ips")
        public java.util.List<String> ips;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static ListConsumedServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConsumedServicesResponseBodyData self = new ListConsumedServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConsumedServicesResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListConsumedServicesResponseBodyData setGroup2Ip(String group2Ip) {
            this.group2Ip = group2Ip;
            return this;
        }
        public String getGroup2Ip() {
            return this.group2Ip;
        }

        public ListConsumedServicesResponseBodyData setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        public ListConsumedServicesResponseBodyData setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public ListConsumedServicesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConsumedServicesResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListConsumedServicesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
