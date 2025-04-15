// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListConsumerGroupSubscriptionsRequest extends TeaModel {
    /**
     * <p>The topic name. If you do not specify this parameter, all subscriptions of the consumer group are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>topic_test</p>
     */
    @NameInMap("topicName")
    public String topicName;

    public static ListConsumerGroupSubscriptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupSubscriptionsRequest self = new ListConsumerGroupSubscriptionsRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupSubscriptionsRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
