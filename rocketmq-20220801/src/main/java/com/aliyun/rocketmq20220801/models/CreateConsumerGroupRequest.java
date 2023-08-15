// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupRequest extends TeaModel {
    /**
     * <p>The consumption retry policy that you want to configure for the consumer group. For more information, see [Consumption retry](~~440356~~).</p>
     */
    @NameInMap("consumeRetryPolicy")
    public CreateConsumerGroupRequestConsumeRetryPolicy consumeRetryPolicy;

    /**
     * <p>The message delivery order of the consumer group.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Concurrently: concurrent delivery</p>
     * <p>*   Orderly: ordered delivery</p>
     */
    @NameInMap("deliveryOrderType")
    public String deliveryOrderType;

    /**
     * <p>The remarks on the consumer group.</p>
     */
    @NameInMap("remark")
    public String remark;

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

    public CreateConsumerGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public static class CreateConsumerGroupRequestConsumeRetryPolicy extends TeaModel {
        /**
         * <p>The dead-letter topic.</p>
         * <br>
         * <p>If a consumer still fails to consume a message after the message is retried for a specified number of times, the message is delivered to a dead-letter topic for subsequent business recovery or troubleshooting. For more information, see [Consumption retry and dead-letter messages](~~440356~~).</p>
         */
        @NameInMap("deadLetterTargetTopic")
        public String deadLetterTargetTopic;

        /**
         * <p>The maximum number of retries.</p>
         */
        @NameInMap("maxRetryTimes")
        public Integer maxRetryTimes;

        /**
         * <p>The retry policy. For more information, see [Message retry](~~440356~~).</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   FixedRetryPolicy: Failed messages are retried at a fixed interval.</p>
         * <p>*   DefaultRetryPolicy: Failed messages are retried at incremental intervals as the number of retries increases.</p>
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
