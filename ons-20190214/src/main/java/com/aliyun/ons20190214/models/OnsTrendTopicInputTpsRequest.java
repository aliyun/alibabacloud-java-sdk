// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendTopicInputTpsRequest extends TeaModel {
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

    public static OnsTrendTopicInputTpsRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendTopicInputTpsRequest self = new OnsTrendTopicInputTpsRequest();
        return TeaModel.build(map, self);
    }

    public OnsTrendTopicInputTpsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsTrendTopicInputTpsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public OnsTrendTopicInputTpsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public OnsTrendTopicInputTpsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public OnsTrendTopicInputTpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTrendTopicInputTpsRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

}
