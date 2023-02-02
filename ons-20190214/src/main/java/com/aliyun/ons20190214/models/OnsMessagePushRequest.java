// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessagePushRequest extends TeaModel {
    /**
     * <p>The ID of the consumer. You can call the [OnsConsumerGetConnection](~~29598~~) operation to query the ID of each consumer in a consumer group.</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The ID of the consumer group. For information about what a consumer group is, see [Terms](~~29533~~).</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the Message Queue for Apache RocketMQ instance to which the specified consumer group belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the message.</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    /**
     * <p>The topic to which the message is pushed.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsMessagePushRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMessagePushRequest self = new OnsMessagePushRequest();
        return TeaModel.build(map, self);
    }

    public OnsMessagePushRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public OnsMessagePushRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsMessagePushRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsMessagePushRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public OnsMessagePushRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
