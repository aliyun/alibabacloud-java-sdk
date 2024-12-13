// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteDeviceCertificateRequest extends TeaModel {
    /**
     * <p>The serial number of the CA certificate to which the device certificate belongs. The serial number is the unique identifier of a CA certificate. CA certificates are used to validate device certificates.</p>
     * <p>The serial number of a CA certificate cannot exceed 128 bytes in size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>007269004887******</p>
     */
    @NameInMap("CaSn")
    public String caSn;

    /**
     * <p>The serial number of the device certificate whose registration information you want to delete. The serial number is the unique identifier of a device.</p>
     * <p>The serial number of a device certificate cannot exceed 128 bytes in size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>356217374433****</p>
     */
    @NameInMap("DeviceSn")
    public String deviceSn;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance to which the device certificate is bound.</p>
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
