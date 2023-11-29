// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateConsumerGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to consume data in sequence. Valid values:</p>
     * <br>
     * <p>*   true: If a shard is split, the data in the original shard is consumed first. Then, the data in the new shards is consumed at the same time. If shards are merged, the data in the original shards is consumed first. Then, the data in the new shard is consumed.</p>
     * <p>*   false: The data in all shards is consumed at the same time. If a new shard is generated after a shard is split or shards are merged, the data in the new shard is immediately consumed.</p>
     */
    @NameInMap("order")
    public Boolean order;

    /**
     * <p>The timeout period. If Simple Log Service does not receive heartbeats from a consumer within the timeout period, Simple Log Service deletes the consumer. Unit: seconds.</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static UpdateConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerGroupRequest self = new UpdateConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerGroupRequest setOrder(Boolean order) {
        this.order = order;
        return this;
    }
    public Boolean getOrder() {
        return this.order;
    }

    public UpdateConsumerGroupRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
