// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageDetailRequest extends TeaModel {
    /**
     * <p>The ID of the Message Queue for Apache RocketMQ Instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the message that you want to query.</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    /**
     * <p>The name of the topic in which the message you want to query is stored.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsMessageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageDetailRequest self = new OnsMessageDetailRequest();
        return TeaModel.build(map, self);
    }

    public OnsMessageDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsMessageDetailRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public OnsMessageDetailRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
