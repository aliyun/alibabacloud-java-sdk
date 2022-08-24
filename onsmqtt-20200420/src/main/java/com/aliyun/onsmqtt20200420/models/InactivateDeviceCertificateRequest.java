// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class InactivateDeviceCertificateRequest extends TeaModel {
    @NameInMap("CaSn")
    public String caSn;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    public static InactivateDeviceCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        InactivateDeviceCertificateRequest self = new InactivateDeviceCertificateRequest();
        return TeaModel.build(map, self);
    }

    public InactivateDeviceCertificateRequest setCaSn(String caSn) {
        this.caSn = caSn;
        return this;
    }
    public String getCaSn() {
        return this.caSn;
    }

    public InactivateDeviceCertificateRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public InactivateDeviceCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

}
