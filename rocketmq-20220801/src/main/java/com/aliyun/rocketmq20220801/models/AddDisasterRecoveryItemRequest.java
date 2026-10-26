// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class AddDisasterRecoveryItemRequest extends TeaModel {
    /**
     * <p>The topics included in the backup mapping. Required.</p>
     */
    @NameInMap("topics")
    public java.util.List<AddDisasterRecoveryItemRequestTopics> topics;

    public static AddDisasterRecoveryItemRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDisasterRecoveryItemRequest self = new AddDisasterRecoveryItemRequest();
        return TeaModel.build(map, self);
    }

    public AddDisasterRecoveryItemRequest setTopics(java.util.List<AddDisasterRecoveryItemRequestTopics> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<AddDisasterRecoveryItemRequestTopics> getTopics() {
        return this.topics;
    }

    public static class AddDisasterRecoveryItemRequestTopics extends TeaModel {
        /**
         * <p>The ID of the consumer group. Required for ACTIVE_ACTIVE bidirectional backup.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_xxx</p>
         */
        @NameInMap("consumerGroupId")
        @Deprecated
        public String consumerGroupId;

        /**
         * <p>The delivery order of messages to the target instance. Valid values for the parameter:</p>
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
         * <p>The instance ID. If instanceType is set to EXTERNAL_ROCKETMQ, an instance ID is automatically generated. You can obtain this ID by querying the backup plan.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-em93y94xxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>ALIYUN_ROCKETMQ: Alibaba Cloud instance</li>
         * <li>EXTERNAL_ROCKETMQ: external instance, open-source instance, or open-source cluster</li>
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
         * <p>The name of the disaster recovery topic. Required.</p>
         * 
         * <strong>example:</strong>
         * <p>Topic_xxx</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static AddDisasterRecoveryItemRequestTopics build(java.util.Map<String, ?> map) throws Exception {
            AddDisasterRecoveryItemRequestTopics self = new AddDisasterRecoveryItemRequestTopics();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public AddDisasterRecoveryItemRequestTopics setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public AddDisasterRecoveryItemRequestTopics setDeliveryOrderType(String deliveryOrderType) {
            this.deliveryOrderType = deliveryOrderType;
            return this;
        }
        public String getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        public AddDisasterRecoveryItemRequestTopics setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddDisasterRecoveryItemRequestTopics setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public AddDisasterRecoveryItemRequestTopics setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public AddDisasterRecoveryItemRequestTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

}
