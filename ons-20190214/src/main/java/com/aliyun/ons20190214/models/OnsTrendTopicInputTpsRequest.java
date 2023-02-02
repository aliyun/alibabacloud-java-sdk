// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendTopicInputTpsRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the Message Queue for Apache RocketMQ instance which contains the topic you want to query.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The sampling period. Unit: minutes. Valid values: 1, 5, and 10.</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The name of the topic that you want to query.</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The type of information that you want to query. Valid values:</p>
     * <br>
     * <p>*   **0**: the number of the messages that are published to the specified topic during each sampling period.</p>
     * <p>*   **1**: the TPS for message publishing to the specified topic during each sampling period.</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static OnsTrendTopicInputTpsRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendTopicInputTpsRequest self = new OnsTrendTopicInputTpsRequest();
        return TeaModel.build(map, self);
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

    public OnsTrendTopicInputTpsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsTrendTopicInputTpsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
