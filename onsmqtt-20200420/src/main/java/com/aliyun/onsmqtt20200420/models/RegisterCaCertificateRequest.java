// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RegisterCaCertificateRequest extends TeaModel {
    /**
     * <p>Content of the CA certificate to be registered.</p>
     * <blockquote>
     * <p>Note that \n in the example represents a new line.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----\nMIIDuzCCAqdGVzdC5jbi1xaW5n******\n-----END CERTIFICATE-----</p>
     */
    @NameInMap("CaContent")
    public String caContent;

    /**
     * <p>Name of the CA certificate to be registered</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt_ca</p>
     */
    @NameInMap("CaName")
    public String caName;

    /**
     * <p>The instance ID of the Cloud Message Queue MQTT version. When registering a CA certificate, you need to specify an instance to bind with.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-7mz2d******</p>
     */
    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    /**
     * <p>Content of the verification certificate for the CA certificate to be registered. It is used together with the registration code of the CA certificate to verify that the user possesses the private key of this CA certificate. </p>
     * <blockquote>
     * <p> in the example represents a line break.</p>
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
