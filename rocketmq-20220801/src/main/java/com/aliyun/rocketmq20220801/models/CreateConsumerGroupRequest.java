// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupRequest extends TeaModel {
    @NameInMap("consumeRetryPolicy")
    public CreateConsumerGroupRequestConsumeRetryPolicy consumeRetryPolicy;

    @NameInMap("deliveryOrderType")
    public String deliveryOrderType;

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
        @NameInMap("deadLetterTargetTopic")
        public String deadLetterTargetTopic;

        @NameInMap("maxRetryTimes")
        public Integer maxRetryTimes;

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
