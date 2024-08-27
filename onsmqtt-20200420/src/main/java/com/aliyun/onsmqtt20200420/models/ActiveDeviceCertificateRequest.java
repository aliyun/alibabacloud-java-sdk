// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ActiveDeviceCertificateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>007269004887******</p>
     */
    @NameInMap("CaSn")
    public String caSn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>356217374433******</p>
     */
    @NameInMap("DeviceSn")
    public String deviceSn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
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
