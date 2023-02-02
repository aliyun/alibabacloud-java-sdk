// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceQueryByMsgIdRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the Message Queue for Apache RocketMQ instance which contains the specified topic.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the message that you want to query.</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    /**
     * <p>The topic in which the message you want to query is stored.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsTraceQueryByMsgIdRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceQueryByMsgIdRequest self = new OnsTraceQueryByMsgIdRequest();
        return TeaModel.build(map, self);
    }

    public OnsTraceQueryByMsgIdRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public OnsTraceQueryByMsgIdRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public OnsTraceQueryByMsgIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTraceQueryByMsgIdRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public OnsTraceQueryByMsgIdRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
