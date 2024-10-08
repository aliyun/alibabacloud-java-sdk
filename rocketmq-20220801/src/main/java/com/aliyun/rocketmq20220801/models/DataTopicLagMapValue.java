// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DataTopicLagMapValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("readyCount")
    public Long readyCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("inflightCount")
    public Long inflightCount;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("deliveryDuration")
    public Long deliveryDuration;

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

}
