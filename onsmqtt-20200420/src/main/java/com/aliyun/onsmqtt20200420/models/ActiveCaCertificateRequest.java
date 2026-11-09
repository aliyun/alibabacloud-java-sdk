// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ActiveCaCertificateRequest extends TeaModel {
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
     * <p>The serial number (SN) of the CA certificate to be activated. The SN uniquely identifies a CA certificate. The value can be up to 128 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>007269004887******</p>
     */
    @NameInMap("Sn")
    public String sn;

    public static ActiveCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveCaCertificateRequest self = new ActiveCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ActiveCaCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public ActiveCaCertificateRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
