// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can view the instance ID in the **Basic Information** section on the **Instance Details** page that corresponds to the instance in the [ApsaraMQ for MQTT console](https://mqtt.console.aliyun.com).</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The topic to which you want to send a message on the ApsaraMQ for MQTT instance.</p>
     */
    @NameInMap("MqttTopic")
    public String mqttTopic;

    /**
     * <p>The message content, which is the payload of the message. We recommend that you encode the content in Base64 to prevent non-printable characters from being transmitted.</p>
     */
    @NameInMap("Payload")
    public String payload;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendMessageRequest setMqttTopic(String mqttTopic) {
        this.mqttTopic = mqttTopic;
        return this;
    }
    public String getMqttTopic() {
        return this.mqttTopic;
    }

    public SendMessageRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

}
