// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResetMqSofamqConsumerOffsetRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResetTimestamp")
    public Long resetTimestamp;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("Type")
    public Long type;

    public static ResetMqSofamqConsumerOffsetRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetMqSofamqConsumerOffsetRequest self = new ResetMqSofamqConsumerOffsetRequest();
        return TeaModel.build(map, self);
    }

    public ResetMqSofamqConsumerOffsetRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public ResetMqSofamqConsumerOffsetRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ResetMqSofamqConsumerOffsetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetMqSofamqConsumerOffsetRequest setResetTimestamp(Long resetTimestamp) {
        this.resetTimestamp = resetTimestamp;
        return this;
    }
    public Long getResetTimestamp() {
        return this.resetTimestamp;
    }

    public ResetMqSofamqConsumerOffsetRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ResetMqSofamqConsumerOffsetRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
