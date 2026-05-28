// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ConsumerGroup extends TeaModel {
    /**
     * <p>The name of the consumer group.</p>
     * 
     * <strong>example:</strong>
     * <p>test-consumer-group</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether to consume data in sequence. Valid values:</p>
     * <ul>
     * <li>true: If a shard is split, the data in the original shard is consumed first. Then, the data in the new shards is consumed at the same time. If shards are merged, the data in the original shards is consumed first. Then, the data in the new shard is consumed.</li>
     * <li>false: The data in all shards is consumed at the same time. If a new shard is generated after a shard is split or shards are merged, the data in the new shard is immediately consumed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("order")
    public Boolean order;

    /**
     * <p>The timeout period. If Simple Log Service does not receive heartbeats from a consumer within the timeout period, Simple Log Service deletes the consumer. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static ConsumerGroup build(java.util.Map<String, ?> map) throws Exception {
        ConsumerGroup self = new ConsumerGroup();
        return TeaModel.build(map, self);
    }

    public ConsumerGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConsumerGroup setOrder(Boolean order) {
        this.order = order;
        return this;
    }
    public Boolean getOrder() {
        return this.order;
    }

    public ConsumerGroup setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
