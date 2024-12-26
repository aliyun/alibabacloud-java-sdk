// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerGroupLagResponseBody extends TeaModel {
    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>Topic.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetConsumerGroupLagResponseBodyData data;

    /**
     * <p>Dynamic error code</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter instanceId is mandatory for this action .</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F5764C40-FB8C-53AE-B95D-96AB3D0E9375</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetConsumerGroupLagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerGroupLagResponseBody self = new GetConsumerGroupLagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerGroupLagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConsumerGroupLagResponseBody setData(GetConsumerGroupLagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConsumerGroupLagResponseBodyData getData() {
        return this.data;
    }

    public GetConsumerGroupLagResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetConsumerGroupLagResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetConsumerGroupLagResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConsumerGroupLagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumerGroupLagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumerGroupLagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConsumerGroupLagResponseBodyDataTotalLag extends TeaModel {
        /**
         * <p>Delivery delay time, in seconds</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("deliveryDuration")
        public Long deliveryDuration;

        /**
         * <p>The number of messages being consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("inflightCount")
        public Long inflightCount;

        @NameInMap("lastConsumeTimestamp")
        public Long lastConsumeTimestamp;

        /**
         * <p>Ready message count</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("readyCount")
        public Long readyCount;

        public static GetConsumerGroupLagResponseBodyDataTotalLag build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerGroupLagResponseBodyDataTotalLag self = new GetConsumerGroupLagResponseBodyDataTotalLag();
            return TeaModel.build(map, self);
        }

        public GetConsumerGroupLagResponseBodyDataTotalLag setDeliveryDuration(Long deliveryDuration) {
            this.deliveryDuration = deliveryDuration;
            return this;
        }
        public Long getDeliveryDuration() {
            return this.deliveryDuration;
        }

        public GetConsumerGroupLagResponseBodyDataTotalLag setInflightCount(Long inflightCount) {
            this.inflightCount = inflightCount;
            return this;
        }
        public Long getInflightCount() {
            return this.inflightCount;
        }

        public GetConsumerGroupLagResponseBodyDataTotalLag setLastConsumeTimestamp(Long lastConsumeTimestamp) {
            this.lastConsumeTimestamp = lastConsumeTimestamp;
            return this;
        }
        public Long getLastConsumeTimestamp() {
            return this.lastConsumeTimestamp;
        }

        public GetConsumerGroupLagResponseBodyDataTotalLag setReadyCount(Long readyCount) {
            this.readyCount = readyCount;
            return this;
        }
        public Long getReadyCount() {
            return this.readyCount;
        }

    }

    public static class GetConsumerGroupLagResponseBodyData extends TeaModel {
        /**
         * <p>Consumer Group ID</p>
         * 
         * <strong>example:</strong>
         * <p>CID-TEST</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Region ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Backlog for each topic</p>
         */
        @NameInMap("topicLagMap")
        public java.util.Map<String, DataTopicLagMapValue> topicLagMap;

        /**
         * <p>Total lag count</p>
         */
        @NameInMap("totalLag")
        public GetConsumerGroupLagResponseBodyDataTotalLag totalLag;

        public static GetConsumerGroupLagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerGroupLagResponseBodyData self = new GetConsumerGroupLagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConsumerGroupLagResponseBodyData setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public GetConsumerGroupLagResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetConsumerGroupLagResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetConsumerGroupLagResponseBodyData setTopicLagMap(java.util.Map<String, DataTopicLagMapValue> topicLagMap) {
            this.topicLagMap = topicLagMap;
            return this;
        }
        public java.util.Map<String, DataTopicLagMapValue> getTopicLagMap() {
            return this.topicLagMap;
        }

        public GetConsumerGroupLagResponseBodyData setTotalLag(GetConsumerGroupLagResponseBodyDataTotalLag totalLag) {
            this.totalLag = totalLag;
            return this;
        }
        public GetConsumerGroupLagResponseBodyDataTotalLag getTotalLag() {
            return this.totalLag;
        }

    }

}
