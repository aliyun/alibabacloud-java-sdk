// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetDisasterRecoveryItemResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if the access is denied because the Resource Access Management (RAM) user does not have the required permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetDisasterRecoveryItemResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
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
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AF9A8B10-C426-530F-A0DD-96320B39****</p>
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

    public static GetDisasterRecoveryItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDisasterRecoveryItemResponseBody self = new GetDisasterRecoveryItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDisasterRecoveryItemResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetDisasterRecoveryItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDisasterRecoveryItemResponseBody setData(GetDisasterRecoveryItemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDisasterRecoveryItemResponseBodyData getData() {
        return this.data;
    }

    public GetDisasterRecoveryItemResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetDisasterRecoveryItemResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetDisasterRecoveryItemResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDisasterRecoveryItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDisasterRecoveryItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDisasterRecoveryItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDisasterRecoveryItemResponseBodyDataTopics extends TeaModel {
        /**
         * <p>The consumer group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx_reserve_group</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The order in which messages are delivered to the target instance. The parameter values ​​are as follows:</p>
         * <ul>
         * <li>Concurrently: concurrent delivery</li>
         * <li>Orderly: sequential delivery</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Concurrently</p>
         */
        @NameInMap("deliveryOrderType")
        public String deliveryOrderType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-wwo3xxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Instance type</p>
         * <ul>
         * <li>ALIYUN_ROCKETMQ: Alibaba Cloud instance</li>
         * <li>EXTERNAL_ROCKETMQ: External instance, open-source instance, open-source cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_ROCKETMQ</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>regionId</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>order_push_xxx</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static GetDisasterRecoveryItemResponseBodyDataTopics build(java.util.Map<String, ?> map) throws Exception {
            GetDisasterRecoveryItemResponseBodyDataTopics self = new GetDisasterRecoveryItemResponseBodyDataTopics();
            return TeaModel.build(map, self);
        }

        public GetDisasterRecoveryItemResponseBodyDataTopics setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public GetDisasterRecoveryItemResponseBodyDataTopics setDeliveryOrderType(String deliveryOrderType) {
            this.deliveryOrderType = deliveryOrderType;
            return this;
        }
        public String getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        public GetDisasterRecoveryItemResponseBodyDataTopics setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDisasterRecoveryItemResponseBodyDataTopics setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetDisasterRecoveryItemResponseBodyDataTopics setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetDisasterRecoveryItemResponseBodyDataTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class GetDisasterRecoveryItemResponseBodyData extends TeaModel {
        /**
         * <p>The time when the topic mapping task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-24 02:57:31</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Additional Information</p>
         */
        @NameInMap("extInfo")
        public java.util.Map<String, String> extInfo;

        /**
         * <p>The ID of the topic mapping</p>
         * 
         * <strong>example:</strong>
         * <p>100070284</p>
         */
        @NameInMap("itemId")
        public Long itemId;

        /**
         * <p>The topic mapping task status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("itemStatus")
        public String itemStatus;

        /**
         * <p>The ID of the global message backup plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1300000016</p>
         */
        @NameInMap("planId")
        public Long planId;

        /**
         * <p>Topics included in the backup mapping</p>
         */
        @NameInMap("topics")
        public java.util.List<GetDisasterRecoveryItemResponseBodyDataTopics> topics;

        /**
         * <p>The time when the topic mapping task was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-26 02:13:10</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static GetDisasterRecoveryItemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDisasterRecoveryItemResponseBodyData self = new GetDisasterRecoveryItemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDisasterRecoveryItemResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDisasterRecoveryItemResponseBodyData setExtInfo(java.util.Map<String, String> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        public GetDisasterRecoveryItemResponseBodyData setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public GetDisasterRecoveryItemResponseBodyData setItemStatus(String itemStatus) {
            this.itemStatus = itemStatus;
            return this;
        }
        public String getItemStatus() {
            return this.itemStatus;
        }

        public GetDisasterRecoveryItemResponseBodyData setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public GetDisasterRecoveryItemResponseBodyData setTopics(java.util.List<GetDisasterRecoveryItemResponseBodyDataTopics> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<GetDisasterRecoveryItemResponseBodyDataTopics> getTopics() {
            return this.topics;
        }

        public GetDisasterRecoveryItemResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
