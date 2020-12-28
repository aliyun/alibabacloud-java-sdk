// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    @NameInMap("MqttTopic")
    public String mqttTopic;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Payload")
    public String payload;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setMqttTopic(String mqttTopic) {
        this.mqttTopic = mqttTopic;
        return this;
    }
    public String getMqttTopic() {
        return this.mqttTopic;
    }

    public SendMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendMessageRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

}
