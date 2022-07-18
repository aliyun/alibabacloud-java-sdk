// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ActiveDeviceCertificateRequest extends TeaModel {
    @NameInMap("CaSn")
    public String caSn;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    public static ActiveDeviceCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveDeviceCertificateRequest self = new ActiveDeviceCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ActiveDeviceCertificateRequest setCaSn(String caSn) {
        this.caSn = caSn;
        return this;
    }
    public String getCaSn() {
        return this.caSn;
    }

    public ActiveDeviceCertificateRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public ActiveDeviceCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

}
