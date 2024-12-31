// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DataTopicLagMapValue extends TeaModel {
    /**
     * <p>Ready message count</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("readyCount")
    public Long readyCount;

    /**
     * <p>The number of messages being consumed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("inflightCount")
    public Long inflightCount;

    /**
     * <p>Delivery delay time, in seconds</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("deliveryDuration")
    public Long deliveryDuration;

    @NameInMap("lastConsumeTimestamp")
    public Long lastConsumeTimestamp;

    public static DataTopicLagMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataTopicLagMapValue self = new DataTopicLagMapValue();
        return TeaModel.build(map, self);
    }

    public DataTopicLagMapValue setReadyCount(Long readyCount) {
        this.readyCount = readyCount;
        return this;
    }
    public Long getReadyCount() {
        return this.readyCount;
    }

    public DataTopicLagMapValue setInflightCount(Long inflightCount) {
        this.inflightCount = inflightCount;
        return this;
    }
    public Long getInflightCount() {
        return this.inflightCount;
    }

    public DataTopicLagMapValue setDeliveryDuration(Long deliveryDuration) {
        this.deliveryDuration = deliveryDuration;
        return this;
    }
    public Long getDeliveryDuration() {
        return this.deliveryDuration;
    }

    public DataTopicLagMapValue setLastConsumeTimestamp(Long lastConsumeTimestamp) {
        this.lastConsumeTimestamp = lastConsumeTimestamp;
        return this;
    }
    public Long getLastConsumeTimestamp() {
        return this.lastConsumeTimestamp;
    }

}
