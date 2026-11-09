// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteDeviceCertificateRequest extends TeaModel {
    /**
     * <p>The serial number of the CA certificate to which the device certificate belongs. The serial number uniquely identifies a CA certificate. The CA certificate is used to verify the validity of the device certificate. The value can be up to 128 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>007269004887******</p>
     */
    @NameInMap("CaSn")
    public String caSn;

    /**
     * <p>The serial number (SN) of the device certificate to delete. The SN uniquely identifies a device certificate. The value can be up to 128 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>356217374433****</p>
     */
    @NameInMap("DeviceSn")
    public String deviceSn;

    /**
     * <p>The ID of the instance to which the device certificate is bound, which is the instance ID of ApsaraMQ for MQTT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
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
