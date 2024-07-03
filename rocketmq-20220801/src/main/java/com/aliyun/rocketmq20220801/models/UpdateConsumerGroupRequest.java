// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateConsumerGroupRequest extends TeaModel {
    /**
     * <p>The new consumption retry policy that you want to configure for the consumer group. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry</a>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("consumeRetryPolicy")
    public UpdateConsumerGroupRequestConsumeRetryPolicy consumeRetryPolicy;

    /**
     * <p>The new message delivery order of the consumer group.</p>
     * <p>Valid values:</p>
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
     * <p>The new remarks on the consumer group.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the remark for test.</p>
     */
    @NameInMap("remark")
    public String remark;

    public static UpdateConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerGroupRequest self = new UpdateConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerGroupRequest setConsumeRetryPolicy(UpdateConsumerGroupRequestConsumeRetryPolicy consumeRetryPolicy) {
        this.consumeRetryPolicy = consumeRetryPolicy;
        return this;
    }
    public UpdateConsumerGroupRequestConsumeRetryPolicy getConsumeRetryPolicy() {
        return this.consumeRetryPolicy;
    }

    public UpdateConsumerGroupRequest setDeliveryOrderType(String deliveryOrderType) {
        this.deliveryOrderType = deliveryOrderType;
        return this;
    }
    public String getDeliveryOrderType() {
        return this.deliveryOrderType;
    }

    public UpdateConsumerGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public static class UpdateConsumerGroupRequestConsumeRetryPolicy extends TeaModel {
        /**
         * <p>The dead-letter topic.</p>
         * <p>If a consumer still fails to consume a message after the message is retried for a specified number of times, the message is delivered to a dead-letter topic for subsequent business recovery or troubleshooting. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry and dead-letter messages</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>DLQ_mqtest</p>
         */
        @NameInMap("deadLetterTargetTopic")
        public String deadLetterTargetTopic;

        /**
         * <p>The maximum number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("maxRetryTimes")
        public Integer maxRetryTimes;

        /**
         * <p>The retry policy. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Message retry</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>FixedRetryPolicy: Failed messages are retried at a fixed interval.</li>
         * <li>DefaultRetryPolicy: Failed messages are retried at incremental intervals as the number of retries increases.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DefaultRetryPolicy</p>
         */
        @NameInMap("retryPolicy")
        public String retryPolicy;

        public static UpdateConsumerGroupRequestConsumeRetryPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateConsumerGroupRequestConsumeRetryPolicy self = new UpdateConsumerGroupRequestConsumeRetryPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateConsumerGroupRequestConsumeRetryPolicy setDeadLetterTargetTopic(String deadLetterTargetTopic) {
            this.deadLetterTargetTopic = deadLetterTargetTopic;
            return this;
        }
        public String getDeadLetterTargetTopic() {
            return this.deadLetterTargetTopic;
        }

        public UpdateConsumerGroupRequestConsumeRetryPolicy setMaxRetryTimes(Integer maxRetryTimes) {
            this.maxRetryTimes = maxRetryTimes;
            return this;
        }
        public Integer getMaxRetryTimes() {
            return this.maxRetryTimes;
        }

        public UpdateConsumerGroupRequestConsumeRetryPolicy setRetryPolicy(String retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public String getRetryPolicy() {
            return this.retryPolicy;
        }

    }

}
