// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RegisterCaCertificateRequest extends TeaModel {
    @NameInMap("CaContent")
    public String caContent;

    @NameInMap("CaName")
    public String caName;

    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

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
