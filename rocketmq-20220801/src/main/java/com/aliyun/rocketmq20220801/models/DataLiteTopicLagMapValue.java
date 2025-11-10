// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DataLiteTopicLagMapValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("readyCount")
    public Long readyCount;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("deliveryDuration")
    public Long deliveryDuration;

    public static DataLiteTopicLagMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataLiteTopicLagMapValue self = new DataLiteTopicLagMapValue();
        return TeaModel.build(map, self);
    }

    public DataLiteTopicLagMapValue setReadyCount(Long readyCount) {
        this.readyCount = readyCount;
        return this;
    }
    public Long getReadyCount() {
        return this.readyCount;
    }

    public DataLiteTopicLagMapValue setDeliveryDuration(Long deliveryDuration) {
        this.deliveryDuration = deliveryDuration;
        return this;
    }
    public Long getDeliveryDuration() {
        return this.deliveryDuration;
    }

}
