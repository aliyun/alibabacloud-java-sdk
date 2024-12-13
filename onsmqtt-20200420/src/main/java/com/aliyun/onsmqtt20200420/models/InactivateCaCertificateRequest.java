// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class InactivateCaCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for MQTT instance to which the CA certificate is bound.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    /**
     * <p>The serial number of the CA certificate that you want to deregister. The serial number is the unique identifier of a CA certificate.</p>
     * <p>The serial number of a CA certificate cannot exceed 128 bytes in size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>007269004887******</p>
     */
    @NameInMap("Sn")
    public String sn;

    public static InactivateCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        InactivateCaCertificateRequest self = new InactivateCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public InactivateCaCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public InactivateCaCertificateRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
