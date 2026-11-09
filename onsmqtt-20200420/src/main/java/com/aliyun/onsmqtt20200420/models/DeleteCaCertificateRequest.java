// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteCaCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the instance to which the CA certificate is bound, which is the instance ID of ApsaraMQ for MQTT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    /**
     * <p>The serial number (SN) of the CA certificate to delete. The SN uniquely identifies a CA certificate. The value cannot exceed 128 bytes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>007269004887******</p>
     */
    @NameInMap("Sn")
    public String sn;

    public static DeleteCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCaCertificateRequest self = new DeleteCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCaCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public DeleteCaCertificateRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
