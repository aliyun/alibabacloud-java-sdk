// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTraceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1E2B6A4C-6B83-4062-8B6F-AEEC1F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the trace.</p>
     */
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

    public static class GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryListTagEntry extends TeaModel {
        /**
         * <p>The tag key in the log event.</p>
         * 
         * <strong>example:</strong>
         * <p>logLevel</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value in the log event.</p>
         * 
         * <strong>example:</strong>
         * <p>Warning</p>
         */
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
        /**
         * <p>The tags in the log event.</p>
         */
        @NameInMap("TagEntryList")
        public GetTraceResponseBodySpansSpanLogEventListLogEventTagEntryList tagEntryList;

        /**
         * <p>The timestamp when the log event was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1583683202047000</p>
         */
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

    public static class GetTraceResponseBodySpansSpanTagEntryListTagEntry extends TeaModel {
        /**
         * <p>The tag key in the span.</p>
         * 
         * <strong>example:</strong>
         * <p>logLevel</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value in the span.</p>
         * 
         * <strong>example:</strong>
         * <p>Warning</p>
         */
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

    public static class GetTraceResponseBodySpansSpan extends TeaModel {
        /**
         * <p>The time used to call the trace. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Indicates whether the span has child spans. Valid values:</p>
         * <ul>
         * <li>true: The span has child spans. </li>
         * <li>false: The span has no child spans.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HaveStack")
        public Boolean haveStack;

        /**
         * <p>The log events in the trace.</p>
         */
        @NameInMap("LogEventList")
        public GetTraceResponseBodySpansSpanLogEventList logEventList;

        /**
         * <p>The name of the span.</p>
         * 
         * <strong>example:</strong>
         * <p>/api</p>
         */
        @NameInMap("OperationName")
        public String operationName;

        /**
         * <p>The ID of the parent span.</p>
         * 
         * <strong>example:</strong>
         * <p>fec891bb8f8XXX</p>
         */
        @NameInMap("ParentSpanId")
        public String parentSpanId;

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>The parent-child and sibling relationship between spans. For example, span 1.1 is the parent of span 1.1.1, and span 1.1.2 and span 1.1.1 are siblings.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1</p>
         */
        @NameInMap("RpcId")
        public String rpcId;

        /**
         * <p>The IP address of the server where the span resides.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XXX.XXX</p>
         */
        @NameInMap("ServiceIp")
        public String serviceIp;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>server1</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>Span ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fec891bb8f8XXX</p>
         */
        @NameInMap("SpanId")
        public String spanId;

        /**
         * <p>The tags in the span.</p>
         */
        @NameInMap("TagEntryList")
        public GetTraceResponseBodySpansSpanTagEntryList tagEntryList;

        /**
         * <p>The timestamp when the span was generated. Unit: microseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1689845513298000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The unique ID of the trace.</p>
         * 
         * <strong>example:</strong>
         * <p>1c6881aab84191a4****</p>
         */
        @NameInMap("TraceID")
        public String traceID;

        public static GetTraceResponseBodySpansSpan build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansSpan self = new GetTraceResponseBodySpansSpan();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansSpan setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetTraceResponseBodySpansSpan setHaveStack(Boolean haveStack) {
            this.haveStack = haveStack;
            return this;
        }
        public Boolean getHaveStack() {
            return this.haveStack;
        }

        public GetTraceResponseBodySpansSpan setLogEventList(GetTraceResponseBodySpansSpanLogEventList logEventList) {
            this.logEventList = logEventList;
            return this;
        }
        public GetTraceResponseBodySpansSpanLogEventList getLogEventList() {
            return this.logEventList;
        }

        public GetTraceResponseBodySpansSpan setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public GetTraceResponseBodySpansSpan setParentSpanId(String parentSpanId) {
            this.parentSpanId = parentSpanId;
            return this;
        }
        public String getParentSpanId() {
            return this.parentSpanId;
        }

        public GetTraceResponseBodySpansSpan setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public GetTraceResponseBodySpansSpan setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetTraceResponseBodySpansSpan setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public GetTraceResponseBodySpansSpan setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetTraceResponseBodySpansSpan setSpanId(String spanId) {
            this.spanId = spanId;
            return this;
        }
        public String getSpanId() {
            return this.spanId;
        }

        public GetTraceResponseBodySpansSpan setTagEntryList(GetTraceResponseBodySpansSpanTagEntryList tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public GetTraceResponseBodySpansSpanTagEntryList getTagEntryList() {
            return this.tagEntryList;
        }

        public GetTraceResponseBodySpansSpan setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
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
