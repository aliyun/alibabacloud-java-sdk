// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupSubscriptionRequest extends TeaModel {
    /**
     * <p>The filter expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("filterExpression")
    public String filterExpression;

    /**
     * <p>The type of the filter expression. Valid values:</p>
     * <ul>
     * <li>SQL: filters messages by using SQL expressions.</li>
     * <li>TAG: filters messages by using tags.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TAG</p>
     */
    @NameInMap("filterType")
    public String filterType;

    /**
     * <p>The topic name.</p>
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
