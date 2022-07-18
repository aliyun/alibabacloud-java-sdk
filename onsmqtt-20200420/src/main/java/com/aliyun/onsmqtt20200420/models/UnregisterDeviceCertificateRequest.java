// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UnregisterDeviceCertificateRequest extends TeaModel {
    @NameInMap("CaSn")
    public String caSn;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    public static UnregisterDeviceCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UnregisterDeviceCertificateRequest self = new UnregisterDeviceCertificateRequest();
        return TeaModel.build(map, self);
    }

    public UnregisterDeviceCertificateRequest setCaSn(String caSn) {
        this.caSn = caSn;
        return this;
    }
    public String getCaSn() {
        return this.caSn;
    }

    public UnregisterDeviceCertificateRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public UnregisterDeviceCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

}
