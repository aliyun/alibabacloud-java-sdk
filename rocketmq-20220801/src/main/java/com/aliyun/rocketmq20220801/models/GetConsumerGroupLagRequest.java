// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerGroupLagRequest extends TeaModel {
    /**
     * <p>The topic name.</p>
     * 
     * <strong>example:</strong>
     * <p>normal-topic-1</p>
     */
    @NameInMap("topicName")
    public String topicName;

    public static GetConsumerGroupLagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerGroupLagRequest self = new GetConsumerGroupLagRequest();
        return TeaModel.build(map, self);
    }

    public GetConsumerGroupLagRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
