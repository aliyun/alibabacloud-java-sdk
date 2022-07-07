// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetCaCertificateRequest extends TeaModel {
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    @NameInMap("Sn")
    public String sn;

    public static GetCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCaCertificateRequest self = new GetCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public GetCaCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public GetCaCertificateRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
