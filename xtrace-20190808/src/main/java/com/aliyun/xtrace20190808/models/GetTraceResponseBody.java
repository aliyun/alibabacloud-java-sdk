// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTraceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Spans")
    public GetTraceResponseBodySpans spans;

    public static GetTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTraceResponseBody self = new GetTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTraceResponseBody setSpans(GetTraceResponseBodySpans spans) {
        this.spans = spans;
        return this;
    }
    public GetTraceResponseBodySpans getSpans() {
        return this.spans;
    }

    public static class GetTraceResponseBodySpansSpanTagEntryListTagEntry extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetTraceResponseBodySpansSpanTagEntryListTagEntry build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansSpanTagEntryListTagEntry self = new GetTraceResponseBodySpansSpanTagEntryListTagEntry();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansSpanTagEntryListTagEntry setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTraceResponseBodySpansSpanTagEntryListTagEntry setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTraceResponseBodySpansSpanTagEntryList extends TeaModel {
        @NameInMap("TagEntry")
        public java.util.List<GetTraceResponseBodySpansSpanTagEntryListTagEntry> tagEntry;

        public static GetTraceResponseBodySpansSpanTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansSpanTagEntryList self = new GetTraceResponseBodySpansSpanTagEntryList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansSpanTagEntryList setTagEntry(java.util.List<GetTraceResponseBodySpansSpanTagEntryListTagEntry> tagEntry) {
            this.tagEntry = tagEntry;
            return this;
        }
        public java.util.List<GetTraceResponseBodySpansSpanTagEntryListTagEntry> getTagEntry() {
            return this.tagEntry;
        }

    }

    public static class GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryListTagEntry extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryListTagEntry build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryListTagEntry self = new GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryListTagEntry();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryListTagEntry setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryListTagEntry setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryList extends TeaModel {
        @NameInMap("TagEntry")
        public java.util.List<GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryListTagEntry> tagEntry;

        public static GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryList self = new GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryList setTagEntry(java.util.List<GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryListTagEntry> tagEntry) {
            this.tagEntry = tagEntry;
            return this;
        }
        public java.util.List<GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryListTagEntry> getTagEntry() {
            return this.tagEntry;
        }

    }

    public static class GetTraceResponseBodySpansSpanLogEventListLogEvent extends TeaModel {
        @NameInMap("TagEntryList")
        public GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryList tagEntryList;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetTraceResponseBodySpansSpanLogEventListLogEvent build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansSpanLogEventListLogEvent self = new GetTraceResponseBodySpansSpanLogEventListLogEvent();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansSpanLogEventListLogEvent setTagEntryList(GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryList tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryList getTagEntryList() {
            return this.tagEntryList;
        }

        public GetTraceResponseBodySpansSpanLogEventListLogEvent setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetTraceResponseBodySpansSpanLogEventList extends TeaModel {
        @NameInMap("LogEvent")
        public java.util.List<GetTraceResponseBodySpansSpanLogEventListLogEvent> logEvent;

        public static GetTraceResponseBodySpansSpanLogEventList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansSpanLogEventList self = new GetTraceResponseBodySpansSpanLogEventList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansSpanLogEventList setLogEvent(java.util.List<GetTraceResponseBodySpansSpanLogEventListLogEvent> logEvent) {
            this.logEvent = logEvent;
            return this;
        }
        public java.util.List<GetTraceResponseBodySpansSpanLogEventListLogEvent> getLogEvent() {
            return this.logEvent;
        }

    }

    public static class GetTraceResponseBodySpansSpan extends TeaModel {
        @NameInMap("SpanId")
        public String spanId;

        @NameInMap("OperationName")
        public String operationName;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TagEntryList")
        public GetTraceResponseBodySpansSpanTagEntryList tagEntryList;

        @NameInMap("LogEventList")
        public GetTraceResponseBodySpansSpanLogEventList logEventList;

        @NameInMap("HaveStack")
        public Boolean haveStack;

        @NameInMap("ServiceIp")
        public String serviceIp;

        @NameInMap("ParentSpanId")
        public String parentSpanId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("TraceID")
        public String traceID;

        public static GetTraceResponseBodySpansSpan build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansSpan self = new GetTraceResponseBodySpansSpan();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansSpan setSpanId(String spanId) {
            this.spanId = spanId;
            return this;
        }
        public String getSpanId() {
            return this.spanId;
        }

        public GetTraceResponseBodySpansSpan setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public GetTraceResponseBodySpansSpan setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public GetTraceResponseBodySpansSpan setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetTraceResponseBodySpansSpan setTagEntryList(GetTraceResponseBodySpansSpanTagEntryList tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public GetTraceResponseBodySpansSpanTagEntryList getTagEntryList() {
            return this.tagEntryList;
        }

        public GetTraceResponseBodySpansSpan setLogEventList(GetTraceResponseBodySpansSpanLogEventList logEventList) {
            this.logEventList = logEventList;
            return this;
        }
        public GetTraceResponseBodySpansSpanLogEventList getLogEventList() {
            return this.logEventList;
        }

        public GetTraceResponseBodySpansSpan setHaveStack(Boolean haveStack) {
            this.haveStack = haveStack;
            return this;
        }
        public Boolean getHaveStack() {
            return this.haveStack;
        }

        public GetTraceResponseBodySpansSpan setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public GetTraceResponseBodySpansSpan setParentSpanId(String parentSpanId) {
            this.parentSpanId = parentSpanId;
            return this;
        }
        public String getParentSpanId() {
            return this.parentSpanId;
        }

        public GetTraceResponseBodySpansSpan setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetTraceResponseBodySpansSpan setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetTraceResponseBodySpansSpan setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetTraceResponseBodySpansSpan setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

    }

    public static class GetTraceResponseBodySpans extends TeaModel {
        @NameInMap("Span")
        public java.util.List<GetTraceResponseBodySpansSpan> span;

        public static GetTraceResponseBodySpans build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpans self = new GetTraceResponseBodySpans();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpans setSpan(java.util.List<GetTraceResponseBodySpansSpan> span) {
            this.span = span;
            return this;
        }
        public java.util.List<GetTraceResponseBodySpansSpan> getSpan() {
            return this.span;
        }

    }

}
