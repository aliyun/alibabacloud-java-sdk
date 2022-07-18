// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetDeviceCertificateRequest extends TeaModel {
    @NameInMap("CaSn")
    public String caSn;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    public static GetDeviceCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCertificateRequest self = new GetDeviceCertificateRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceCertificateRequest setCaSn(String caSn) {
        this.caSn = caSn;
        return this;
    }
    public String getCaSn() {
        return this.caSn;
    }

    public GetDeviceCertificateRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public GetDeviceCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

}
