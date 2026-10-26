// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupRequest extends TeaModel {
    /**
     * <p>The consumption retry policy of the consumer group to be created. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry</a>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("consumeRetryPolicy")
    public CreateConsumerGroupRequestConsumeRetryPolicy consumeRetryPolicy;

    /**
     * <p>The delivery order type of the consumer group to be created.</p>
     * <p>Valid parameter values:</p>
     * <ul>
     * <li>Concurrently: concurrent delivery</li>
     * <li>Orderly: ordered delivery</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Concurrently</p>
     */
    @NameInMap("deliveryOrderType")
    public String deliveryOrderType;

    /**
     * <p>Specifies whether to enable exclusive subscription, which means a LiteTopic can only be subscribed to by one consumer. Set to true to enable or false to shutdown.</p>
     */
    @NameInMap("exclusive")
    public Boolean exclusive;

    /**
     * <p>The maximum TPS for consuming messages.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxReceiveTps")
    public Long maxReceiveTps;

    /**
     * <p>The subscribe pattern for consumers:</p>
     * <ul>
     * <li>CLUSTERING: clustering consumption pattern. All consumers in the ConsumerGroup share the same subscription.</li>
     * <li>LITE_SELECTIVE: lightweight consumption pattern. Consumers in the ConsumerGroup can have different subscriptions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LITE_SELECTIVE</p>
     */
    @NameInMap("messageModel")
    public String messageModel;

    /**
     * <p>The remarks for the consumer group to be created.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the remark for test.</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>The name of the lite-type topic to subscribe to when using the LITE_SELECTIVE consumption pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>liteTopicTest</p>
     */
    @NameInMap("topicName")
    public String topicName;

    public static CreateConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupRequest self = new CreateConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupRequest setConsumeRetryPolicy(CreateConsumerGroupRequestConsumeRetryPolicy consumeRetryPolicy) {
        this.consumeRetryPolicy = consumeRetryPolicy;
        return this;
    }
    public CreateConsumerGroupRequestConsumeRetryPolicy getConsumeRetryPolicy() {
        return this.consumeRetryPolicy;
    }

    public CreateConsumerGroupRequest setDeliveryOrderType(String deliveryOrderType) {
        this.deliveryOrderType = deliveryOrderType;
        return this;
    }
    public String getDeliveryOrderType() {
        return this.deliveryOrderType;
    }

    public CreateConsumerGroupRequest setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
        return this;
    }
    public Boolean getExclusive() {
        return this.exclusive;
    }

    public CreateConsumerGroupRequest setMaxReceiveTps(Long maxReceiveTps) {
        this.maxReceiveTps = maxReceiveTps;
        return this;
    }
    public Long getMaxReceiveTps() {
        return this.maxReceiveTps;
    }

    public CreateConsumerGroupRequest setMessageModel(String messageModel) {
        this.messageModel = messageModel;
        return this;
    }
    public String getMessageModel() {
        return this.messageModel;
    }

    public CreateConsumerGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateConsumerGroupRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public static class CreateConsumerGroupRequestConsumeRetryPolicy extends TeaModel {
        /**
         * <p>The dead-letter topic.</p>
         * <p>If a consumer fails to consume a message and the message still failed after retries, the message is delivered to the dead-letter topic for subsequent business recovery or backtracking. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry and dead-letter messages</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>DLQ_mqtest</p>
         */
        @NameInMap("deadLetterTargetTopic")
        public String deadLetterTargetTopic;

        /**
         * <p>The fixed retry interval, in seconds. This parameter takes effect when the retry policy is set to FixedRetryPolicy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Concurrent delivery: 10 to 1800</li>
         * <li>Ordered delivery: 1 to 600</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("fixedIntervalRetryTime")
        public Integer fixedIntervalRetryTime;

        /**
         * <p>The maximum number of retry attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("maxRetryTimes")
        public Integer maxRetryTimes;

        /**
         * <p>The retry policy type. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Message retry</a>.</p>
         * <p>Valid parameter values:</p>
         * <ul>
         * <li>FixedRetryPolicy: fixed-interval retry, supported only for ordered delivery</li>
         * <li>DefaultRetryPolicy: progressive backoff retry, supported only for concurrent delivery</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DefaultRetryPolicy</p>
         */
        @NameInMap("retryPolicy")
        public String retryPolicy;

        public static CreateConsumerGroupRequestConsumeRetryPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateConsumerGroupRequestConsumeRetryPolicy self = new CreateConsumerGroupRequestConsumeRetryPolicy();
            return TeaModel.build(map, self);
        }

        public CreateConsumerGroupRequestConsumeRetryPolicy setDeadLetterTargetTopic(String deadLetterTargetTopic) {
            this.deadLetterTargetTopic = deadLetterTargetTopic;
            return this;
        }
        public String getDeadLetterTargetTopic() {
            return this.deadLetterTargetTopic;
        }

        public CreateConsumerGroupRequestConsumeRetryPolicy setFixedIntervalRetryTime(Integer fixedIntervalRetryTime) {
            this.fixedIntervalRetryTime = fixedIntervalRetryTime;
            return this;
        }
        public Integer getFixedIntervalRetryTime() {
            return this.fixedIntervalRetryTime;
        }

        public CreateConsumerGroupRequestConsumeRetryPolicy setMaxRetryTimes(Integer maxRetryTimes) {
            this.maxRetryTimes = maxRetryTimes;
            return this;
        }
        public Integer getMaxRetryTimes() {
            return this.maxRetryTimes;
        }

        public CreateConsumerGroupRequestConsumeRetryPolicy setRetryPolicy(String retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public String getRetryPolicy() {
            return this.retryPolicy;
        }

    }

}
