// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateConsumerGroupRequest extends TeaModel {
    @NameInMap("consumeRetryPolicy")
    public UpdateConsumerGroupRequestConsumeRetryPolicy consumeRetryPolicy;

    @NameInMap("deliveryOrderType")
    public String deliveryOrderType;

    @NameInMap("remark")
    public String remark;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

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

    public UpdateConsumerGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class UpdateConsumerGroupRequestConsumeRetryPolicy extends TeaModel {
        @NameInMap("maxRetryTimes")
        public Integer maxRetryTimes;

        @NameInMap("retryPolicy")
        public String retryPolicy;

        public static UpdateConsumerGroupRequestConsumeRetryPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateConsumerGroupRequestConsumeRetryPolicy self = new UpdateConsumerGroupRequestConsumeRetryPolicy();
            return TeaModel.build(map, self);
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
