// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotNodeMetricListRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Express")
    public String express;

    @NameInMap("Length")
    public String length;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Period")
    public String period;

    @NameInMap("StartTime")
    public String startTime;

    public static GetHoneypotNodeMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotNodeMetricListRequest self = new GetHoneypotNodeMetricListRequest();
        return TeaModel.build(map, self);
    }

    public GetHoneypotNodeMetricListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetHoneypotNodeMetricListRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

    public GetHoneypotNodeMetricListRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public GetHoneypotNodeMetricListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetHoneypotNodeMetricListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetHoneypotNodeMetricListRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetHoneypotNodeMetricListRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public GetHoneypotNodeMetricListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
