// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessageSubscribeRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MqttRegionId")
    public String mqttRegionId;

    @NameInMap("MsgId")
    public String msgId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Reverse")
    public Boolean reverse;

    public static QueryMqttTraceMessageSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceMessageSubscribeRequest self = new QueryMqttTraceMessageSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceMessageSubscribeRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QueryMqttTraceMessageSubscribeRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryMqttTraceMessageSubscribeRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryMqttTraceMessageSubscribeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMqttTraceMessageSubscribeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMqttTraceMessageSubscribeRequest setMqttRegionId(String mqttRegionId) {
        this.mqttRegionId = mqttRegionId;
        return this;
    }
    public String getMqttRegionId() {
        return this.mqttRegionId;
    }

    public QueryMqttTraceMessageSubscribeRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public QueryMqttTraceMessageSubscribeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMqttTraceMessageSubscribeRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

}
