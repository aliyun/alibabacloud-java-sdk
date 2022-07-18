// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteDeviceCertificateRequest extends TeaModel {
    @NameInMap("CaSn")
    public String caSn;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    public static DeleteDeviceCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceCertificateRequest self = new DeleteDeviceCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceCertificateRequest setCaSn(String caSn) {
        this.caSn = caSn;
        return this;
    }
    public String getCaSn() {
        return this.caSn;
    }

    public DeleteDeviceCertificateRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public DeleteDeviceCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

}
