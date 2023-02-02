// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceQueryByMsgKeyRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the Message Queue for Apache RocketMQ instance that contains the specified topic.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The key of the messages that you want to query.</p>
     */
    @NameInMap("MsgKey")
    public String msgKey;

    /**
     * <p>The topic that contains the messages you want to query.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsTraceQueryByMsgKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceQueryByMsgKeyRequest self = new OnsTraceQueryByMsgKeyRequest();
        return TeaModel.build(map, self);
    }

    public OnsTraceQueryByMsgKeyRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public OnsTraceQueryByMsgKeyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public OnsTraceQueryByMsgKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTraceQueryByMsgKeyRequest setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
    }

    public OnsTraceQueryByMsgKeyRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
