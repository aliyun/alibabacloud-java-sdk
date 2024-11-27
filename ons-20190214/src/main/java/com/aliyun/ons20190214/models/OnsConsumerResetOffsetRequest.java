// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerResetOffsetRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group whose dead-letter message you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test_consumer_id</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance to which the consumer group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_111111111111_DOxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The timestamp to which you want to reset the consumer offset. This parameter takes effect only when the <strong>Type</strong> parameter is set to <strong>1</strong>. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1591153871000</p>
     */
    @NameInMap("ResetTimestamp")
    public Long resetTimestamp;

    /**
     * <p>The name of the topic for which you want to reset the consumer offset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-mq-topic</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The method that you want to use to clear accumulated messages. Valid values:</p>
     * <ul>
     * <li><strong>0:</strong> All accumulated messages are cleared. Messages that are not consumed are ignored. Consumers in the specified consumer group consume only messages that are published to the topic after the specified point in time.</li>
     * </ul>
     * <p>If &quot;reconsumeLater&quot; is returned, the accumulated messages are not cleared because the system is retrying to resend the messages to consumers.</p>
     * <ul>
     * <li><strong>1:</strong> The messages that were published to the topic before the specified point in time are cleared. You must specify a point in time. Consumers in the specified consumer group consume only the messages that are published to the topic after the specified point in time.</li>
     * </ul>
     * <p>You can specify a point in time from the earliest point in time when a message was published to the topic to the most recent point in time when a message was published to the topic. Points in time that are not within the allowed time range are invalid.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static OnsConsumerResetOffsetRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerResetOffsetRequest self = new OnsConsumerResetOffsetRequest();
        return TeaModel.build(map, self);
    }

    public OnsConsumerResetOffsetRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsConsumerResetOffsetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsConsumerResetOffsetRequest setResetTimestamp(Long resetTimestamp) {
        this.resetTimestamp = resetTimestamp;
        return this;
    }
    public Long getResetTimestamp() {
        return this.resetTimestamp;
    }

    public OnsConsumerResetOffsetRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsConsumerResetOffsetRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
