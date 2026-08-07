// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionRequest extends TeaModel {
    /**
     * <p>接入点</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-h964u01wh12.cn-hangzhou.rmq.aliyuncs.com:8080</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>事件订阅列表</p>
     */
    @NameInMap("EventSubscriptions")
    public java.util.List<String> eventSubscriptions;

    /**
     * <p>实例ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>MQ的实例ID</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-3g84vpf3712</p>
     */
    @NameInMap("MqInstanceId")
    public String mqInstanceId;

    /**
     * <p>消息队列类型</p>
     * 
     * <strong>example:</strong>
     * <p>ROCKET_MQ_4</p>
     */
    @NameInMap("MqType")
    public String mqType;

    /**
     * <p>田南+伽雷可斯</p>
     * 
     * <strong>example:</strong>
     * <p>pa44w0rd</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>生产者ID</p>
     * 
     * <strong>example:</strong>
     * <p>GID_123456</p>
     */
    @NameInMap("ProducerId")
    public String producerId;

    /**
     * <p>主题</p>
     * 
     * <strong>example:</strong>
     * <p>OUTBOUND_BOT_TOPIC</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>伽雷可斯</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionRequest self = new UpdateSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public UpdateSubscriptionRequest setEventSubscriptions(java.util.List<String> eventSubscriptions) {
        this.eventSubscriptions = eventSubscriptions;
        return this;
    }
    public java.util.List<String> getEventSubscriptions() {
        return this.eventSubscriptions;
    }

    public UpdateSubscriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSubscriptionRequest setMqInstanceId(String mqInstanceId) {
        this.mqInstanceId = mqInstanceId;
        return this;
    }
    public String getMqInstanceId() {
        return this.mqInstanceId;
    }

    public UpdateSubscriptionRequest setMqType(String mqType) {
        this.mqType = mqType;
        return this;
    }
    public String getMqType() {
        return this.mqType;
    }

    public UpdateSubscriptionRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateSubscriptionRequest setProducerId(String producerId) {
        this.producerId = producerId;
        return this;
    }
    public String getProducerId() {
        return this.producerId;
    }

    public UpdateSubscriptionRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public UpdateSubscriptionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
