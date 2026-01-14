// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateConsumerGroupRequest extends TeaModel {
    /**
     * <p>The new consumption retry policy of the consumer group. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry</a>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("consumeRetryPolicy")
    public UpdateConsumerGroupRequestConsumeRetryPolicy consumeRetryPolicy;

    /**
     * <p>The new message delivery method of the consumer group.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Concurrently: concurrent delivery</li>
     * <li>Orderly: ordered delivery</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Concurrently</p>
     */
    @NameInMap("deliveryOrderType")
    @Deprecated
    public String deliveryOrderType;

    /**
     * <p>The maximum number of messages that can be processed by consumers per second.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxReceiveTps")
    public Long maxReceiveTps;

    /**
     * <p>The new description of the consumer group.</p>
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

    @Deprecated
    public UpdateConsumerGroupRequest setDeliveryOrderType(String deliveryOrderType) {
        this.deliveryOrderType = deliveryOrderType;
        return this;
    }
    public String getDeliveryOrderType() {
        return this.deliveryOrderType;
    }

    public UpdateConsumerGroupRequest setMaxReceiveTps(Long maxReceiveTps) {
        this.maxReceiveTps = maxReceiveTps;
        return this;
    }
    public Long getMaxReceiveTps() {
        return this.maxReceiveTps;
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
         * <p>If a message still fails to be consumed after the maximum number of retries specified in the consumption retry policy is reached, the message is delivered to the dead-letter topic for subsequent business recovery or backtracking. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry and dead-letter messages</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>DLQ_mqtest</p>
         */
        @NameInMap("deadLetterTargetTopic")
        public String deadLetterTargetTopic;

        /**
         * <p>Fixed retry interval, unit: seconds.This option is effective when retryPolicy is FixedRetryPolicy.Value range：</p>
         * <ul>
         * <li>Concurrently:10-1800</li>
         * <li>Orderly:1-600</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("fixedIntervalRetryTime")
        public Integer fixedIntervalRetryTime;

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
         * <li>FixedRetryPolicy: fixed-interval retry. This value is valid only if you set deliveryOrderType to Orderly.</li>
         * <li>DefaultRetryPolicy: exponential backoff retry. This value is valid only if you set deliveryOrderType to Concurrently.</li>
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

        public UpdateConsumerGroupRequestConsumeRetryPolicy setFixedIntervalRetryTime(Integer fixedIntervalRetryTime) {
            this.fixedIntervalRetryTime = fixedIntervalRetryTime;
            return this;
        }
        public Integer getFixedIntervalRetryTime() {
            return this.fixedIntervalRetryTime;
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
