// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessagePushRequest extends TeaModel {
    /**
     * <p>The ID of the consumer client. You can call the <a href="https://help.aliyun.com/document_detail/29598.html">OnsConsumerGetConnection</a> operation to query client IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30.5.121.**@24813#-1999745829#-1737591554#453111174894656</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The ID of the consumer group. For information about what a consumer group is, see <a href="https://help.aliyun.com/document_detail/29533.html">Terms</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test_group_id</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the ApsaraMQ for RocketMQ instance to which the specified consumer group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_111111111111_DOxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0BC1669963053CF68F733BB70396****</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    /**
     * <p>The topic to which the message is pushed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-mq_topic</p>
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
