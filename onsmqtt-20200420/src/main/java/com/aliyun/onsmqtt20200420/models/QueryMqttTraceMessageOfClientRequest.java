// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessageOfClientRequest extends TeaModel {
    @NameInMap("MqttRegionId")
    public String mqttRegionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Reverse")
    public Boolean reverse;

    public static QueryMqttTraceMessageOfClientRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceMessageOfClientRequest self = new QueryMqttTraceMessageOfClientRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceMessageOfClientRequest setMqttRegionId(String mqttRegionId) {
        this.mqttRegionId = mqttRegionId;
        return this;
    }
    public String getMqttRegionId() {
        return this.mqttRegionId;
    }

    public QueryMqttTraceMessageOfClientRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMqttTraceMessageOfClientRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryMqttTraceMessageOfClientRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QueryMqttTraceMessageOfClientRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMqttTraceMessageOfClientRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryMqttTraceMessageOfClientRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMqttTraceMessageOfClientRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

}
