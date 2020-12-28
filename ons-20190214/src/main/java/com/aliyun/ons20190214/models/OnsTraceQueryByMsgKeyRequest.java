// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceQueryByMsgKeyRequest extends TeaModel {
    @NameInMap("Topic")
    public String topic;

    @NameInMap("MsgKey")
    public String msgKey;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsTraceQueryByMsgKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceQueryByMsgKeyRequest self = new OnsTraceQueryByMsgKeyRequest();
        return TeaModel.build(map, self);
    }

    public OnsTraceQueryByMsgKeyRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsTraceQueryByMsgKeyRequest setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
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

}
