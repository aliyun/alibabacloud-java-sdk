// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTraceInfoNodeRequest extends TeaModel {
    @NameInMap("EventName")
    public String eventName;

    @NameInMap("From")
    public String from;

    @NameInMap("IncidentTime")
    public Long incidentTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeTraceInfoNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceInfoNodeRequest self = new DescribeTraceInfoNodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTraceInfoNodeRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeTraceInfoNodeRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeTraceInfoNodeRequest setIncidentTime(Long incidentTime) {
        this.incidentTime = incidentTime;
        return this;
    }
    public Long getIncidentTime() {
        return this.incidentTime;
    }

    public DescribeTraceInfoNodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTraceInfoNodeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeTraceInfoNodeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeTraceInfoNodeRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeTraceInfoNodeRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
