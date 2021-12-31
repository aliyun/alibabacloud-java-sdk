// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ConsumerGroup extends TeaModel {
    // consumerGroup
    @NameInMap("name")
    public String name;

    // order
    @NameInMap("order")
    public Boolean order;

    // timeout
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
