// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTSpansResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Spans")
    public java.util.List<ListDSTSpansResponseBodySpans> spans;

    public static ListDSTSpansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDSTSpansResponseBody self = new ListDSTSpansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDSTSpansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDSTSpansResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDSTSpansResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDSTSpansResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDSTSpansResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDSTSpansResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDSTSpansResponseBody setSpans(java.util.List<ListDSTSpansResponseBodySpans> spans) {
        this.spans = spans;
        return this;
    }
    public java.util.List<ListDSTSpansResponseBodySpans> getSpans() {
        return this.spans;
    }

    public static class ListDSTSpansResponseBodySpansTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListDSTSpansResponseBodySpansTags build(java.util.Map<String, ?> map) throws Exception {
            ListDSTSpansResponseBodySpansTags self = new ListDSTSpansResponseBodySpansTags();
            return TeaModel.build(map, self);
        }

        public ListDSTSpansResponseBodySpansTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDSTSpansResponseBodySpansTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDSTSpansResponseBodySpans extends TeaModel {
        @NameInMap("BasicInfo")
        public String basicInfo;

        @NameInMap("Component")
        public String component;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EnvInstanceId")
        public String envInstanceId;

        @NameInMap("Kind")
        public String kind;

        @NameInMap("LocalInfo")
        public String localInfo;

        @NameInMap("LocalIpv4")
        public String localIpv4;

        @NameInMap("LocalServiceName")
        public String localServiceName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("RemoteInfo")
        public String remoteInfo;

        @NameInMap("RemoteIpv4")
        public String remoteIpv4;

        @NameInMap("RemoteServiceName")
        public String remoteServiceName;

        @NameInMap("Result")
        public String result;

        @NameInMap("SpanId")
        public String spanId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Tags")
        public java.util.List<ListDSTSpansResponseBodySpansTags> tags;

        public static ListDSTSpansResponseBodySpans build(java.util.Map<String, ?> map) throws Exception {
            ListDSTSpansResponseBodySpans self = new ListDSTSpansResponseBodySpans();
            return TeaModel.build(map, self);
        }

        public ListDSTSpansResponseBodySpans setBasicInfo(String basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }
        public String getBasicInfo() {
            return this.basicInfo;
        }

        public ListDSTSpansResponseBodySpans setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public ListDSTSpansResponseBodySpans setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListDSTSpansResponseBodySpans setEnvInstanceId(String envInstanceId) {
            this.envInstanceId = envInstanceId;
            return this;
        }
        public String getEnvInstanceId() {
            return this.envInstanceId;
        }

        public ListDSTSpansResponseBodySpans setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListDSTSpansResponseBodySpans setLocalInfo(String localInfo) {
            this.localInfo = localInfo;
            return this;
        }
        public String getLocalInfo() {
            return this.localInfo;
        }

        public ListDSTSpansResponseBodySpans setLocalIpv4(String localIpv4) {
            this.localIpv4 = localIpv4;
            return this;
        }
        public String getLocalIpv4() {
            return this.localIpv4;
        }

        public ListDSTSpansResponseBodySpans setLocalServiceName(String localServiceName) {
            this.localServiceName = localServiceName;
            return this;
        }
        public String getLocalServiceName() {
            return this.localServiceName;
        }

        public ListDSTSpansResponseBodySpans setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDSTSpansResponseBodySpans setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListDSTSpansResponseBodySpans setRemoteInfo(String remoteInfo) {
            this.remoteInfo = remoteInfo;
            return this;
        }
        public String getRemoteInfo() {
            return this.remoteInfo;
        }

        public ListDSTSpansResponseBodySpans setRemoteIpv4(String remoteIpv4) {
            this.remoteIpv4 = remoteIpv4;
            return this;
        }
        public String getRemoteIpv4() {
            return this.remoteIpv4;
        }

        public ListDSTSpansResponseBodySpans setRemoteServiceName(String remoteServiceName) {
            this.remoteServiceName = remoteServiceName;
            return this;
        }
        public String getRemoteServiceName() {
            return this.remoteServiceName;
        }

        public ListDSTSpansResponseBodySpans setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListDSTSpansResponseBodySpans setSpanId(String spanId) {
            this.spanId = spanId;
            return this;
        }
        public String getSpanId() {
            return this.spanId;
        }

        public ListDSTSpansResponseBodySpans setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListDSTSpansResponseBodySpans setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public ListDSTSpansResponseBodySpans setTags(java.util.List<ListDSTSpansResponseBodySpansTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListDSTSpansResponseBodySpansTags> getTags() {
            return this.tags;
        }

    }

}
