// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupRequest extends TeaModel {
    /**
     * <p>The name of the consumer group. The name must be unique in a project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consumerGroupX</p>
     */
    @NameInMap("consumerGroup")
    public String consumerGroup;

    /**
     * <p>Specifies whether to consume data in sequence. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <ul>
     * <li>In a shard, data is consumed in ascending order based on the value of the \<em>\</em><strong>tag</strong>:<strong>receive_time</strong>\<em>\</em> field.</li>
     * <li>If a shard is split, data in the original shard is consumed first. Then, data in the new shards is consumed at the same time.</li>
     * <li>If shards are merged, data in the original shards is consumed first. Then, data in the new shard is consumed.</li>
     * </ul>
     * </li>
     * <li><p>false Data in all shards is consumed at the same time. If a new shard is generated after a shard is split or after shards are merged, data in the new shard is immediately consumed.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("order")
    public Boolean order;

    /**
     * <p>The timeout period. If the server does not receive heartbeats from a consumer within the timeout period, the server deletes the consumer. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static CreateConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupRequest self = new CreateConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupRequest setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    public CreateConsumerGroupRequest setOrder(Boolean order) {
        this.order = order;
        return this;
    }
    public Boolean getOrder() {
        return this.order;
    }

    public CreateConsumerGroupRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
