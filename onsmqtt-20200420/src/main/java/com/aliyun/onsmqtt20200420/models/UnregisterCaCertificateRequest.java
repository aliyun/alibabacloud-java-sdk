// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UnregisterCaCertificateRequest extends TeaModel {
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    @NameInMap("Sn")
    public String sn;

    public static UnregisterCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UnregisterCaCertificateRequest self = new UnregisterCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public UnregisterCaCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public UnregisterCaCertificateRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
