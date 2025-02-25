// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RegisterCaCertificateRequest extends TeaModel {
    /**
     * <p>The content of the CA certificate that you want to register with an ApsaraMQ for MQTT broker.</p>
     * <blockquote>
     * <p>In the example, \n indicates a line feed.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----\nMIIDuzCCAqdGVzdC5jbi1xaW5n******\n-----END CERTIFICATE-----</p>
     */
    @NameInMap("CaContent")
    public String caContent;

    /**
     * <p>The name of the CA certificate that you want to register with an ApsaraMQ for MQTT broker.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt_ca</p>
     */
    @NameInMap("CaName")
    public String caName;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance to which you want to bind the CA certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    /**
     * <p>The content of the validation certificate issued by the CA certificate that you want to register with an ApsaraMQ for MQTT broker. The validation certificate must be used together with the registration code of the CA certificate to verify the private key of the CA certificate.</p>
     * <blockquote>
     * <p>In the example, \n indicates a line feed.</p>
     * </blockquote>
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
