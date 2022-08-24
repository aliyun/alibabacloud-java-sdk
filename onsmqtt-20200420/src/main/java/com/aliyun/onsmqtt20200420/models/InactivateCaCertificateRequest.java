// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class InactivateCaCertificateRequest extends TeaModel {
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    @NameInMap("Sn")
    public String sn;

    public static InactivateCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        InactivateCaCertificateRequest self = new InactivateCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public InactivateCaCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public InactivateCaCertificateRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
