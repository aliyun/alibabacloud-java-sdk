// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerGroupResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The result data that is returned.</p>
     */
    @NameInMap("data")
    public GetConsumerGroupResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     */
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
        /**
         * <p>The dead-letter topic.</p>
         * <br>
         * <p>If a consumer still fails to consume a message after the message is retried for a specified number of times, the message is delivered to a dead-letter topic for subsequent business recovery or troubleshooting. For more information, see [Consumption retry and dead-letter messages](https://help.aliyun.com/document_detail/440356.html).</p>
         */
        @NameInMap("deadLetterTargetTopic")
        public String deadLetterTargetTopic;

        /**
         * <p>The maximum number of retries.</p>
         */
        @NameInMap("maxRetryTimes")
        public Integer maxRetryTimes;

        /**
         * <p>The retry policy.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   FixedRetryPolicy</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    Failed messages are retried at a fixed interval</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   DefaultRetryPolicy</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    Failed messages are retried at incremental intervals as the number of retries increases</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
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
        /**
         * <p>The consumption retry policy that you want to configure for the consumer group. For more information, see [Consumption retry](https://help.aliyun.com/document_detail/440356.html).</p>
         */
        @NameInMap("consumeRetryPolicy")
        public GetConsumerGroupResponseBodyDataConsumeRetryPolicy consumeRetryPolicy;

        /**
         * <p>The ID of the consumer group.</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The time when the consumer group was created.</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The message delivery order of the consumer group.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Concurrently</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    concurrent delivery</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Orderly</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    ordered delivery</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("deliveryOrderType")
        public String deliveryOrderType;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The remarks on the consumer group.</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>The state of the consumer group.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RUNNING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    : The consumer group is</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    running</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   CREATING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    : The consumer group is</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    being created</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the consumer group was last updated.</p>
         */
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
