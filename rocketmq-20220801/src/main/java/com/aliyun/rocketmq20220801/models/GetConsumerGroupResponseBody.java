// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerGroupResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidConsumerGroupId</p>
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
     * 
     * <strong>example:</strong>
     * <p>ConsumerGroupId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>consumerGroupId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter consumerGroupId is invalid.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7F94090-3358-506A-97DC-34BC803C****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The retry policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>FixedRetryPolicy</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>Failed messages are retried at a fixed interval</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>DefaultRetryPolicy</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>Failed messages are retried at incremental intervals as the number of retries increases</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DefaultRetryPolicy</p>
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
         * <p>The consumption retry policy that you want to configure for the consumer group. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry</a>.</p>
         */
        @NameInMap("consumeRetryPolicy")
        public GetConsumerGroupResponseBodyDataConsumeRetryPolicy consumeRetryPolicy;

        /**
         * <p>The ID of the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>CID-TEST</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The time when the consumer group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The message delivery order of the consumer group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Concurrently</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>concurrent delivery</p>
         * <!-- -->
         * </li>
         * <li><p>Orderly</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>ordered delivery</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Concurrently</p>
         */
        @NameInMap("deliveryOrderType")
        public String deliveryOrderType;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The remarks on the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>This is the remark for test.</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>The state of the consumer group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>RUNNING</p>
         * <!-- -->
         * 
         * <p>: The consumer group is</p>
         * <!-- -->
         * 
         * <p>running</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>CREATING</p>
         * <!-- -->
         * 
         * <p>: The consumer group is</p>
         * <!-- -->
         * 
         * <p>being created</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the consumer group was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
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
