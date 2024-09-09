// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupSubscriptionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("filterExpression")
    public String filterExpression;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("filterType")
    public String filterType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>topic_test</p>
     */
    @NameInMap("topicName")
    public String topicName;

    public static DeleteConsumerGroupSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerGroupSubscriptionRequest self = new DeleteConsumerGroupSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerGroupSubscriptionRequest setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }
    public String getFilterExpression() {
        return this.filterExpression;
    }

    public DeleteConsumerGroupSubscriptionRequest setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public DeleteConsumerGroupSubscriptionRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
