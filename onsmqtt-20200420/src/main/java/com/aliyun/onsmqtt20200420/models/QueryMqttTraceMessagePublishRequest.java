// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessagePublishRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MqttRegionId")
    public String mqttRegionId;

    @NameInMap("MsgId")
    public String msgId;

    public static QueryMqttTraceMessagePublishRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceMessagePublishRequest self = new QueryMqttTraceMessagePublishRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceMessagePublishRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QueryMqttTraceMessagePublishRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMqttTraceMessagePublishRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMqttTraceMessagePublishRequest setMqttRegionId(String mqttRegionId) {
        this.mqttRegionId = mqttRegionId;
        return this;
    }
    public String getMqttRegionId() {
        return this.mqttRegionId;
    }

    public QueryMqttTraceMessagePublishRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

}
