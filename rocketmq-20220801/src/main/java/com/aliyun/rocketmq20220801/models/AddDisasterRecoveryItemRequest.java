// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class AddDisasterRecoveryItemRequest extends TeaModel {
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
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        @NameInMap("deliveryOrderType")
        public String deliveryOrderType;

        @NameInMap("instanceId")
        public String instanceId;

        /**
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

        @NameInMap("topicName")
        public String topicName;

        public static AddDisasterRecoveryItemRequestTopics build(java.util.Map<String, ?> map) throws Exception {
            AddDisasterRecoveryItemRequestTopics self = new AddDisasterRecoveryItemRequestTopics();
            return TeaModel.build(map, self);
        }

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
