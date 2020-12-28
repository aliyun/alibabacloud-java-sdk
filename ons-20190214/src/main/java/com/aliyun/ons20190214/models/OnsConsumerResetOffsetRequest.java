// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerResetOffsetRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("ResetTimestamp")
    public Long resetTimestamp;

    @NameInMap("InstanceId")
    public String instanceId;

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

    public OnsConsumerResetOffsetRequest setResetTimestamp(Long resetTimestamp) {
        this.resetTimestamp = resetTimestamp;
        return this;
    }
    public Long getResetTimestamp() {
        return this.resetTimestamp;
    }

    public OnsConsumerResetOffsetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
