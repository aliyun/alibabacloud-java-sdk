// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class InactivateDeviceCertificateRequest extends TeaModel {
    /**
     * <p>The SN of the CA certificate to which the device certificate belongs. The SN uniquely identifies a CA certificate.</p>
     * <p>The value can be up to 128 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>007269004887******</p>
     */
    @NameInMap("CaSn")
    public String caSn;

    /**
     * <p>The serial number (SN) of the device certificate that you want to inactivate. The SN uniquely identifies a device certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>356217374433******</p>
     */
    @NameInMap("DeviceSn")
    public String deviceSn;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance to which the device certificate is attached.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
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
