// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendGroupOutputTpsRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Period")
    public Long period;

    public static OnsTrendGroupOutputTpsRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendGroupOutputTpsRequest self = new OnsTrendGroupOutputTpsRequest();
        return TeaModel.build(map, self);
    }

    public OnsTrendGroupOutputTpsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsTrendGroupOutputTpsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsTrendGroupOutputTpsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public OnsTrendGroupOutputTpsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public OnsTrendGroupOutputTpsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public OnsTrendGroupOutputTpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTrendGroupOutputTpsRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

}
