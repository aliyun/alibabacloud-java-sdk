// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerGroupResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetConsumerGroupResponseBodyData data;

    @NameInMap("dynamicCode")
    public String dynamicCode;

    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetConsumerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerGroupResponseBody self = new GetConsumerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConsumerGroupResponseBody setData(GetConsumerGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConsumerGroupResponseBodyData getData() {
        return this.data;
    }

    public GetConsumerGroupResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetConsumerGroupResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetConsumerGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConsumerGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumerGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConsumerGroupResponseBodyDataConsumeRetryPolicy extends TeaModel {
        @NameInMap("deadLetterTargetTopic")
        public String deadLetterTargetTopic;

        @NameInMap("maxRetryTimes")
        public Integer maxRetryTimes;

        @NameInMap("retryPolicy")
        public String retryPolicy;

        public static GetConsumerGroupResponseBodyDataConsumeRetryPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerGroupResponseBodyDataConsumeRetryPolicy self = new GetConsumerGroupResponseBodyDataConsumeRetryPolicy();
            return TeaModel.build(map, self);
        }

        public GetConsumerGroupResponseBodyDataConsumeRetryPolicy setDeadLetterTargetTopic(String deadLetterTargetTopic) {
            this.deadLetterTargetTopic = deadLetterTargetTopic;
            return this;
        }
        public String getDeadLetterTargetTopic() {
            return this.deadLetterTargetTopic;
        }

        public GetConsumerGroupResponseBodyDataConsumeRetryPolicy setMaxRetryTimes(Integer maxRetryTimes) {
            this.maxRetryTimes = maxRetryTimes;
            return this;
        }
        public Integer getMaxRetryTimes() {
            return this.maxRetryTimes;
        }

        public GetConsumerGroupResponseBodyDataConsumeRetryPolicy setRetryPolicy(String retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public String getRetryPolicy() {
            return this.retryPolicy;
        }

    }

    public static class GetConsumerGroupResponseBodyData extends TeaModel {
        @NameInMap("consumeRetryPolicy")
        public GetConsumerGroupResponseBodyDataConsumeRetryPolicy consumeRetryPolicy;

        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("deliveryOrderType")
        public String deliveryOrderType;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("remark")
        public String remark;

        @NameInMap("status")
        public String status;

        @NameInMap("updateTime")
        public String updateTime;

        public static GetConsumerGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerGroupResponseBodyData self = new GetConsumerGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConsumerGroupResponseBodyData setConsumeRetryPolicy(GetConsumerGroupResponseBodyDataConsumeRetryPolicy consumeRetryPolicy) {
            this.consumeRetryPolicy = consumeRetryPolicy;
            return this;
        }
        public GetConsumerGroupResponseBodyDataConsumeRetryPolicy getConsumeRetryPolicy() {
            return this.consumeRetryPolicy;
        }

        public GetConsumerGroupResponseBodyData setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public GetConsumerGroupResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetConsumerGroupResponseBodyData setDeliveryOrderType(String deliveryOrderType) {
            this.deliveryOrderType = deliveryOrderType;
            return this;
        }
        public String getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        public GetConsumerGroupResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetConsumerGroupResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetConsumerGroupResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetConsumerGroupResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetConsumerGroupResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
