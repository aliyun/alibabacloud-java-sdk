// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageDetailRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for RocketMQ Instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_184681981******_BXig0x6A</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the message that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1E0578FE110F18B4AAC235C0******</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    /**
     * <p>The name of the topic in which the message you want to query is stored.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-mq_topic</p>
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
