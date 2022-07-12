// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ConsumerGroup extends TeaModel {
    // 消费者名称。
    @NameInMap("name")
    public String name;

    // 是否有序消费
    @NameInMap("order")
    public Boolean order;

    // 消费超时时长，单位为妙
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
