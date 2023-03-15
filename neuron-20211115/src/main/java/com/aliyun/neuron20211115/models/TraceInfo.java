// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class TraceInfo extends TeaModel {
    @NameInMap("duration")
    public Long duration;

    @NameInMap("operationName")
    public String operationName;

    @NameInMap("serviceIp")
    public String serviceIp;

    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("timestamp")
    public Long timestamp;

    @NameInMap("traceId")
    public String traceId;

    public static TraceInfo build(java.util.Map<String, ?> map) throws Exception {
        TraceInfo self = new TraceInfo();
        return TeaModel.build(map, self);
    }

    public TraceInfo setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public TraceInfo setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public TraceInfo setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public TraceInfo setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public TraceInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public TraceInfo setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
