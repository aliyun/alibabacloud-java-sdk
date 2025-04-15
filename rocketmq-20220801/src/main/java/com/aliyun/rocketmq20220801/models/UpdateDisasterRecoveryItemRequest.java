// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateDisasterRecoveryItemRequest extends TeaModel {
    /**
     * <p>The topics involved in the topic mapping.</p>
     */
    @NameInMap("topics")
    public java.util.List<UpdateDisasterRecoveryItemRequestTopics> topics;

    public static UpdateDisasterRecoveryItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDisasterRecoveryItemRequest self = new UpdateDisasterRecoveryItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDisasterRecoveryItemRequest setTopics(java.util.List<UpdateDisasterRecoveryItemRequestTopics> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<UpdateDisasterRecoveryItemRequestTopics> getTopics() {
        return this.topics;
    }

    public static class UpdateDisasterRecoveryItemRequestTopics extends TeaModel {
        /**
         * <p>The ID of the consumer group. If you use the two-way backup mode, you must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_xxx</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The method used to deliver messages to the destination instance.</p>
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
        public String deliveryOrderType;

        /**
         * <p>The instance ID. If you set instanceType to EXTERNAL_ROCKETMQ, the system automatically generates an ID for the instance. You can obtain the ID by querying the global message backup plan.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-em93y94xxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>ALIYUN_ROCKETMQ: ApsaraMQ for RocketMQ instance</li>
         * <li>EXTERNAL_ROCKETMQ: open source RocketMQ cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_ROCKETMQ</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The topic name. You must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Topic_xxx</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static UpdateDisasterRecoveryItemRequestTopics build(java.util.Map<String, ?> map) throws Exception {
            UpdateDisasterRecoveryItemRequestTopics self = new UpdateDisasterRecoveryItemRequestTopics();
            return TeaModel.build(map, self);
        }

        public UpdateDisasterRecoveryItemRequestTopics setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public UpdateDisasterRecoveryItemRequestTopics setDeliveryOrderType(String deliveryOrderType) {
            this.deliveryOrderType = deliveryOrderType;
            return this;
        }
        public String getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        public UpdateDisasterRecoveryItemRequestTopics setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateDisasterRecoveryItemRequestTopics setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public UpdateDisasterRecoveryItemRequestTopics setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateDisasterRecoveryItemRequestTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

}
