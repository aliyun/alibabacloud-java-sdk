// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerResetOffsetRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group for which you want to reset the consumer offset.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance to which the consumer group belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The timestamp to which you want to reset the consumer offset. This parameter takes effect only when the **Type** parameter is set to **1**. Unit: milliseconds.</p>
     */
    @NameInMap("ResetTimestamp")
    public Long resetTimestamp;

    /**
     * <p>The name of the topic for which you want to reset the consumer offset.</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The method that you want to use to clear accumulated messages. Valid values:</p>
     * <br>
     * <p>*   **0:** All accumulated messages are cleared. Messages that are not consumed are ignored. Consumers in the specified consumer group consume only messages that are published to the topic after the current point in time.</p>
     * <br>
     * <p>If "reconsumeLater" is returned, the accumulated messages are not cleared because the system is retrying to send the messages to consumers.</p>
     * <br>
     * <p>*   **1:** The messages that were published to the topic before a specified point in time are cleared. You must specify a point in time. Consumers in the specified consumer group consume only the messages that are published to the topic after the specified point in time.</p>
     * <br>
     * <p>You can specify a point in time within the time range that is from the earliest point in time when a message was published to the topic to the most recent point in time when a message was published to the topic. Points in time that are not within the allowed time range are invalid.</p>
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
