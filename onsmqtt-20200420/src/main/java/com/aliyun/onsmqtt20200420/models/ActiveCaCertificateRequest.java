// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ActiveCaCertificateRequest extends TeaModel {
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    @NameInMap("Sn")
    public String sn;

    public static ActiveCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveCaCertificateRequest self = new ActiveCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ActiveCaCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public ActiveCaCertificateRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
