// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RegisterCaCertificateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----\nMIIDuzCCAqdGVzdC5jbi1xaW5n******\n-----END CERTIFICATE-----</p>
     */
    @NameInMap("CaContent")
    public String caContent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt_ca</p>
     */
    @NameInMap("CaName")
    public String caName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----\nMIID/DCCAu+Y5sRMpp9tnd+4s******\n-----END CERTIFICATE-----</p>
     */
    @NameInMap("VerificationContent")
    public String verificationContent;

    public static RegisterCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterCaCertificateRequest self = new RegisterCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public RegisterCaCertificateRequest setCaContent(String caContent) {
        this.caContent = caContent;
        return this;
    }
    public String getCaContent() {
        return this.caContent;
    }

    public RegisterCaCertificateRequest setCaName(String caName) {
        this.caName = caName;
        return this;
    }
    public String getCaName() {
        return this.caName;
    }

    public RegisterCaCertificateRequest setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public RegisterCaCertificateRequest setVerificationContent(String verificationContent) {
        this.verificationContent = verificationContent;
        return this;
    }
    public String getVerificationContent() {
        return this.verificationContent;
    }

}
