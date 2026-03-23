// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ConsumerGroup extends TeaModel {
    /**
     * <p>消费组名称。</p>
     * 
     * <strong>example:</strong>
     * <p>test-consumer-group</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>是否按顺序消费。</p>
     * <ul>
     * <li>true：在Shard中按顺序消费。Shard分裂后，先消费原Shard中数据，然后同时消费由该Shard分裂的Shard中数据。Shard合并后，先消费原Shard中数据，然后消费由原Shard合并后的新Shard中数据。</li>
     * <li>false：不按顺序消费。即所有同时开始消费，Shard分裂或者合并后产生的新Shard，也会立即消费。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("order")
    public Boolean order;

    /**
     * <p>超时时间。在超时时间段内没有收到心跳，消费者将被删除。单位：秒。</p>
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
