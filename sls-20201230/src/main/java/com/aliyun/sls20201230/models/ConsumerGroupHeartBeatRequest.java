// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ConsumerGroupHeartBeatRequest extends TeaModel {
    /**
     * <p>The IDs of shards whose data is being consumed.</p>
     */
    @NameInMap("body")
    public java.util.List<Integer> body;

    /**
     * <p>The consumer.</p>
     */
    @NameInMap("consumer")
    public String consumer;

    public static ConsumerGroupHeartBeatRequest build(java.util.Map<String, ?> map) throws Exception {
        ConsumerGroupHeartBeatRequest self = new ConsumerGroupHeartBeatRequest();
        return TeaModel.build(map, self);
    }

    public ConsumerGroupHeartBeatRequest setBody(java.util.List<Integer> body) {
        this.body = body;
        return this;
    }
    public java.util.List<Integer> getBody() {
        return this.body;
    }

    public ConsumerGroupHeartBeatRequest setConsumer(String consumer) {
        this.consumer = consumer;
        return this;
    }
    public String getConsumer() {
        return this.consumer;
    }

}
