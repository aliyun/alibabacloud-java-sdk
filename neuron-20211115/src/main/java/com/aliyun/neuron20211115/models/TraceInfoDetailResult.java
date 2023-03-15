// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class TraceInfoDetailResult extends TeaModel {
    @NameInMap("traceDetails")
    public java.util.List<TraceInfoDetailResultTraceDetails> traceDetails;

    public static TraceInfoDetailResult build(java.util.Map<String, ?> map) throws Exception {
        TraceInfoDetailResult self = new TraceInfoDetailResult();
        return TeaModel.build(map, self);
    }

    public TraceInfoDetailResult setTraceDetails(java.util.List<TraceInfoDetailResultTraceDetails> traceDetails) {
        this.traceDetails = traceDetails;
        return this;
    }
    public java.util.List<TraceInfoDetailResultTraceDetails> getTraceDetails() {
        return this.traceDetails;
    }

    public static class TraceInfoDetailResultTraceDetails extends TeaModel {
        @NameInMap("children")
        public java.util.List<java.util.Map<String, ?>> children;

        @NameInMap("duration")
        public Long duration;

        @NameInMap("haveStack")
        public Boolean haveStack;

        @NameInMap("logEventList")
        public java.util.List<TraceSpansLogEventList> logEventList;

        @NameInMap("operationName")
        public String operationName;

        @NameInMap("parentSpanId")
        public String parentSpanId;

        @NameInMap("resultCode")
        public String resultCode;

        @NameInMap("rpcId")
        public String rpcId;

        @NameInMap("rpcType")
        public Long rpcType;

        @NameInMap("rpcTypeName")
        public String rpcTypeName;

        @NameInMap("serviceIp")
        public String serviceIp;

        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("spanId")
        public String spanId;

        @NameInMap("tagEntryList")
        public java.util.List<TagEntry> tagEntryList;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("traceId")
        public String traceId;

        public static TraceInfoDetailResultTraceDetails build(java.util.Map<String, ?> map) throws Exception {
            TraceInfoDetailResultTraceDetails self = new TraceInfoDetailResultTraceDetails();
            return TeaModel.build(map, self);
        }

        public TraceInfoDetailResultTraceDetails setChildren(java.util.List<java.util.Map<String, ?>> children) {
            this.children = children;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getChildren() {
            return this.children;
        }

        public TraceInfoDetailResultTraceDetails setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public TraceInfoDetailResultTraceDetails setHaveStack(Boolean haveStack) {
            this.haveStack = haveStack;
            return this;
        }
        public Boolean getHaveStack() {
            return this.haveStack;
        }

        public TraceInfoDetailResultTraceDetails setLogEventList(java.util.List<TraceSpansLogEventList> logEventList) {
            this.logEventList = logEventList;
            return this;
        }
        public java.util.List<TraceSpansLogEventList> getLogEventList() {
            return this.logEventList;
        }

        public TraceInfoDetailResultTraceDetails setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public TraceInfoDetailResultTraceDetails setParentSpanId(String parentSpanId) {
            this.parentSpanId = parentSpanId;
            return this;
        }
        public String getParentSpanId() {
            return this.parentSpanId;
        }

        public TraceInfoDetailResultTraceDetails setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public TraceInfoDetailResultTraceDetails setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public TraceInfoDetailResultTraceDetails setRpcType(Long rpcType) {
            this.rpcType = rpcType;
            return this;
        }
        public Long getRpcType() {
            return this.rpcType;
        }

        public TraceInfoDetailResultTraceDetails setRpcTypeName(String rpcTypeName) {
            this.rpcTypeName = rpcTypeName;
            return this;
        }
        public String getRpcTypeName() {
            return this.rpcTypeName;
        }

        public TraceInfoDetailResultTraceDetails setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public TraceInfoDetailResultTraceDetails setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public TraceInfoDetailResultTraceDetails setSpanId(String spanId) {
            this.spanId = spanId;
            return this;
        }
        public String getSpanId() {
            return this.spanId;
        }

        public TraceInfoDetailResultTraceDetails setTagEntryList(java.util.List<TagEntry> tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public java.util.List<TagEntry> getTagEntryList() {
            return this.tagEntryList;
        }

        public TraceInfoDetailResultTraceDetails setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public TraceInfoDetailResultTraceDetails setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
