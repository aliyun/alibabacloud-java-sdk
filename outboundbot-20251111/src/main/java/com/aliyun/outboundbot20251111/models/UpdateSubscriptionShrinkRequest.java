// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionShrinkRequest extends TeaModel {
    /**
     * <p>The endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-h964u01wh12.cn-hangzhou.rmq.aliyuncs.com:8080</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The list of subscription items.</p>
     */
    @NameInMap("EventSubscriptions")
    public String eventSubscriptionsShrink;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance ID of the message queue.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-3g84vpf3712</p>
     */
    @NameInMap("MqInstanceId")
    public String mqInstanceId;

    /**
     * <p>The MSMQ type.</p>
     * 
     * <strong>example:</strong>
     * <p>ROCKET_MQ_4</p>
     */
    @NameInMap("MqType")
    public String mqType;

    /**
     * <p>The password.</p>
     * 
     * <strong>example:</strong>
     * <p>pa44w0rd</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The producer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_123456</p>
     */
    @NameInMap("ProducerId")
    public String producerId;

    /**
     * <p>The topic.</p>
     * 
     * <strong>example:</strong>
     * <p>OUTBOUND_BOT_TOPIC</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateSubscriptionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionShrinkRequest self = new UpdateSubscriptionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionShrinkRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public UpdateSubscriptionShrinkRequest setEventSubscriptionsShrink(String eventSubscriptionsShrink) {
        this.eventSubscriptionsShrink = eventSubscriptionsShrink;
        return this;
    }
    public String getEventSubscriptionsShrink() {
        return this.eventSubscriptionsShrink;
    }

    public UpdateSubscriptionShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSubscriptionShrinkRequest setMqInstanceId(String mqInstanceId) {
        this.mqInstanceId = mqInstanceId;
        return this;
    }
    public String getMqInstanceId() {
        return this.mqInstanceId;
    }

    public UpdateSubscriptionShrinkRequest setMqType(String mqType) {
        this.mqType = mqType;
        return this;
    }
    public String getMqType() {
        return this.mqType;
    }

    public UpdateSubscriptionShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateSubscriptionShrinkRequest setProducerId(String producerId) {
        this.producerId = producerId;
        return this;
    }
    public String getProducerId() {
        return this.producerId;
    }

    public UpdateSubscriptionShrinkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public UpdateSubscriptionShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
