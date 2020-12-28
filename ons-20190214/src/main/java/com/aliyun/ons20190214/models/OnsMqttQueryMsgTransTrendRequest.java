// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryMsgTransTrendRequest extends TeaModel {
    @NameInMap("TpsType")
    public String tpsType;

    @NameInMap("TransType")
    public String transType;

    @NameInMap("ParentTopic")
    public String parentTopic;

    @NameInMap("SubTopic")
    public String subTopic;

    @NameInMap("MsgType")
    public String msgType;

    @NameInMap("Qos")
    public Integer qos;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMqttQueryMsgTransTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryMsgTransTrendRequest self = new OnsMqttQueryMsgTransTrendRequest();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryMsgTransTrendRequest setTpsType(String tpsType) {
        this.tpsType = tpsType;
        return this;
    }
    public String getTpsType() {
        return this.tpsType;
    }

    public OnsMqttQueryMsgTransTrendRequest setTransType(String transType) {
        this.transType = transType;
        return this;
    }
    public String getTransType() {
        return this.transType;
    }

    public OnsMqttQueryMsgTransTrendRequest setParentTopic(String parentTopic) {
        this.parentTopic = parentTopic;
        return this;
    }
    public String getParentTopic() {
        return this.parentTopic;
    }

    public OnsMqttQueryMsgTransTrendRequest setSubTopic(String subTopic) {
        this.subTopic = subTopic;
        return this;
    }
    public String getSubTopic() {
        return this.subTopic;
    }

    public OnsMqttQueryMsgTransTrendRequest setMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }
    public String getMsgType() {
        return this.msgType;
    }

    public OnsMqttQueryMsgTransTrendRequest setQos(Integer qos) {
        this.qos = qos;
        return this;
    }
    public Integer getQos() {
        return this.qos;
    }

    public OnsMqttQueryMsgTransTrendRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public OnsMqttQueryMsgTransTrendRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public OnsMqttQueryMsgTransTrendRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
